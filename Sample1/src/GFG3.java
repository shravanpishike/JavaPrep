
public class GFG3 {
static int a = 3;
void disp() {
	a = 5;
}
public static void main(String args[]) {
	System.out.println(a);
	GFG3 g = new GFG3();
	g.disp();
	System.out.println(a);
}
}
