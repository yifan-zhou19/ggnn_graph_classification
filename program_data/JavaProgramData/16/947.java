package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int a;
	int b;
	double i;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	if (n < 10)
	{
	System.out.print(n);
	}
	else if (n >= 10 && n < 100)
	{
		for (i = 1;i <= 2;i++)
		{
		a = n % (int)Math.pow(10,i);
		b = a / (Math.pow(10,i - 1));
		n -= a;
		System.out.print(b);
		}
	}

	else
	{
		for (i = 1;i <= 3;i++)
		{
		a = n % (int)Math.pow(10,i);
		b = a / (Math.pow(10,i - 1));
		n -= a;
		System.out.print(b);
		}
	a = n % (int)Math.pow(10,i);
		b = a / (Math.pow(10,i - 1));
		n -= a;
		if (b != 0)
		{
			System.out.print(b);
		}
	}
	return 0;
	}
}

