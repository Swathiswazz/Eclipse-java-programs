package pkgone;

import Oops.Accessmodifiers;

public class Protectedaccessmodifiers extends Accessmodifiers {

	public static void main(String[] args) {
		Protectedaccessmodifiers o=new Protectedaccessmodifiers();
		System.out.println(o.c);//here we can access variable c from another 
		//-package Oops, AccessModifiers class through inheritance.

	}

}
