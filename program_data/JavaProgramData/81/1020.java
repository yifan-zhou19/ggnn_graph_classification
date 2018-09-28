package <missing>;

public class GlobalMembers
{
	public static int judge(int n, int m, int[][] p)
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *temp;
		int temp;
		if (n < 5 && n >= 0 && m < 5 && m >= 0)
		{
			temp = p[n];
			p[n] = p[m];
			p[m] = temp;
			return (1);
		}
		else
		{
			return (0);
		}
	}


	public static void Main()
	{
		int n;
		int m;
		int i;
		int j;
		int[][] s = new int[5][5];
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p[5];
		int[] p = new int[5];
		int a;
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					s[i][j] = Integer.parseInt(tempVar);
				}
			}
		}
		for (i = 0;i < 5;i++)
		{
			p[i] = s[i][0];
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			m = Integer.parseInt(tempVar3);
		}
		a = judge(n, m, p);

		if (a == 0)
		{
			System.out.print("error");
		}
		else
		{
			for (i = 0;i < 5;i++)
			{
				for (j = 0;j < 5;j++)
				{
					if (j == 0)
					{
					System.out.printf("%d",*(p[i] + j));
					}
					else if (j == 4)
					{
						System.out.printf(" %d\n",*(p[i] + j));
					}
					else
					{
						System.out.printf(" %d",*(p[i] + j));
					}

				}
			}
		}
	}





}

