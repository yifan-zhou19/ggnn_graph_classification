package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
	int a;
	int b;
	int c;
	int d;
	int e;
	int f;

	a = 0;
	b = 0;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

	for (i = 1;n - 100 >= 0;i++) //????????
	{
			n = n - 100;
		a = i;
	}
	for (i = 1;n - 50 >= 0;i++)
	{
			n = n - 50;
		b = i;
	}
	for (i = 1;n - 20 >= 0;i++)
	{
			n = n - 20;
		c = i;
	}
	for (i = 1;n - 10 >= 0;i++)
	{
			n = n - 10;
		d = i;
	}
	for (i = 1;n - 5 >= 0;i++)
	{
			n = n - 5;
		e = i;
	}
	for (i = 1;n - 1 >= 0;i++)
	{
			n = n - 1;
		f = i;
	}

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

