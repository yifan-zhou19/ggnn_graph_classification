package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		int b;
		int c;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (n < 10)
		{
			System.out.print(n);
		}
		else if (n < 100)
		{
			System.out.print(n % 10);
			System.out.print(n / 10);
		}
		else if (n < 1000)
		{
				a = n % 10;
		  n = (n - a) / 10;
		  b = n % 10;
		  n = (n - b) / 10;
		  System.out.print(a);
		  System.out.print(b);
		  System.out.print(n);
		}
		else if (n < 10000)
		{
			a = n % 10;
			 n = (n - a) / 10;
		  b = n % 10;
		  n = (n - b) / 10;
		  c = n % 10;
		  n = (n - c) / 10;
		  System.out.print(a);
		  System.out.print(b);
		  System.out.print(c);
		  System.out.print(n);
		}
		else
		{
			System.out.print("0");
			System.out.print("0");
			System.out.print("0");
			System.out.print("0");
			System.out.print("1");
		}
		return 0;
	}
}

