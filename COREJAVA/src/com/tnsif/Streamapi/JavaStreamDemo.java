package com.tnsif.Streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class JavaStreamDemo {
	public static void main(String[] args) {
		List<Product> pl=new ArrayList<Product>();
		pl.add(new Product(1,"hp laptop",450000));
		pl.add(new Product(2,"dell laptop",550000));
		pl.add(new Product(3,"some other laptop",750000));
		
		List<Float> pl2=pl.stream().filter(p->p.price<500000)//filter is called to filter the data,once data id filtered we need to collect the data
                   .map(p->p.price)
                   .collect(Collectors.toList());
		
		System.out.println(pl2);
		//using collectors to get sum of prices
		double totalprice=pl.stream().collect(Collectors.summingDouble(Product->Product.price));

		System.out.println(totalprice);
		
		//finding max and min
		Product p=pl.stream().max((Product1,Product2)->Product1.price>Product2.price?1:-1).get();
		System.out.println(p.price);
		
	}

}
