package <missing>;

public class GlobalMembers
{
	public static int v;
	public static void fy(int s)
	{
		 System.out.print(v / s);
		 System.out.print("\n");
		 v = v % s;
	}
	public static int Main()
	{
		int a;
		int b;
		int c = 0;
		int[] d = new int[4];
		double m;
		double n = 0;
		double r;
		String s = new String(new char[100]);
		v = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		fy(100);
		fy(50);
		fy(20);
		fy(10);
		fy(5);
		fy(1);
		return EXIT_SUCCESS;
	}

}

