package <missing>;

public class GlobalMembers
{
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int * p[5];
	public static int[] p = new int[5];

	public static int exchange(int m, int n)
	{
		if (m < 0 || n < 0 || m>4 || n>4)
		{
			return 0;
		}
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int * pt;
		int pt;
		pt = p[m];
		p[m] = p[n];
		p[n] = pt;
		return 1;
	}
	public static void output()
	{
		int i;
		int j;
		for (i = 0;i < 5;i++)
		{
			System.out.printf("%d", p[i]);
			for (j = 1;j < 5;j++)
			{
				System.out.printf(" %d",*(p[i] + j));
			}
			System.out.print("\n");
		}
	}

	public static int Main()
	{
		int[][] num = new int[5][5];
		int i;
		int j;
		int m;
		int n;
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					num[i][j] = Integer.parseInt(tempVar);
				}
			}
			p[i] = num[i][0];
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
		if (exchange(m, n) == 0)
		{
			System.out.print("error\n");
		}
		else
		{
			output();
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			m = Integer.parseInt(tempVar4);
		}
		return 0;
	}
}

