package <missing>;

public class GlobalMembers
{
	public static int m;
	public static int n;
	public static int[][] a = new int[5][5];
	public static int f(int x,int y)
	{
		if (x >= 0 && x < 5 && y >= 0 && y < 5)
		{
			return (1);
		}
		else
		{
			return (0);
		}
	}
	public static void Main()
	{
		int i;
		int j;
		int t;

		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					a[i][j] = Integer.parseInt(tempVar);
				}
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
		for (j = 0;j < 5;j++)
		{
			t = (*(a + m) + j);
			*(*(a + m) + j) = *(*(a + n) + j);
			*(*(a + n) + j) = t;
		}
		if (f(m, n) == 1)
		{
			for (i = 0;i < 5;i++)
			{

				for (j = 0;j < 5;j++)
				{
					if (j < 4)
					{
						System.out.printf("%d ",*(*(a + i) + j));
					}
					else
					{
						System.out.printf("%d\n",*(*(a + i) + j));
					}

				}
			}
		}
		if (f(m, n) == 0)
		{
			System.out.print("error");
		}
	}

}

