package APIConfirm;

public class Student {
	private String studentNum;
	
	public Student(String studentNum) {
		this.studentNum = studentNum;
	}

	public String getStudentNum() {
		return studentNum;
	}
	//메소드 오버라이딩
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {//객체확인
			Student student = (Student)obj;
			if(studentNum.equals(student.getStudentNum())) {
				return true;
			}
		}
		return false;
	}
	@Override
	public int hashCode() {
		return studentNum.hashCode();
	}
	
}
