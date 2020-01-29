import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';  
import { environment } from '../environments/environment';

@Injectable({
  providedIn: 'root'
})
export class ProductsService {

  constructor(private http: HttpClient) { }

  addProduct(productName, productDescription, productPrice) {  
    const obj = {  
      productName,  
      productDescription,  
      productPrice  
    }; 
    return this.http.post(environment.addProductPath, obj); 
  }
  getProduct() { 
    return this.http.get(environment.getProductPath);
        
  }  
  getProductById(id) { 
    return this.http.get(environment.getProductByIdPath+id);
        
  }    
  updateProduct(productName, productDescription, productPrice,id){
    const obj = {  
      id,
      productName,  
      productDescription,  
      productPrice  
    }; 
    return this.http.put(environment.updateProductPath+id, obj); 
  }

  deleteProduct(id) { 
    return this.http.delete(environment.deleteProductPath+id);
        
  } 
}
