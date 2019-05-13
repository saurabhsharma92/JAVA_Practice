package designpatter.builder;

public class Computer {
	//Mandatory variables
	private String hdd;
	private String ram;
	
	//Optional Varaible
	private boolean isLaptop;
	private boolean isWifiEnable;
	
	public String getHdd() {
		return this.hdd;
	}
	
	public String getRam() {
		return this.ram;
	}
	
	public boolean laptop() {
		return this.isLaptop;
		
	}
	
	public boolean wifiEnable() {
		return this.isWifiEnable;
	}
	
	private Computer(ComputerBuilder builder) {
		this.hdd = builder.hdd;
		this.ram = builder.ram;
		this.isLaptop = builder.isLaptop;
		this.isWifiEnable = builder.isWifiEnable;
	}
	
	public static class ComputerBuilder{
		private String hdd;
		private String ram;
		private boolean isLaptop;
		private boolean isWifiEnable;
		
		public ComputerBuilder(String hdd, String ram) {
			this.hdd = hdd;
			this.ram = ram;
		}
		
		public ComputerBuilder setLaptop(boolean isLaptop) {
			this.isLaptop = isLaptop;
			return this;
		}
		
		public ComputerBuilder setWifiEnable(boolean isWifiEnable) {
			this.isWifiEnable = isWifiEnable;
			return this;
		}
		
		public Computer build() {
			return new Computer(this);
		}
	}
	
	@Override
	public String toString() {
		return "Computer [hdd="+hdd+" ,ram="+ram+" ,isLaptop="+ isLaptop+" ,isWifiEnable="+isWifiEnable+"]";
	}
	
}
