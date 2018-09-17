package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] m = new int[25];
		int i;
		int[] d = {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		int dm = 0;
		int mm;
		int j;
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
				m[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			d[i] = 1;
		}
		for (i = n - 1;i >= 0;i--)
		{
			for (j = i + 1;j < n;j++)
			{
				if (m[i] >= m[j] != 0 && d[i] <= d[j])
				{
					d[i] = d[j] + 1;
				}
			}
		}
		dm = d[0];
		for (i = 0;i < n;i++)
		{
			if (d[i] > dm)
			{
				dm = d[i];
			}
		}
		System.out.printf("%d",dm);
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			i = Integer.parseInt(tempVar3);
		}
		return 0;
	}
}

