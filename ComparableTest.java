package com.tree;

public class ComparableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	class office{	
		Employee e1 = new Employee("nitzz",5.6f,"black",58f,"std",876436);
		 Employee e2 = new Employee("n",5.8f,"yelllow",55f,"dev",800436);
		 Employee e3 = new Employee("ni",6.6f,"bla",50f,"test",116436);
		 Employee e4 = new Employee("nit",6.6f,"red",66f,"gh",87643600);
		 Employee e5 = new Employee("nitz",5.6f,"ack",58f,"std",876436);
		 Employee e6 = new Employee("Namu",5.6f,"white",58f,"std",876436);
		 Employee e7 = new Employee("uttu",5.6f,"black",58f,"std",876436);
		 Employee e8 = new Employee("manu",5.6f,"carbon black",58f,"std",876436);
	}
	}

}
	class Employee
	{
		String name;
		float height;
		String color;
		Float weight;
		String designation;
		float salary;
		
		public Employee(String name, float height, String color, Float weight, String designation, float salary) {
			super();
			this.name = name;
			this.height = height;
			this.color = color;
			this.weight = weight;
			this.designation = designation;
			this.salary = salary;
			
			
			
		}

		@Override
		public String toString() {
			return "Employee [name=" + name + ", height=" + height + ", color=" + color + ", weight=" + weight
					+ ", designation=" + designation + ", salary=" + salary + "]";
		}
		
		
	}