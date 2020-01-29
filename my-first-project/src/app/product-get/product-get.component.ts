import { Component, OnInit } from '@angular/core';
import { ProductsService } from '../products.service'; 
import Product from '../Product';  

@Component({
  selector: 'app-product-get',
  templateUrl: './product-get.component.html',
  styleUrls: ['./product-get.component.css']
})
export class ProductGetComponent implements OnInit {
  data: any;
  products :Product[];
  constructor(private ps: ProductsService) { }

  ngOnInit() {
    this.ps.getProduct()
      .subscribe((resp :any) => {
        this.products = resp.data;
      });    
  }
  deleteProduct(id) {  
    this.ps.deleteProduct(id).subscribe(res => {  
      this.ps.getProduct()
      .subscribe((resp :any) => {
        this.products = resp.data;
      }); 
    });  
}

  
}
