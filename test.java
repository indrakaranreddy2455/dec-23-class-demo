package day11;


class student{
	int id;
	int marks;
	String address;
	String name;
	
	

	public student(int id, int marks, String address, String name) {
		super();
		this.id = id;
		this.marks = marks;
		this.address = address;
		this.name = name;
	}



	@Override
	public String toString() {
		return "student [id=" + id + ", marks=" + marks + ", address=" + address + ", name=" + name + "]";
	}
	
	
}
public class test {

	public static void main(String[] args) {
		student s1=new student(36,85,"nzb","bunny");
	}

}
