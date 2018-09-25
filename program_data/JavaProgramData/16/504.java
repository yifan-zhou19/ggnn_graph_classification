package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (n >= 0 && n <= 9)
		{
			 System.out.print(n);
			 System.out.print("\n");
		}
		else if (n >= 10 && n <= 99)
		{
			 int a;
			 int b;
			 a = n / 10;
			 b = n % 10;
			 System.out.print(b);
			 System.out.print(a);
			 System.out.print("\n");
		}
		else if (n >= 100 && n <= 999)
		{
			 int a;
			 int b;
			 int c;
			 a = n / 100;
			 b = (n - 100 * a) / 10;
			 c = n - 100 * a - 10 * b;
			 System.out.print(c);
			 System.out.print(b);
			 System.out.print(a);
			 System.out.print("\n");
		}
		else if (n >= 1000 && n <= 9999)
		{
			 int a;
			 int b;
			 int c;
			 int d;
			 a = n / 1000;
			 b = (n - 1000 * a) / 100;
			 c = (n - 1000 * a - 100 * b) / 10;
			 d = n - 1000 * a - 100 * b - 10 * c;
			 System.out.print(d);
			 System.out.print(c);
			 System.out.print(b);
			 System.out.print(a);
			 System.out.print("\n");
		}
		if ((n = 10000) != 0)
		{
			 System.out.print("00001");
			 System.out.print("\n");
		}
		return 0;
	}

}

