package <missing>;

public class GlobalMembers
{
	public static void f1(tangible.RefObject<Integer> p, int n, int k)
	{
		int i;
		int m = p.argValue;
		for (i = 0;i < n;i++)
		{
			if (*(p.argValue + i) < m)
			{
		m = (p.argValue + i);
			}
		}
		for (i = 0;i < n;i++)
		{
		*(p.argValue + i) = *(p.argValue + i) - m;
		}
		if (k > 1)
		{
			f1(p.argValue+100, n, (k - 1));
		}
	}
	public static void f2(tangible.RefObject<Integer> p, int n, int k)
	{
		int i;
		int m = p.argValue;
		for (i = 0;i < n;i++)
		{
			if (*(p.argValue + i * 100) < m)
			{
		m = (p.argValue + i * 100);
			}
		}
		for (i = 0;i < n;i++)
		{
			*(p.argValue + i * 100) = *(p.argValue + i * 100) - m;
		}
		if (k > 1)
		{
			f2(p.argValue+1, n, (k - 1));
		}
	}
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p,a[100][100],n,i,j,t,m,h;
		int p;
		int[][] a = new int[100][100];
		int n;
		int i;
		int j;
		int t;
		int m;
		int h;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				for (t = 0;t < n;t++)
				{
					String tempVar2 = ConsoleInput.scanfRead();
					if (tempVar2 != null)
					{
						a[j][t] = Integer.parseInt(tempVar2);
					}
				}
			}
			p = a[0];
			h = 0;
			for (j = n;j > 1;j--)
			{
			tangible.RefObject<Integer> tempRef_p = new tangible.RefObject<Integer>(p);
				f1(tempRef_p, j, j);
				p = tempRef_p.argValue;
		tangible.RefObject<Integer> tempRef_p2 = new tangible.RefObject<Integer>(p);
			f2(tempRef_p2, j, j);
			p = tempRef_p2.argValue;
			h += a[1][1];
			for (t = 0;t < j;t++)
			{
				for (m = 1;m < (j - 1);m++)
				{
					a[t][m] = a[t][m + 1];
				}
			}
			for (t = 0;t < (j - 1);t++)
			{
				for (m = 1;m < (j - 1);m++)
				{
					a[m][t] = a[m + 1][t];
				}
			}
			}
			System.out.printf("%d\n",h);
		}
		return 0;
	}
}

