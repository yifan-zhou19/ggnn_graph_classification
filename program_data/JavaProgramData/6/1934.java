package <missing>;

public class GlobalMembers
{
	public static int[][] A = new int[100][100];
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *pt;
		int pt;
		int i;
		int j;
		int k;
		int m;
		int n;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *re;
		int re;
		int[] B = new int[200];
		int number;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			number = Integer.parseInt(tempVar);
		}
		re = B;
		for (i = 0;i < 200;i++)
		{
			*(re + i) = 0;
		}
		re = B;
		for (i = 0;i < number;i++)
		{
			for (j = 0;j < 100;j++)
			{
				for (k = 0;k < 100;k++)
				{
					*(*(A + j) + k) = 0;
				}
			}

			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				n = Integer.parseInt(tempVar3);
			}
			for (j = 0;j < m;j++)
			{
				for (k = 0;k < n;k++)
				{
					String tempVar4 = ConsoleInput.scanfRead();
					if (tempVar4 != null)
					{
						*(A + j) + k = tempVar4;
					}
				}
			}
			pt = A;
			for (j = 0;j < n;j++)
			{
				if (j < (n - 1))
				{
				re = re + pt;
				pt++;
				}
				else
				{
					re = re + pt;
					pt = pt + 100;
				}
			}
			for (j = 1;j < m;j++)
			{
				if (j < (m - 1))
				{
				re = re + pt;
				pt = pt + 100;
				}
				else
				{
					re = re + pt;
					pt = pt - 1;
				}
			}
			for (j = 1;j < n;j++)
			{
				if (j < (n - 1))
				{
				re = re + pt;
				pt--;
				}
				else
				{
					re = re + pt;
					pt = pt - 100;
				}
			}
			for (j = 1;j < (m - 1);j++)
			{
				re = re + pt;
				pt = pt - 100;
			}
			re++;
		}
		re = B;
		for (i = 0;i < number;i++)
		{
			System.out.printf("%d\n",*(re + i));

		}
		return 0;
	}
}

