class TV{
	private int size;
	public TV(int size) {
		this.size = size;
	}
	public void getSize() {
		System.out.print(size + "��ġ");
	}
}

class ColorTV extends TV{
	private int color;
	public ColorTV(int size, int color) {
		super(size);
		this.color = color;
	}
	public void printProperty() {
		getSize();
		System.out.print(" " + color + "�÷�");
	}
}
public class ColorTVEx {

	public static void main(String[] args) {
		ColorTV myTV = new ColorTV(32,1024);
		myTV.printProperty();
	}

}
