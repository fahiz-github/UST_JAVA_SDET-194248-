package com.ust.test;


class Student
{
int rollNo;
String name;
static String collegeName;
}


public class StaticVar1 {
	
	public static void main(String[] args)
	{

	Student s1= new Student();
	Student s2= new Student();
	Student s3= new Student();
	Student.collegeName="Topper ";
	s1.rollNo=1;
	s1.name="stud1";

	s2.rollNo=2;
	s2.name="stud2";

	s3.rollNo=3;
	s3.name="stud3";

	System.out.println("S1 Roll No.= "+s1.rollNo+" S1 Name= "+s1.name+" S1 College Name= "+s1.collegeName );
	System.out.println("S2 Roll No.= "+s2.rollNo+" S2 Name= "+s2.name+" S2 College Name= "+s2.collegeName );
	System.out.println("S3 Roll No.= "+s3.rollNo+" S3 Name= "+s3.name+" S3 College Name= "+s3.collegeName );

	s2.collegeName="my college";
	s2.name="ABC";

	System.out.println("S1 Roll No.= "+s1.rollNo+" S1 Name= "+s1.name+" S1 College Name= "+s1.collegeName );
	System.out.println("S2 Roll No.= "+s2.rollNo+" S2 Name= "+s2.name+" S2 College Name= "+s2.collegeName );
	System.out.println("S3 Roll No.= "+s3.rollNo+" S3 Name= "+s3.name+" S3 College Name= "+s3.collegeName );
	  }

	

}
