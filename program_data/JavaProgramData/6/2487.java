package <missing>;

public class GlobalMembers
{
	public static int m()
	{
		int m;
		int n;
		int[] a = new int[10000];
		int i;
		int j;
		int s = 0;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p;
		int p;
		p = a;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < m * n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				p + i = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < m;i++)
		{
			if (i == 0 || i == m - 1)
			{
				for (j = 0;j < n;j++)
				{
					s = s + *(p + i * n + j);
				}
			}
			else
			{
				for (j = 0;j < n;j++)
				{
					if (j == 0 || j == n - 1)
					{
						s = s + *(p + i * n + j);
					}
				}
			}
		}
		return s;
	}
	public static int Main()
	{
		int k;
		int i;
		int sum;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= k;i++)
		{
			sum = m();
			System.out.printf("%d\n",sum);
		}
		return 0;
	}
}

