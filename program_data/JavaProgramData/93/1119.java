package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int q1;
	int q2;
	int q3;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	q1 = 0;
	q2 = 0;
	q3 = 0;
	if (n % 3 == 0)
	{
		q1 = 1;
	}
	if (n % 5 == 0)
	{
		q2 = 1;
	}
	if (n % 7 == 0)
	{
		q3 = 1;
	}
	if ((q1 == 0) && (q2 == 0) && (q3 == 0))
	{
		System.out.print("n");
	}
	else
	{
	if (q1 + q2 + q3 == 3)
	{
	 System.out.print("3 5 7");
	}
	if (q1 + q2 + q3 == 2)
	{
		if (q1 == 0)
		{
			System.out.print("5 7");
		}
		if (q2 == 0)
		{
			System.out.print("3 7");
		}
		if (q3 == 0)
		{
			System.out.print("3 5");
		}
	}
	if (q1 + q2 + q3 == 1)
	{
	if (q1 == 1)
	{
		System.out.print("3");
	}
	if (q2 == 1)
	{
		System.out.print("5");
	}
	if (q3 == 1)
	{
		System.out.print("7");
	}
	}
	}
	return 0;
	}

}

