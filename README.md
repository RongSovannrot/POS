# POS

In our system, we set all attributes in each class to `private`.  
The purpose is to protect the data, so that other classes cannot access or change the values directly.

For example, if `productId` in the `Product` class was `public`, then the `Order` class (or any other class) could directly change it like this:

    product.productId = 999; 

This can cause serious problems, like giving the wrong ID to a product.

Instead, we use `getter` and `setter` methods (like `getProductId()` or `setProductId(int id)`), which are `public`.  
Other classes can use these methods to safely access or update values with control.

For example:
- To get a product's ID: `product.getProductId();`
- To set a product's ID: `product.setProductId(101);`

