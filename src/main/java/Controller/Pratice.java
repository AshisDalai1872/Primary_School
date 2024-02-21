package Controller;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.*;

import Entity.Book;

public class Pratice {
	
	public Pratice(int id, String name, String category, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.category = category;
		this.salary = salary;
	}



	int id;
	String name;
	String category;
	double salary;
	
	static List<String> list1=Arrays.asList("sonu","Ashutosh","ashis","guddli","madhypardesh");
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Pratice> lispratice= Arrays.asList(new Pratice(1,"sony","horror",34000),
				new Pratice(2,"ashu","funny",45000),
				new Pratice(3,"youy-","strange",98000));
		String s ="java is very old langguage";
		
		List<String>lise2= list1.stream().filter(name-> name.startsWith("A")).collect(Collectors.toList());
		//List<Pratice> pratice=  lispratice.stream().filter(pratice->pratice.getSalary()>30000)).collect(Collecotrs.toList()));
		List<Pratice> list= lispratice.stream().filter(pratice->pratice.getCategory().equalsIgnoreCase("horror")).sorted(Comparator.comparingDouble(Pratice :: getSalary).reversed())
				.collect(Collectors.toList());
		List<String> list4=lispratice.stream().sorted(Comparator.comparingDouble(Pratice::getSalary)).map(Pratice :: getName).collect(Collectors.toList());
		list4.stream().forEach(System.out::println);
Map<Character,Long> map= s.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(c->c,Collectors.counting()));

for(Map.Entry<Character,Long> entry: map.entrySet())
{
	System.out.println("key="+entry.getKey()+"value="+entry.getValue());
}

	}

	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getCategory() {
		return category;
	}



	public void setCategory(String category) {
		this.category = category;
	}



	public double getSalary() {
		return salary;
	}



	public void setSalary(double salary) {
		this.salary = salary;
	}



	public static List<String> getList1() {
		return list1;
	}



	public static void setList1(List<String> list1) {
		Pratice.list1 = list1;
	}



	@Override
	public String toString() {
		return "Pratice [id=" + id + ", name=" + name + ", category=" + category + ", salary=" + salary + "]";
	}

}