package main.java;

import java.util.Arrays;

public class Computer {

//	mandatory fields
	private String name;
	private String color;
	
	private String [] optional1;
	private String optional2;
	private String optional3;
	private String optional4;
	
	
	public Computer(Builder builder) {
		this.name=builder.name;
		this.color=builder.color;
		this.optional1=builder.optional1;
		this.optional2=builder.optional2;
		this.optional3=builder.optional3;
		this.optional4= builder.optional4;
	}



	public static class Builder{
	
		private String name;
		private String color;
	
		
		private String [] optional1;
		private String optional2;
		private String optional3;
		private String optional4;
		private String [] testOptional;
		public Builder(String name, String ... testOptional){
			
		}
		
		public Builder(String name, String color){
			this.name = name;
			this.color= color;
		
		}


		public Builder setName(String name) {
			this.name = name;
		return this;
		}


		public Builder setColor(String color) {
			this.color = color;
			return this;
		}


		public Builder setOptional1(String... optional1) {
			this.optional1 = optional1;
			return this;
		}


		public Builder setOptional2(String optional2) {
			this.optional2 = optional2;
			return this;
		}


		public Builder setOptional3(String optional3) {
			this.optional3 = optional3;
			return this;
		}


		public Builder setOptional4(String optional4) {
			this.optional4 = optional4;
			return this;
		}
	
		public Computer build(){
			
		return	new Computer(this);
		}


		@Override
		public String toString() {
			return "Builder [name=" + name + ", color=" + color + ", optional1=" + Arrays.toString(optional1) + ", optional2="
					+ optional2 + ", optional3=" + optional3 + ", optional4=" + optional4 + "]";
		}
	
		
	}





	@Override
	public String toString() {
		return "Computer [name=" + name + ", color=" + color + ", optional1=" + Arrays.toString(optional1) + ", optional2=" + optional2
				+ ", optional3=" + optional3 + ", optional4=" + optional4 + "]";
	} 
	
	
	
}
