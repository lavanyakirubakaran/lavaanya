	interface Printable {
	int d;
	void print(); }
	public class Test1 implements Printable {
	public void print() {
	System.out.print("Helle,lavanya"); }
	public static void main(String[] arg) {
		Scanner scannser=new Scanner(System.in);
	Test1 t=new Test1();
	System.out.println(t.d);
	t.print();}}


