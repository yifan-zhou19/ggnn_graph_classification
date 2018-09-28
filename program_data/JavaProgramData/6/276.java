package <missing>;

public class GlobalMembers
{
	public static int bianyuan(int n,int m)
	{
		int[][] juzhen = new int[100][100];
		int i;
		int j;
		int result;
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < m;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					juzhen[i][j] = Integer.parseInt(tempVar);
				}
			}
		}
		result = 0;
		for (j = 0;j < m;j++)
		{
			result += juzhen[0][j];
		}
		for (j = 0;j < m;j++)
		{
			result += juzhen[n - 1][j];
		}
		for (i = 1;i < n - 1;i++)
		{
			result += juzhen[i][0];
		}
		for (i = 1;i < n - 1;i++)
		{
			result += juzhen[i][m - 1];
		}
		return result;
	}
	public static int Main()
	{
		int n;
		int i;
		int a;
		int lie;
		int hang;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				lie = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				hang = Integer.parseInt(tempVar3);
			}
			a = bianyuan(lie, hang);
			System.out.printf("%d\n",a);
		}
		return 0;
	}
}

