package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int d;
		int n;
		int n1;
		int n2;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a = n / 1000;
		n1 = n - 1000 * a;
		b = n1 / 100;
		n2 = n1 - 100 * b;
		c = n2 / 10;
		d = n2 - 10 * c;
		if (a == 10)
		{
			System.out.print("00001");
			System.out.print("\n");
		}
		else if (a != 0)
		{
			System.out.print(d);
			System.out.print(c);
			System.out.print(b);
			System.out.print(a);
			System.out.print("\n");
		}
		else if (b != 0)
		{
			System.out.print(d);
			System.out.print(c);
			System.out.print(b);
			System.out.print("\n");
		}
		else if (c != 0)
		{
			System.out.print(d);
			System.out.print(c);
			System.out.print("\n");
		}
		else
		{
			System.out.print(d);
			System.out.print("\n");
		}
		return 0;
	}







}

