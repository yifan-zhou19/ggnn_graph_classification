package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int y = 0;
	int x = 0;
	int n;
	int i;
	int[] a = new int[100];
	int[] b = new int[100];
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
	if (i != n - 1 && a[i] >= 90 && a[i] <= 140 && b[i] >= 60 && b[i] <= 90)
	{
	x++;
	}
	else if (i != n - 1 && x > y)
	{
	y = x;
	x = 0;
	}
	else if (i != n - 1 && y >= x)
	{
	x = 0;
	}
	else if (i == n - 1 && a[i] >= 90 && a[i] <= 140 && b[i] >= 60 && b[i] <= 90 && y < x + 1)
	{
	x++;
	y = x;
	}
	else if (i == n - 1 && x > y)
	{
	y = x;
	}
	}
	System.out.printf("%d",y);
	return 0;
	}
}

