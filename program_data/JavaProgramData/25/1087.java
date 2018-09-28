package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k = 0;
		int[] a = new int[M];
		int len;
		a[0] = 1;
		for (i = 1;i < M;i++)
		{
			a[i] = 0;
		}
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			for (j = 0;j <= k + 1;j++)
			{
				a[j] *= 2;
			}
			for (k = 0;k < j;k++)
			{
				if (a[k] >= 10)
				{
					a[k] -= 10;
					a[k + 1] += 1;
				}
			}
		}
		i = 0;
		while (i >= 0)
		{
			if (a[i] == 0 && a[i + 1] == 0 && a[i + 2] == 0)
			{
				len = i;
				break;
			}
			i++;
		}
		for (i = len - 1;i >= 0;i--)
		{
			System.out.printf("%d",a[i]);
		}
		return 0;
	}

}

