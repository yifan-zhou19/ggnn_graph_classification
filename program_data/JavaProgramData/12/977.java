package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n = 0;
		int i;
		int j;
		int k;
		int m = 0;
		int[] a = new int[16];
		while (true)
		{
		n = 0;
		for (i = 0;i < 16;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Integer.parseInt(tempVar);
			}
			m = i;
			if (a[i] == 0)
			{
				break;
			}
			if (a[0] == -1)
			{
				break;
			}
		}
		if (a[0] == -1)
		{
			break;
		}
		for (j = 0;j < m;j++)
		{
			for (k = 0;k < m;k++)
			{
				if (a[j] == 2 * a[k] || a[k] == 2 * a[j])
				{
					n += 1;
				}
			}
		}
		System.out.printf("%d\n",n / 2);
		}
		return 0;
	}


}

