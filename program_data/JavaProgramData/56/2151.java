package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int[] a = new int[7];
		int[] b = new int[7];
		int c = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		a[0] = 0;
		a[1] = n / 10000;
		a[2] = (n - a[1] * 10000) / 1000;
		a[3] = (n - a[1] * 10000 - a[2] * 1000) / 100;
		a[4] = (n - a[1] * 10000 - a[2] * 1000 - 100 * a[3]) / 10;
		a[5] = n - a[1] * 10000 - a[2] * 1000 - 100 * a[3] - 10 * a[4];
		for (j = 0;j <= 5;j++)
		{
			if (a[j] == 0)
			{
				if (a[j - 1] == 0)
				{
					continue;
				}
				else
				{
					b[5 - j] = a[j];
				}
			}
			else
			{
				 b[5 - j] = a[j];
				 c += 1;
			}
		}
		for (i = 0;i < c;i++)
		{
			System.out.printf("%d",b[i]);
		}
		return 0;
	}




}

