package Entity;

public class Book {
	public Book book=new Book(1,"tile1","addressed1","romantic");
	public Book book1=new Book(1,"tile2","addressed2","horror");
	public Book book2=new Book(1,"tile3","addressed3","drama");
	public Book book3=new Book(1,"tile4","addressed4","sex");
	
	
	public Book(int id, String name, String address, String category) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		Category = category;
	}
	int id ;
	String name;
	String address;
	String Category;
	
	

}

