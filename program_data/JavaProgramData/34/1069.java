package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int n;
		int i;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}

	for (i = 0;i < 100;i++)
	{
		if (n == 1)
		{
		System.out.print("End");
	break;
		}

	else
	{
	if (n % 2 == 0)
	{
		a = n / 2;

	System.out.printf("%d/2=%d\n",n,a);
	n = a;
	continue;
	}
	else if (n % 2 == 1)
	{
	a = n * 3 + 1;
	}
	System.out.printf("%d*3+1=%d\n",n,a);
	n = a;
	continue;
	}
	}

		return 0;
	}

}

