package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int i;
		int j;
		int houwang = new int(int n,int m);
		int[] y = new int[100];
		for (i = 0;i < 100;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			if (n == 0 && m == 0)
			{
				break;
			}
			else
			{
				y[i] = houwang(n, m);
			}
		}
		for (j = 0;j < i;j++)
		{
			System.out.printf("%d\n",y[j]);
		}
		return 0;
	}

	public static int houwang(int n,int m)
	{
		int i;
		int j = 0;
		int k = 0;
		int[] x = new int[301];
		for (i = 0;i < 301;i++)
		{
			x[i] = 1;
		}
		for (i = 0;;i++)
		{
			if (x[i] == 1)
			{
				j++;
				 if (j % m == 0)
				 {
					x[i] = 0;
					k++;
				 }
			}
			if (k == n - 1)
			{
				break;
			}
			if (i == n - 1)
			{
				i = -1;
			}
		}
		for (i = 0;i < n;i++)
		{
			if (x[i] == 1)
			{
				break;
			}
		}
		return (i + 1);
	}
}

