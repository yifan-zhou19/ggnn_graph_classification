package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int i;
	int j;
	int min;
	int max;
	int n;
	int y = 1;
	int[] a = new int[10000];
	int[] b = new int[10000];
	int[] c = new int[10000];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 0;i < 10000;i++)
	{
		c[i] = 0;
	}
	min = 10000;
	max = 0;
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
		for (j = (a[i] + 1);j <= (b[i]);j++)
		{
			c[j] = 1;
		}
		if (min > (a[i]))
		{
			min = a[i];
		}
		if (max < (b[i]))
		{
			max = b[i];
		}
	}
	c[min] = 1;
	for (i = min;i <= max;i++)
	{
			if (c[i] == 0)
			{
			System.out.print("no");
		y = 0;
		break;
			}
	}
	if (y == 1)
	{
		System.out.printf("%d %d",min,max);
	}
	return 0;
	}
}

