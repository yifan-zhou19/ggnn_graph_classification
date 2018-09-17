package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] b = new int[25];
		int[] a = new int[25];
		int x = 0;
		int n;
		int i;
		int j;
		int k;
		int l;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (j = 0;j < n;j++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[j] = Integer.parseInt(tempVar2);
			}
		}
		for (k = 0;k < n;k++)
		{
			b[k] = 0;
			for (i = 0;i < k;i++)
			{
				if (a[i] >= a[k])
				{
					if (b[i] > b[k])
					{
						b[k] = b[i];
					}
				}
			}
			b[k] = b[k] + 1;
		}
		for (l = 0;l < k;l++)
		{
			if (b[l] > x)
			{
				x = b[l];
			}
		}
		System.out.printf("%d\n",x);
	}
}

