package dimentionalArray;

public class JavaGenericEx1 {

	
	public static void main(String[] args) {
		
		Gen <Integer> iob;
		iob= new Gen<Integer>(99);
		iob.show();
		int v = iob.getob();
		System.out.println("the object is "+ v);
		
		Gen<String> strob = new Gen<String>("generic string test");
		
	strob.show();
	
	String vr = strob.getob();
	
	System.out.println("the string object is "+ vr);
	}

}


class Gen<T>{
	T obj;
	
	Gen(T obj){
		this.obj=obj;
	}
	
	T getob(){
		return obj;
	}
	
	void show(){
		System.out.println("the type of T is " + obj.getClass().getName());
	}
}