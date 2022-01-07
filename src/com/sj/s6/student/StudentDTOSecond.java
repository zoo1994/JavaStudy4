package com.sj.s6.student;

public class StudentDTOSecond extends StudentDTO {

	int history;

	public int setTotal() {
		this.total = this.kor + this.eng + this.math + this.history;
		System.out.println(this.total);
		return this.total;
	}
}
