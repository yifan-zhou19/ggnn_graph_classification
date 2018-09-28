package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int j = 0;
		int n;
		int m;
		int[] y = new int[100];
		int[] a = new int[63];
		int[] b = new int[10];
		for (int t = 0;t < 63;t++)
		{
			a[t] = 1;
		}

		for (int s = 0;s < 10;s++)
		{
			b[s] = 0;
		}
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 0;i < n;i++)
		{
			y[i] = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			for (j = 0;j < m;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					b[j] = Integer.parseInt(tempVar3);
				}


				a[b[j] + 3 * j + 1] = 0;
				a[b[j] + 2 + 3 * j] = 0;
				a[b[j] + 3 * j] = 0;
			}
			for (int k = 0;k < 60;k++)
			{
				y[i] += a[k];
			}


			for (int t = 0;t < 63;t++)
			{
			a[t] = 1;
			}
		for (int s = 0;s < 10;s++)
		{
			b[s] = 0;
		}

		}
		for (int l = 0;l < n;l++)
		{
			System.out.printf("%d\n",y[l]);
		}
		return 0;
	}


}

