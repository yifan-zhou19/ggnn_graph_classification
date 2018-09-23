package <missing>;

public class GlobalMembers
{
	public static int max(int x, int y)
	{
		int z;
		if (x > y)
		{
			z = x;
		}
		else
		{
			z = y;
		}
		return (z);
	}

	public static int Main()
	{
		int[] a = new int[25];
		int[] c = new int[25];
		int Height;
		int k;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		{
			for (n = 0;n < k;n++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					Height = Integer.parseInt(tempVar2);
				}
				a[n] = Height;
				c[n] = 1;
			}
	}
		int i;
		int j;
		for (i = k - 2;i >= 0;i--)
		{
			for (j = i + 1;j <= k - 1;j++)
			{
				if ((a[j] <= a[i]) && (c[i] < c[j] + 1))
				{
					c[i] = c[j] + 1;
				}
			}
		}

		int cMax = c[0];
		{
			for (i = 0;i <= k - 1;i++)
			{
				cMax = cMax > c[i] != 0?cMax:c[i];
			}
			System.out.printf("%d",cMax);
		}
		return 0;
	}



}

