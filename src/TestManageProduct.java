public class TestManageProduct {
    public static void main(String[] args) {
        ManageProducts manageProduct = new ManageProducts();
// ADD Thêm vào Products//
        manageProduct.addNewProduct(0,"IphoneX",1100,"very nice");
        manageProduct.addNewProduct(1,"Xiaomi Mimix 2S",800,"Good price");
        manageProduct.addNewProduct(2, "NOKIA ",1100, "Kinh Vai");
        manageProduct.addNewProduct(3,"OPPO", 5500, "DEP VAI");
//EDIT Products//
        Products newProduct = new Products(0,"BK PHONE", 700,"VERY GOOD");
        manageProduct.editProduct(0,newProduct);
//Remove Products//
        manageProduct.removeProduct(1);

      manageProduct.displayProduct();
      // SEACH PRODUCTS
        manageProduct.searchProduct("BK PHONE");
//        manageProduct.searchProduct("Xiaomi Mimix 2S");

    }
}
