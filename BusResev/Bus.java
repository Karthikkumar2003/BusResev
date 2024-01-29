package reservation;

public class Buss {
	private int busno;                                       
	private boolean ac;                                
	private int Capacity;                            
	
	Buss(int no,boolean val,int cap){
		this.busno = no;
		this.ac  = val;                              
		this.Capacity = cap;
	}
	public int getbusno() {                          
		return busno;
	}
	public boolean isAC() {
		return ac;
	}
	public int getCapacity() {
		return Capacity;                           
	}
	public void setAC(boolean val) {               
		ac = val;
	}
	public void setCapacity(int cap) {             
		Capacity = cap;
	}
}
