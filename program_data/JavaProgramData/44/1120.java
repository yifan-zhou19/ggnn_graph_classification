package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int f = int m;
		int count = int m;
		int[] m = new int[6];
		for (int i = 0;i <= 5;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				m[i] = Integer.parseInt(tempVar);
			}
		}
		for (int j = 0;j <= 5;j++)
		{
			System.out.printf("%d\n",f(m[j]));
		}
	}
	public static int count(int m)
	{
		int a = 1;
		int i;
		for (i = 0;i <= m - 1;i++)
		{
			a = a * 10;
		}
		return a;
	}

	public static int f(int m)
	{
		if (m > 0)
		{
			int i = 1;
			int n = m;
			while (n / 10 >= 1)
			{
				i++;
				n = n / 10;
			}
			int[] p = new int[i];
			int j;
			for (j = 0;j <= i - 1;j++)
			{
				p[j] = m - ((int)(m / 10)) * 10;
				m = m / 10;
			}
			int k;
			int b = 0;
			for (k = 0;k <= i - 1;k++)
			{
				b = b + p[k] * count(i - k - 1);
			}
			return b;
		}
		else if (m == 0)
		{
			int c = 0;
			return c;
		}
		else
		{
			int i = 1;
			int q;
			int n = q = -m;
			while (n / 10 >= 1)
			{
				i++;
				n = n / 10;
			}
			int[] p = new int[i];
			int j;
			for (j = 0;j <= i - 1;j++)
			{
				p[j] = q - ((int)(q / 10)) * 10;
				q = q / 10;
			}
			int k;
			int b = 0;
			for (k = 0;k <= i - 1;k++)
			{
				b = b + p[k] * count(i - k - 1);
			}
			return -b;
		}

	}



}

