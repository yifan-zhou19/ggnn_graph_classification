package <missing>;

public class GlobalMembers
{
	public static int change(int n,int m)
	{
		int c;
		if ((n >= 0) && (n <= 4) && (m >= 0) && (m <= 4))
		{
			c = 1;
		}
		else
		{
			c = 0;
		}
		return c;
	}
	public static void Main()
	{
		int m;
		int n;
		int[][] num = new int[5][5];
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p[5];
		int[] p = new int[5];
		int i;
		int q;
		int c;
		for (i = 0;i < 5;i++)
		{
			for (q = 0;q < 5;q++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					num[i][q] = Integer.parseInt(tempVar);
				}
			}
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			m = Integer.parseInt(tempVar3);
		}
		for (i = 0;i < 5;i++)
		{
			p[i] = num[i];
		}
		c = change(n, m);
		if (c == 0)
		{
			System.out.print("error");
		}
		else
		{
			for (i = 0;i < 5;i++)
			{
				if (i == n)
				{
					for (q = 0;q < 4;q++)
					{
						System.out.printf("%d ",num[m][q]);
					}
					System.out.printf("%d\n",num[m][4]);
				}
				else if (i == m)
				{
					for (q = 0;q < 4;q++)
					{
						System.out.printf("%d ",num[n][q]);
					}
					System.out.printf("%d\n",num[n][4]);
				}
				else
				{
					for (q = 0;q < 4;q++)
					{
						System.out.printf("%d ",num[i][q]);
					}
					System.out.printf("%d\n",num[i][4]);
				}
			}
		}
	}

}

