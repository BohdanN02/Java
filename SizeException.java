package homework3a;

public class SizeException extends Exception {
	private int size;

	public SizeException(String message, int size) {
		super(message);
		this.size = size;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return "SizeException [size=" + size + "]";
	}
	
	
	
	

}
