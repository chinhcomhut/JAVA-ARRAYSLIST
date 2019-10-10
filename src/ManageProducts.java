import java.util.ArrayList;

public class ManageProducts {
  ArrayList<Products> manageProduct = new ArrayList<>();
  public void displayProduct(){
      for (int i=0; i< manageProduct.size();i++){
          getInfoProduct(i);
      }
  }
public void addNewProduct(int id, String name, float price, String description){
      Products products = new Products(id,name,price,description);
      manageProduct.add(products);
}


public void editProduct(int index, Products newProduct){
      manageProduct.set(index,newProduct);
}

public void removeProduct(int index){

      manageProduct.remove(index);
}
    public void searchProduct(String name) {
        for (int i = 0; i < manageProduct.size(); i++) {
            boolean isCheckName = manageProduct.get(i).getName() == name;
            if (isCheckName) {
                getInfoProduct(i);
            }
        }
    }
    private void getInfoProduct(int i) {
        System.out.println("Info Product "+i+" : ");
        System.out.println("Id: "+ manageProduct.get(i).getName());
        System.out.println("Price: "+manageProduct.get(i).getPrice());
        System.out.println("Description: "+manageProduct.get(i).getDescription()+"\n");
    }
}
