//Comparator Interface Java
//sorting the number with respect to last digit

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class Student{
	int rollno;
	int marks;
	public Student(int rollno,int marks){
		this.rollno=rollno;
		this.marks=marks;
	}
	public String toString(){
		return "Student{" +"rollno" +rollno +",marks=" + marks + "}";
	}
}
public class ComparatorInterface{
	public static void main (String[] args){

	/*List<Integer> val = new ArrayList<Integer>();
	val.add(305);
	val.add(998);
	val.add(774);
	val.add(236);
	val.add(881);
	val.add(925);

	Collections.sort(val,(o1,o2)->{
		return o1%100>o2%100?1:-1;
	});
	val.forEach(i-> System.out.println(i));*/
	/*List<Student> stud = new ArrayList();
	stud.add(new Student(1,95));
	stud.add(new Student(2,85));
	stud.add(new Student(3,45));
	stud.add(new Student(4,55));
	Collections.sort(stud,(s1,s2)->{
		return s1.marks>s2.marks?1:-1;
	});
	stud.forEach(s->System.out.println(s));*/
	List <Laptop> laps = new ArrayList<>();
	laps.add(new Laptop("dell",16,8000));
	laps.add(new Laptop("hp",8,84000));
	laps.add(new Laptop("apple",12,100000));
	Collections.sort(laps);
	laps.forEach(s->System.out.println(s));


	}
}


///when to use comparable when we are implementing comparables and we want to define own logics



