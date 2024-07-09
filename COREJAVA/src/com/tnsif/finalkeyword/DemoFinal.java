package com.tnsif.finalkeyword;

public class DemoFinal extends FinalDemo{
@Override
final void change() {//final method cannot be overridden,thats why there is an error
	System.out.println("welocme");
}

}
