// This file can be replaced during build by using the `fileReplacements` array.
// `ng build --prod` replaces `environment.ts` with `environment.prod.ts`.
// The list of file replacements can be found in `angular.json`.
export const url= 'http://domain2.com';
export const environment = {
  production: false,
  addProductPath: url+'/api/v1/products',
  getProductPath: url+'/api/v1/getproducts',
  getProductByIdPath: url+'/api/v1/getproduct?id=',
  updateProductPath: url+'/api/v1/updateproduct?id=',
  deleteProductPath: url+'/api/v1/deleteproduct?id='
};

/*
 * For easier debugging in development mode, you can import the following file
 * to ignore zone related error stack frames such as `zone.run`, `zoneDelegate.invokeTask`.
 *
 * This import should be commented out in production mode because it will have a negative impact
 * on performance if an error is thrown.
 */
// import 'zone.js/dist/zone-error';  // Included with Angular CLI.

