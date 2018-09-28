package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		int b;
		int c;
		int d;
		int e;
		int f;
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (n < 100)
			{
				System.out.print(0);
				System.out.print("\n");
			}
			else
			{
				a = (n - n % 100) / 100;
				  n = n % 100;
				  System.out.print(a);
				  System.out.print("\n");
			}
			if (n < 50)
			{
				System.out.print(0);
				System.out.print("\n");
			}
			else
			{
				b = (n - n % 50) / 50;
				  n = n % 50;
				  System.out.print(b);
				  System.out.print("\n");
			}
			if (n < 20)
			{
				System.out.print(0);
				System.out.print("\n");
			}
			else
			{
				c = (n - n % 20) / 20;
				  n = n % 20;
				  System.out.print(c);
				  System.out.print("\n");
			}
			if (n < 10)
			{
				System.out.print(0);
				System.out.print("\n");
			}
			else
			{
				d = (n - n % 10) / 10;
				  n = n % 10;
				  System.out.print(d);
				  System.out.print("\n");
			}
			if (n < 5)
			{
				System.out.print(0);
				System.out.print("\n");
			}
			else
			{
				e = (n - n % 5) / 5;
				  n = n % 5;
				  System.out.print(e);
				  System.out.print("\n");
			}
			if (n < 1)
			{
				System.out.print(0);
				System.out.print("\n");
			}
			else
			{
				f = (n - n % 1) / 1;
				  n = n % 5;
				  System.out.print(f);
				  System.out.print("\n");
			}
			return 0;
	}
}

