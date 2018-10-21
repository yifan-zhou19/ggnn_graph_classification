package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int[] a = new int[301];
	int[] b = new int[302];
	int i;
	int k;
	int n;
	int m;
	int tof;
	m = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 1;i <= n;i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		a[i] = Integer.parseInt(tempVar2);
	}
	}
	for (i = 0;i <= n;i++)
	{
		tof = 1;
		for (k = 0;k < i;k++)
		{
			if (a[i] == a[k])
			{
				tof = 0;
			}
		}
		if (tof != 0)
		{
			m = m + 1;
			b[m] = a[i];
		}
	}
	for (i = 2;i <= m;i++)
	{
		System.out.printf("%d",b[i]);
	if (i != m)
	{
		System.out.print(",");
	}
	}
	System.out.print("\n");
	}

}

