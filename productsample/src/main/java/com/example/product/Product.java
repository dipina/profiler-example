package com.example.product;

import java.io.File;

import com.example.product.util.ProductCatalog;

public class Product {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		if(args.length == 0)
		{
			System.out.println("enter catalog location in this form x:\\path\\Product");
			return;
		}
		
		try {
			System.in.read();
		} catch (Exception e) {
			e.printStackTrace();
		}

		Product catalog = new Product();
		catalog.readCatalogFromFolder(args[0]);
		
		try {
			System.in.read();
			System.in.read();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void readCatalogFromFolder(String name) {
		
		if(name == null)
		{
			System.out.println("invalid folder name");
			return;
		}
		
		File file = new File(name);
		if(!file.exists() || !file.isDirectory())
		{
			System.out.println("invalid folder name " + name);
			return;
		}
		
		ProductCatalog info = new ProductCatalog();
		info.readData(name);
		
		System.out.println(info.getContent());
		
	}

}
