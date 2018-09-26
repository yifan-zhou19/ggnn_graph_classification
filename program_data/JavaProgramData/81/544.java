package <missing>;

public class GlobalMembers
{
	public static int putout(int n, int m)
	{
		int z;
		if (n <= 4 && n >= 0 && m <= 4 && m >= 0)
		{
			z = 1;
		}
		else
		{
			z = 0;
		}
	return (z);
	}
	public static int Main()
	{
		int i;
		int j;
		int n;
		int m;
		int return1;
		int[][] str = new int[5][5];
		int[] turn = new int[5];
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p;
		p = str[0];
		for (i = 0;i < 25;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				p++ = Integer.parseInt(tempVar);
			}

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

		return1 = putout(n, m);
		if (return1 == 0)
		{
			System.out.print("error\n");
		}
		else
		{
			for (j = 0;j < 5;j++)
			{
				turn[j] = str[m][j];
				str[m][j] = str[n][j];
				str[n][j] = turn[j];
			}
			for (i = 0;i < 5;i++)
			{
				for (j = 0;j < 4;j++)
				{
					System.out.printf("%d ",str[i][j]);
				}
				System.out.printf("%d\n",str[i][4]);

			}
		}
	return 0;
	}

}

