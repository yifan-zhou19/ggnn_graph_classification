package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int m;
		int[] a = new int[100];
		int[] f = new int[100];
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
		}
		for (i = 0;i < n;i++)
		{
			if (i == 0)
			{
				f[i] = 1;
			}
			else
			{
				k = 0;
				for (j = 0,k = 0;j < i;j++)
				{
					if (a[i] <= a[j] != 0 && k < f[j])
					{
						k = f[j];
					}
				}
				f[i] = k + 1;
			}
		}
		for (i = 0,k = 1;i < n;i++)
		{
			if (k < f[i])
			{
				k = f[i];
			}
		}
		System.out.printf("%d\n",k);
	}


}

