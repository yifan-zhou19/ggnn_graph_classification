package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int max1;
	int max2;
	int num;
	int exc;
	max1 = 0;
	max2 = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (int i = 1;i <= n;i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		num = Integer.parseInt(tempVar2);
	}
	{
		if (num > max1)
		{
	exc = max1;
	max1 = num;
	max2 = exc;
		}
		else if (num < max1)
		{
			if (num > max2)
			{
	max2 = num;
	max1 = max1;
			}
		}
}
	}
	System.out.printf("%d\n%d\n",max1,max2);

	return 0;
	}
}

