package Problems;

public class Student {

	private int studentId;
	private String studentFirstName;
	private String studentLastName;
	private int studentRollno;
	private String studentCity;
	
	public void setStudentId(int studentId)
	{
		this.studentId=studentId;
	}
	public void setStudentFirstName(String studentFirstName)
	{
		this.studentFirstName=studentFirstName;
	}
	public void setStudentLastName(String studentLastName)
	{
		this.studentLastName=studentLastName;
	}
	public void setStudentRollno(int studentRollno)
	{
		this.studentRollno=studentRollno;
	}
	public void setStudentCity(String studentCity)
	{
		this.studentCity=studentCity;
	}
	
	public int getStudentId()
	{
		return this.studentId;
	}
	public String getStudentFirstName()
	{
		return this.studentFirstName;
	}
	public String getStudentLastName()
	{
		return this.studentLastName;
	}
	public int getStudentRollno()
	{
		return this.studentRollno;
	}
	public String getStudentCity()
	{
		return this.studentCity;
	}
	

}
