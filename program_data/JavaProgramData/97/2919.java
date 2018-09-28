package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n; //?????n
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int a1; //??????
		int b1;
		int c1;
		int d1;
		int e1;
		int a2; //??????
		int b2;
		int c2;
		int d2;
		int e2;
		int f2;
		a1 = n % 100;
		a2 = (n - a1) / 100; //????100???????
		System.out.print(a2);
		System.out.print("\n");
		b1 = a1 % 50;
		b2 = (a1 - b1) / 50;
		System.out.print(b2);
		System.out.print("\n");
		c1 = b1 % 20;
		c2 = (b1 - c1) / 20;
		System.out.print(c2);
		System.out.print("\n");
		d1 = c1 % 10;
		d2 = (c1 - d1) / 10;
		System.out.print(d2);
		System.out.print("\n");
		e1 = d1 % 5;
		e2 = (d1 - e1) / 5;
		System.out.print(e2);
		System.out.print("\n");
		f2 = e1;
		System.out.print(f2);
		System.out.print("\n");
		return 0;
	}

}

