package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int[] a = new int[1000];
	int[] b = new int[1000];
	int c = 0;
	int d = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 0;i < n;i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		a[i] = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead(" ");
	if (tempVar3 != null)
	{
		b[i] = Integer.parseInt(tempVar3);
	}
	if (a[i] >= 90 && a[i] <= 140 && b[i] >= 60 && b[i] <= 90)
	{
	c += 1;
	}
	else
	{
	if (c > d)
	{
	d = c;
	c = 0;
	}
	else
	{
	c = 0;
	}
	}
	}
	if (d > c)
	{
	System.out.printf("%d",d);
	}
	else
	{
	System.out.printf("%d",c);
	}



	return 0;
	}

}

