package main.java;

public class Bld {

	public static void main(String... args) {
		
		Computer computer = new Computer.Builder("vish", "123").setOptional1("optional1","secondOptionl").setOptional2("optional2").setOptional3("setOptional3").setOptional4("optional4").build();
		System.out.println(computer.toString());
	 System.out.println(new	Computer.Builder("builderName", "builderColor").toString());
		
	}
}
