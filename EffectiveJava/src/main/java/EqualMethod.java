package main.java;

import java.util.HashMap;
import java.util.Map;

public class EqualMethod {

	
	String important;
	String anotherField;
	
	public static void main(String[] args) {
		
		EqualMethod em1 = new EqualMethod();
		em1.important="one";
em1.anotherField="one";		
		EqualMethod em2 = new EqualMethod();
		em2.important= "one";
		em2.anotherField="two";
		System.out.println("em1.equals(em2)       "+ em1.equals(em2));
		System.out.println( "em1==em2   " +( em1==em2));
		System.out.println(em1.hashCode());
	System.out.println(em2.hashCode());
		
		Map<EqualMethod,EqualMethod> map = new HashMap();
		map.put(em1, em1);
		map.put(em1, em2);
	
		System.out.println(map.keySet());
		System.out.println(map.get(em2));
		System.out.println(map.get(em1));
	}

	@Override
	public boolean equals(Object obj) {
	
		if(obj==null || obj.getClass() != EqualMethod.class)
			return false;
		
		EqualMethod em=	(EqualMethod) obj;
	
		if(em.important!=null && this.important!=null){
			this.important =em.important;
			return true;
		}
		
		
		return false;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.important.toString().hashCode();
	}

	@Override
	public String toString() {
		return "EqualMethod [important=" + important + ", anotherField=" + anotherField + "]";
	}
	
	
	
}
