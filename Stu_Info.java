package Day2;
public class Stu_Info {

String enroll_Num,result;

public String getenroll_Num() {
	return enroll_Num;
}
public String getresult() {
	return result;
	
}
public void setenroll_Num(String enroll_Num) {
	this.enroll_Num = enroll_Num;
}
public void setresult(String result) {
	this.result = result;
}
@Override
public String toString() {
	return ("Enrollment Num=" + getenroll_Num() + ", result = " + getresult());
}

}
