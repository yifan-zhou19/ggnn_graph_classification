package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int m;
	int n;
	int i;
	int j;
	int[] a = new int[100];
	int[] b = new int[100];
	int[] c = new int[100];
		for (i = 0;i < 99;i++)
		{
			c[i] = 0;
		}
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
	j = 0;
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
		if (a[i] <= 140 && a[i] >= 90 && b[i] <= 90 && b[i] >= 60)
		{
			c[j]++;
		}
		else
		{
			j++;
		}
	}
		for (i = 0;i < 99;i++)
		{
			if (c[i] > c[i + 1])
			{
				m = c[i + 1];
				c[i + 1] = c[i];
				c[i] = m;
			}
		}
		System.out.printf("%d",c[99]);
		return 0;
	}
}

