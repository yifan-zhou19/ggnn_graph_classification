package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int w;
		int[] a = new int[100];
		int i;
		int k;
		int sum;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			w = Integer.parseInt(tempVar);
		}
		if (w == 1 || w == 2 || w == 3 || w == 4 || w == 5)
		{
			a[0] = 6 - w;
		}
		else if (w == 6)
		{
			a[0] = 7;
		}
		else if (w == 7)
		{
			a[0] = 6;
		}
		int[] m = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		a[1] = 0;
		for (i = 1;a[i - 1] <= 365;i++)
		{
			a[i] = a[i - 1] + 7;
			sum = 13;
			for (k = 0;k <= 11;k++)
			{
				sum += m[k];
				if (a[i] == sum)
				{
					System.out.printf("%d\n",k + 1);
				}
			}
		}
		return 0;
	}
}

