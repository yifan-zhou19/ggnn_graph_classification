package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (int i = 1;;i++)
	{
	if (n != 1)
	{
		if (n % 2 != 0)
		{
			n = 3 * n + 1;
		System.out.printf("%d*3+1=%d\n",(n - 1) / 3,n);
		}
		if (n % 2 == 0)
		{
			n = n / 2;
		System.out.printf("%d/2=%d\n",2 * n,n);
		}
	}
	else
	{
	break;
	}
	}
	System.out.print("End");
		return 0;
	}

}

