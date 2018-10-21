package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int[] a = new int[6];
		int[] b = new int[6];
		int reverse = int n;
		for (i = 0;i < 6;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Integer.parseInt(tempVar);
			}
		}
		for (i = 0;i < 6;i++)
		{
			b[i] = reverse(a[i]);
		}
		for (i = 0;i < 6;i++)
		{
			System.out.printf("%d\n",b[i]);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			i = Integer.parseInt(tempVar2);
		}
		return 0;
	}
	public static int reverse(int n)
	{
		int[] d = new int[50];
		int j;
		int k;
		int m;
		j = 0;
		if (n > 0)
		{
			while (n >= 10)
			{
				d[j] = n % 10;
				n = (n - d[j]) / 10;
				j++;
			}
			d[j] = n;
			m = 0;
			for (k = 0;k <= j;k++)
			{
				m = m + d[k] * Math.pow(10,j - k);
			}
		}
		if (n == 0)
		{
			m = 0;
		}
		if (n < 0)
		{
			j = 0;
			while (n <= -10)
			{
				d[j] = n % 10;
				n = (n - d[j]) / 10;
				j++;
			}
			d[j] = n;
			m = 0;
			for (k = 0;k <= j;k++)
			{
				m = m + d[k] * Math.pow(10,j - k);
			}
		}
		return m;
	}
}

