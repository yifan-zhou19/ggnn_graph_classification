package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		void f(int n,int m);
		int n;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		f(n, m);
	}

	public static void f(int n,int m)
	{
		int[][] a = new int[100][100];
		int i = 0;
		int j = 0;
		int b = 0;
		int p;
		int t = 1;
		int s = 0;
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < m;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					a[i][j] = Integer.parseInt(tempVar);
				}
			}
		}
		p = m * n;
		i = 0;
		j = 0;
	while (true)
	{
		for (;j < m;j++)
		{
			System.out.printf("%d\n",a[i][j]);
			b++;
			if (b == p)
			{
				break;
			}
		}
		i++;
		j--;
		if (b == p)
		{
			break;
		}
		for (;i < n;i++)
		{
			System.out.printf("%d\n",a[i][j]);
			b++;
			if (b == p)
			{
				break;
			}
		}
		j--;
		i--;
		if (b == p)
		{
			break;
		}
		for (;j >= s;j--)
		{
			System.out.printf("%d\n",a[i][j]);
			b++;
			if (b == p)
			{
				break;
			}
		}
		if (b == p)
		{
			break;
		}
		j++;
		i--;
		for (;i >= t;i--)
		{
			System.out.printf("%d\n",a[i][j]);
			b++;
			if (b == p)
			{
				break;
			}
		}
		j++;
		if (b == p)
		{
			break;
		}
		i++;
		m--;
		n--;
		s++;
		t++;
	}
	}

}

