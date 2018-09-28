package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int k;
	int i;
	int a;
	int b;
	int c;
	int d;
	int max1;
	int max2;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		k = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead(" ");
	if (tempVar2 != null)
	{
		a = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead(" ");
	if (tempVar3 != null)
	{
		b = Integer.parseInt(tempVar3);
	}
	if (a > b)
	{
	max1 = a,max2 = b;
	}
	else
	{
	max1 = b,max2 = a;
	}
	for (i = 1;i <= k - 2;i++)
	{
	String tempVar4 = ConsoleInput.scanfRead();
	if (tempVar4 != null)
	{
		c = Integer.parseInt(tempVar4);
	}
	if (c > max1)
	{
	d = max1,max1 = c,max2 = d;
	}
	else
	{
	if (c > max2)
	{
	max2 = c;
	}
	}
	}
	System.out.printf("%d\n",max1);
	System.out.printf("%d\n",max2);
	}
}

