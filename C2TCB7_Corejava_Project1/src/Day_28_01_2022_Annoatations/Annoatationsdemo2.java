package Day_28_01_2022_Annoatations;

import java.lang.annotation.Annotation;

@SmartPhone(os = "Android", version = 6)
class Nokia_Series {
	String model;
	int screensize;

	public Nokia_Series(String model, int screensize) {

		this.model = model;
		this.screensize = screensize;
	}

}

public class Annoatationsdemo2 {

	public static void main(String[] arg) {
		Nokia_Series obj = new Nokia_Series("Fire", 4);
		Class c = obj.getClass();
		System.out.println(c);
		System.out.println(obj.model);
		System.out.println(obj.screensize);

	}

}