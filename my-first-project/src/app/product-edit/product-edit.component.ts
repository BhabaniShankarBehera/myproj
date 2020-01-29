import { Component, OnInit } from '@angular/core';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';  
import { ActivatedRoute, Router } from '@angular/router';  
import { ProductsService } from '../products.service';  
@Component({  
  selector: 'app-product-edit',  
  templateUrl: './product-edit.component.html',  
  styleUrls: ['./product-edit.component.css']  
})  
export class ProductEditComponent implements OnInit {  
 angForm: FormGroup;  
 product: any = {};  
 data: any;
  constructor(private route: ActivatedRoute, private router: Router, private ps: ProductsService, private fb: FormBuilder) {  
      this.createForm();  
 }  
  createForm() {  
    this.angForm = this.fb.group({  
      productName: ['', Validators.required ],  
      productDescription: ['', Validators.required ],  
      productPrice: ['', Validators.required ]  
    });  
  }  
  ngOnInit() {  
    this.route.params.subscribe(params => {  
        this.ps.getProductById(params['id']).subscribe((resp :any) => {  
          this.product = resp.data;  
      });  
    });  
  }

  updateProduct(productName, productDescription, productPrice, id) {    
    this.ps.updateProduct(productName, productDescription, productPrice,id)
    .subscribe((resp : any) => {
      this.data=resp.data
          this.ps.getProductById(id).subscribe((resp :any) => {  
            this.product = resp.data;
            this.router.navigate(['products']);  
        }); 
    });  
  } 

    

}