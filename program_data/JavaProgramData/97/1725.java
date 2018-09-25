package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		int e = 0;
		int f = 0;
		int n1;
		int n2;
		int n3;
		int n4;
		int n5;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n1 = n % 100;
		a = (n - n1) / 100;
		n2 = n1 % 50;
		b = (n1 - n2) / 50;
		n3 = n2 % 20;
		c = (n2 - n3) / 20;
		n4 = n3 % 10;
		d = (n3 - n4) / 10;
		n5 = n4 % 5;
		e = (n4 - n5) / 5;
		f = n5;
		System.out.print(a);
		System.out.print("\n");
		System.out.print(b);
		System.out.print("\n");
		System.out.print(c);
		System.out.print("\n");
		System.out.print(d);
		System.out.print("\n");
		System.out.print(e);
		System.out.print("\n");
		System.out.print(f);
		System.out.print("\n");
		return 0;
	}
}

