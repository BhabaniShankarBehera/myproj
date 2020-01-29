import { Component, OnInit } from '@angular/core';
import { FormGroup,  FormBuilder,  Validators } from '@angular/forms';
import { ProductsService } from '../products.service'; 
import { ActivatedRoute, Router } from '@angular/router';  
@Component({
  selector: 'app-product-add',
  templateUrl: './product-add.component.html',
  styleUrls: ['./product-add.component.css']
})
export class ProductAddComponent implements OnInit {

  
  angForm: FormGroup;  
  data: any;
  constructor(private route: ActivatedRoute, private router: Router, private fb: FormBuilder, private ps: ProductsService) {  
    this.createForm();  
  }  
  createForm() {  
    this.angForm = this.fb.group({  
      productName: ['', Validators.required ],  
      productDescription: ['', Validators.required ],  
      productPrice: ['', Validators.required ]  
    });  
  }  
  addProduct(productName, productDescription, productPrice) {  
   this.ps.addProduct(productName, productDescription, productPrice)
    .subscribe((resp : any) => this.data=resp.data);  
    this.router.navigate(['products']);  
  }  
  ngOnInit() {
  }

}
