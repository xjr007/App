package com.icomply;

import java.util.ArrayList;
import java.util.List;

import api.icomply.util.Machine;

public class Machines implements Machine {
	public static int count = 0;
	public static List<Machine> machinesList = new ArrayList<>();
	
	private String machineName = "";
	private String machineType = "";


	
	public String toString() {
		
		return this.machineName;
	}
	
	public void createMachine(String machineName, String machineType) {
		Machine machine = new Machines();
		
		if(!(machine.setMachineName(machineName) && 
				machine.setMachineType(machineType))) {
			throw new NullPointerException("Could not create a machine.");
		} else count++;
		
		machine.setMachineName(machineName);
		machine.setMachineType(machineType);
		
		machinesList.add(machine);
	}
	
	@Override
	public boolean setMachineName(String machineName) {
		if(machineName == null || machineName == "") {
			return false;
		}

		this.machineName = machineName;
		return true;
	}
	
	@Override
	public boolean setMachineType(String machineType) {
		if(machineType == null || machineType == "") {
			return false;
		}
		
		this.machineType = machineType;
		return true;
	}
	
	@Override
	public String getMachineName() {
		if(this.machineName == null || this.machineName == "") 
			return "";
		
		return machineName;
	}

	@Override
	public String getMachineType() {
		if(this.machineType == null || this.machineType == "") 
			return "";
		
		return machineType;
	}
	
	public static int getCount() {
		return count;
	}
}
