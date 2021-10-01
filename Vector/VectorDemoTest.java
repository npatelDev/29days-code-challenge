package com.vectorDemo.VectorTest;

import java.util.Enumeration;
import java.util.Vector;

import com.vectorDemo.Vector.VectorDemo;

public class VectorDemoTest {

		public static void main(String[] args) {
			
			Vector<VectorDemo> emp=new 	Vector<VectorDemo>();
			
			VectorDemo e1=new VectorDemo(101,"Ramesh1");
			VectorDemo e2=new VectorDemo(102,"Ramesh2");
			VectorDemo e3=new VectorDemo(103,"Ramesh3");
			VectorDemo e4=new VectorDemo(104,"Ramesh4");
			
			emp.add(e1);
			emp.add(e2);
			emp.add(e3);
			emp.add(e4);
			
			Enumeration<VectorDemo> enu=emp.elements();
			while(enu.hasMoreElements()) {
				VectorDemo res=(VectorDemo)enu.nextElement();
				res.toString();
			}
			
		}
	}

