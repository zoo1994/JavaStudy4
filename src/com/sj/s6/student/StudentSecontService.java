package com.sj.s6.student;

public class StudentSecontService extends StudentService{

	@Override
	public StudentDTO setStudent() {
		StudentDTOSecond studentDTOSecond = new StudentDTOSecond();
		
		return studentDTOSecond;
	}
	

}
