package com.User.DAOImpl;

import com.User.DAO.Product;
import com.User.DAOModel.ProductModel;

public class ProductImplementation implements Product
{

	ProductModel pd=new ProductModel();
	@Override
	public void addProduct() {
		
		System.out.println("AddProduct::"+pd.getPname());
		
	}

	@Override
	public void viewProduct() {
		System.out.println("ViewProduct::"+pd.getPprice());
		
	}

}
