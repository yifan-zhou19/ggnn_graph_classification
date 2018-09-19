package <missing>;

public class GlobalMembers
{
	public static void zero1(int[] p, int n)
	{
		int i;
		int c;
		c = p;
		for (i = 1;i < n;i++)
		{
		if (*(p + i) < c)
		{
		c = (p + i);
		}
		}
		for (i = 0;i < n;i++)
		{
		p[i] = p[i] - c;
		}
	}
	public static void zero2(int[][] p, int n, int t)
	{
		int i;
		int c;
		c = (p + t);
		for (i = 1;i < n;i++)
		{
		if (*(*(p + i) + t) < c)
		{
		c = (*(p + i) + t);
		}
		}
		for (i = 0;i < n;i++)
		{
		*(*(p + i) + t) = *(*(p + i) + t) - c;
		}
	}
	public static void cut(int[][] p, int n)
	{
		int i;
		int j;
		for (i = 1;i < n - 1;i++)
		{
		for (j = 0;j < n;j++)
		{
		*(*(p + i) + j) = *(*(p + i + 1) + j);
		}
		}
		for (i = 1;i < n - 1;i++)
		{
		for (j = 0;j < n;j++)
		{
		*(*(p + j) + i) = *(*(p + j) + i + 1);
		}
		}
	}
	public static int Main()
	{
		int n;
		int m;
		int i;
		int j;
		int w;
		int c;
		int[][] p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		p = new int[m];
		for (i = 0;i < m;i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		*(p + i) = (int)malloc(m * (Integer.SIZE / Byte.SIZE));
		}
		for (w = 0;w < m;w++)
		{
			n = m;
			for (i = 0;i < n;i++)
			{
			for (j = 0;j < n;j++)
			{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				*(p + i) + j = tempVar2;
			}
			}
			}
			for (i = 0;i < n;i++)
			{
			zero1(p[i], n);
			}
			for (i = 0;i < n;i++)
			{
			zero2(p, n, i);
			}
			c = p[1][1];
			for (i = 0;i < m - 2;i++)
			{
				cut(p, n);
				n--;
				for (j = 0;j < n;j++)
				{
				zero1(p[j], n);
				}
				for (j = 0;j < n;j++)
				{
				zero2(p, n, j);
				}
				c += p[1][1];
			}
			System.out.printf("%d\n",c);
		}
		for (i = 0;i < n;i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(p[i]);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(p);
		return 0;
	}
}

