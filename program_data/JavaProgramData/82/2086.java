package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100];
		int[] b = new int[100];
		int[] c = new int[100];
		int[] d = new int[100];
		int i;
		int n;
		int k;
		int result = 0;
		int max = 0;
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
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (90 <= a[i] != 0 && a[i] <= 140 && 60 <= b[i] != 0 && b[i] <= 90)
			{
				c[i] = 1;
			}
		}
		for (k = 0;k < n;k++)
		{
			for (i = 0;i < n;i++)
			{
				if (c[i] == 1)
				{
					d[k] += 1;
					c[i] = 0;
					if (c[i + 1] == 0)
					{
						break;
					}
				}
			}
		}
		for (i = 0;i < k;i++)
		{
			if (d[i] >= max)
			{
			max = d[i];
			}
		}
		System.out.printf("%d",max);
		return 0;
	}

}

