import com.User.DAOImpl.ProductImplementation;
import com.User.DAOModel.ProductModel;

public class MainProcess {

	public static void main(String[] args) {
		
		
		
//		ProductModel pd=new ProductModel();
//		pd.setPname("apple");
//		pd.setPprice(100);
		
		ProductImplementation pd1=new ProductImplementation();
		pd1.addProduct();
		pd1.viewProduct();

	}

}
