package com.icomply.test;

import com.icomply.Machines;

import api.icomply.util.Machine;

public class App {

	public static void main(String[] args) {
		
		System.out.println("Application start.".toUpperCase());
		System.out.println();
		
		Machines create = new Machines();
		create.createMachine("Yamaha EF2000iS", "Generator");
		
		create.createMachine("Briggs and Stratton", "CRG20-3");
		
		System.out.println("List machines:");
		System.out.println("--------------");
		for(Machine machine: Machines.machinesList) {
			System.out.println(machine);
		}
		System.out.println("--------------");
		
//		System.out.println("Created " + Machines.getCount() + " machines.");
		
		System.out.println();
		System.out.println("Application end.".toUpperCase());	

	}

}
