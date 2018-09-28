package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int[] a = new int[100];
	int[] b = new int[100];
	int n;
	int i;
	int max;
	int m;
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
	}
	System.out.print("\n");
	m = 0;
	max = 0;
	for (i = 0;i < n;i++)
	{
		if (a[i] >= 90 && a[i] <= 140 && b[i] >= 60 && b[i] <= 90)
		{
			m = m + 1;
		}
		else
		{
			if (m > max)
			{
				max = m;
			}
		m = 0;
		}
	}
	if (a[n - 1] >= 90 && a[n - 1] <= 140 && b[n - 1] >= 60 && b[n - 1] <= 90 && m> max)
	{
	max = m;
	}
	System.out.printf("%d\n",max);
	return 0;
	}
}

