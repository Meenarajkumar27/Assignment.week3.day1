package assignment.week3.day1;

public class StudentInfo {
public void getStudentInfo(int id)
{
	System.out.println("ID:"+ id);
}

public void getStudentInfo(int id,String name)
{
	System.out.println("ID:"+id +" "+"Name:"+ name);
}

public void getStudentInfo(String email,long phonenumber)
{
	System.out.println("Email:" + email +" "+"Phone:"+ phonenumber);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentInfo obj=new StudentInfo();
		obj.getStudentInfo(123);
		obj.getStudentInfo(123, "Anu");
		obj.getStudentInfo("meenarajkumar27@gmail.com", 123456789);
	}

}
