package app_java_12;

import java.util.Optional;

public class A {
	int x =10;
	public static void main(String[] args) {
		A a1 =new A();
		Optional<A> val =Optional.ofNullable(a1);
		if(val.isPresent()) {
		System.out.println(val.isPresent());
	}else {
		System.out.println("null reference");
	}
	}

}
