package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[][] shuz = new int[5][5];
	int i;
	int j;
	for (i = 0;i < 5;i++)
	{
	for (j = 0;j < 5;j++)
	{
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		shuz[i][j] = Integer.parseInt(tempVar);
	}
	}
	}
	int m;
	int n;
	int f = new int(int m,int n);
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
	if (f(m, n) == 0)
	{
		System.out.print("error");
	}
	else if (f(m, n) == 1)
	{
		int[] s = new int[5];
		for (i = 0;i < 5;i++)
		{
			s[i] = shuz[m][i];
			shuz[m][i] = shuz[n][i];
			shuz[n][i] = s[i];
		}

	for (i = 0;i < 5;i++)
	{
		for (j = 0;j < 5;j++)
		{
		System.out.printf("%d",shuz[i][j]);
		if (j != 4)
		{
			System.out.print(" ");
		}
		}
	if (i != 4)
	{
		System.out.print("\n");
	}
	}
	}
	}
	public static int f(int m,int n)
	{
		if (m >= 0 && m <= 4 && n >= 0 && n <= 4)
		{
			return 1;
		}
	else
	{
		return 0;
	}
	}


}

