package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int m;
	int i;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	if (n == 1)
	{
	System.out.print("End");
	}
	else
	{
	for (i = 1;n != 1;i++)
	{
		m = n;
		if (n % 2 != 0)
		{
		n = n * 3 + 1;
		System.out.printf("%d*3+1=%d\n",m,n);
		}
		else if (n % 2 == 0)
		{
		n = n / 2;
		System.out.printf("%d/2=%d\n",m,n);
		}
		if (n == 1)
		{
		System.out.print("End");
		}
	}
	}
	return 0;
	}
}

