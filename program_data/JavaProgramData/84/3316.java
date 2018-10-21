package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int n;
	 int i = 0;
	 int b;
	 int max1 = 0;
	 int max2 = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	while (i <= n)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		b = Integer.parseInt(tempVar2);
	}
	if (b > max1)
	{
	 max2 = max1;
	 max1 = b;
	}
	else if (max1 > b && b > max2)
	{
	max1;
	max2 = b;
	}
	else if (max2 > b)
	{
	max1;
	max2;
	}
	i++;
	}
	System.out.printf("%d\n%d\n",max1,max2);
	return 0;
	}

}

