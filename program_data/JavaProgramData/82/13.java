package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int m = 0;
	int k = 0;
	int b = 0;
	int i;
	int[][] a = new int[100][2];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 0;i < 100;i++)
	{
	a[i][1] = 0;
	}
	for (i = 0;i < n;i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		a[i][1] = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead(" ");
	if (tempVar3 != null)
	{
		a[i][2] = Integer.parseInt(tempVar3);
	}
	}
	for (i = 0;i < n;i++)
	{
	if (a[i][1] >= 90 && a[i][1] <= 140 && a[i][2] >= 60 && a[i][2] <= 90)
	{
		k = k + 1;
		if (k > b)
		{
			b = k;
		}
	}
	else
	{
	k = 0;
	}
	}
	System.out.printf("%d",b);
	return 0;
	}
}

