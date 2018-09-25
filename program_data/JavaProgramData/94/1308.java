package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[10000];
		int n;
		int w;
		int m;
		int i;
		int j;
		int k;
		int t;
		int e;
		int x;
		int y;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			w = Integer.parseInt(tempVar);
		}
		n = 0;
		for (i = 0;i < w;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		for (k = 0;k < w;k++)
		{
			if ((a[k] % 2) != 0)
			{
				n++;
			}
			else
			{
				a[k] = 0;
			}
		}
		for (e = w - 1;e >= 0;e--)
		{
			for (j = 0;j < e;j++)
			{
				if (a[j] > a[j + 1])
				{
					m = a[j + 1];
					a[j + 1] = a[j];
					a[j] = m;
				}
			}
		}
		for (t = w - n;t < w - 1;t++)
		{
			System.out.printf("%d,",a[t]);
		}
		System.out.printf("%d",a[w - 1]);



		return 0;
	}



}

