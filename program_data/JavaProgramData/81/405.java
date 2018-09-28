package <missing>;

public class GlobalMembers
{
	public static int f(int[] p, int m, int n)
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *b,i,c[5];
		int b;
		int i;
		int[] c = new int[5];
		b = c;
		if (m <= 4 && m >= 0 && n <= 4 && n >= 0)
		{
			for (i = 0;i < 5;i++)
			{
				*(b + i) = *(p[m] + i);
				*(p[m] + i) = *(p[n] + i);
				*(p[n] + i) = *(b + i);
			}

			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static int Main()
	{
		int m;
		int n;
		int[][] a = new int[5][5];
		int i;
		int j;
		(int)(*p)[5];
		p = a;
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				if (j != 4)
				{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					*(p + i) + j = tempVar;
				}
				}
				else
				{
					String tempVar2 = ConsoleInput.scanfRead();
					if (tempVar2 != null)
					{
						*(p + i) + j = tempVar2;
					}
				}
			}
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			m = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			n = Integer.parseInt(tempVar4);
		}

		if (f(p, m, n) == 1)
		{
			for (i = 0;i < 5;i++)
			{
			for (j = 0;j < 5;j++)
			{
				if (j != 4)
				{
				System.out.printf("%d ",*(*(p + i) + j));
				}
				else
				{
					System.out.printf("%d\n",*(*(p + i) + j));
				}
			}
			}
		}
		if (f(p, m, n) == 0)
		{
			System.out.print("error");
		}
		return 0;
	}








}

