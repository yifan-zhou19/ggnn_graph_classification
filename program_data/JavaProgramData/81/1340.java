package <missing>;

public class GlobalMembers
{
	public static int[][] array = new int[5][5];
	public static int pp;

	public static int pd(int n,int m)
	{
		if ((n >= 0) && (n <= 4) && (m >= 0) && (m <= 4))
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}

	public static void change(int n,int m)
	{
		int t;
		int i;
		if (pd(n, m) != 0)
		{
			for (i = 0;i < 5;i++)
			{
				t = array[n][i];
				array[n][i] = array[m][i];
				array[m][i] = t;
			}
		}
		else
		{
			pp = 0;
			System.out.print("error");
		}
	}

	public static void print(int row)
	{
		int j;
		for (j = 0;j < 4;j++)
		{
			System.out.printf("%d ",array[row][j]);
		}
		System.out.printf("%d\n",array[row][4]);
	}

	public static int Main()
	{
		int i;
		int j;
		int n;
		int m;
		int t;

		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					array[i][j] = Integer.parseInt(tempVar);
				}
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
		pp = 1;
		change(n, m);

		if (pp != 0)
		{
		for (i = 0;i < 5;i++)
		{
			print(i);
		}
		}

		return 0;
	}

}

