package api.icomply.util;

public interface Machine {
	
	boolean setMachineName(String machineName);
	boolean setMachineType(String machineType);
	String getMachineName();
	String getMachineType();
}
