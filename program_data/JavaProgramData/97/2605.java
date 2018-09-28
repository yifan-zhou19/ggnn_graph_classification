package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int c100 = 0;
		int c50 = 0;
		int c20 = 0;
		int c10 = 0;
		int c5 = 0;
		int c1 = 0;
	m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	if (m / 100 != 0)
	{
		c100 = m / 100;
	   m = m % 100;
	}
	if (m / 50 != 0)
	{
		c50 = m / 50;
	 m = m % 50;
	}
	if (m / 20 != 0)
	{
		c20 = m / 20;
	m = m % 20;
	}
	if (m / 10 != 0)
	{
		c10 = m / 10;
	m = m % 10;
	}
	if (m / 5 != 0)
	{
		c5 = m / 5;
	 m = m % 5;
	}
	if (m / 1 != 0)
	{
		c1 = m;
	}
	System.out.print(c100);
	System.out.print("\n");
	System.out.print(c50);
	System.out.print("\n");
	System.out.print(c20);
	System.out.print("\n");
	System.out.print(c10);
	System.out.print("\n");
	System.out.print(c5);
	System.out.print("\n");
	System.out.print(c1);
	System.out.print("\n");

	return 0;
	}
}

