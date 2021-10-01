package com.TreeSet.TreeSetObjectDefined;

public class TreeSetUserDefined implements Comparable<TreeSetUserDefined> {
		private int EmpId;
		private String EmpName;
		
		public TreeSetUserDefined(int empId, String empName) {
			super();
			EmpId = empId;
			EmpName = empName;
		}
		public int getEmpId() {
			return EmpId;
		}
		public void setEmpId(int empId) {
			EmpId = empId;
		}
		public String getEmpName() {
			return EmpName;
		}
		public void setEmpName(String empName) {
			EmpName = empName;
		}
		@Override
		public String toString() {
			System.out.println("Employee ID : "+" "+EmpId+" "+"Employee Name : "+" "+EmpName);
			return super.toString();
		}
		@Override
		public int compareTo(TreeSetUserDefined emp) {
			if(this.EmpId == emp.getEmpId()) {
			return 0;
		}else if(this.EmpId >emp.getEmpId()) {
			return 1;
		}else {
			return -1;
		}
		
		
		
		
}
}
