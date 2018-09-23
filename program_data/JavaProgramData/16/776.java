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
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a = n / 1000;
		  if (a != 0)
		  {
			  b = n / 100 - 10 * a;
			  c = n / 10 - 100 * a - 10 * b;
			  d = n - 1000 * a - 100 * b - 10 * c;
			  System.out.print(d);
			  System.out.print(c);
			  System.out.print(b);
			  System.out.print(a);
			  System.out.print("\n");
		  }
		  else if (n / 100 != 0)
		  {
			  b = n / 100;
			  c = n / 10 - b * 10;
			  d = n - 100 * b - 10 * c;
			  System.out.print(d);
			  System.out.print(c);
			  System.out.print(b);
			  System.out.print("\n");
		  }
		  else if (n / 10 != 0)
		  {
			  c = n / 10;
			  d = n - c * 10;
			  System.out.print(d);
			  System.out.print(c);
			  System.out.print("\n");
		  }
		  else
		  {
			  System.out.print(n);
			  System.out.print("\n");
		  }
		  return 0;
	}
}

