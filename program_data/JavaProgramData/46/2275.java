package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int i;
		int j;
		int[][] matrix = new int[100][100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < a;i++)
		{
			for (j = 0;j < b;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					matrix[i][j] = Integer.parseInt(tempVar3);
				}
				System.in.read();
			}
		}
		while (a > 0 && b > 0)
		{
			for (i = 0;i < b;i++)
			{
				System.out.printf("%d\n",matrix[0][i]);
			}
			for (i = 1;i < a;i++)
			{
				System.out.printf("%d\n",matrix[i][b - 1]);
			}
			if (b > 1 && a > 1)
			{
				for (i = b - 2;i >= 0;i--)
				{
					System.out.printf("%d\n",matrix[a - 1][i]);
				}
				for (i = a - 2;i >= 1;i--)
				{
					System.out.printf("%d\n",matrix[i][0]);
				}
			}
			for (i = 0;i < a - 2;i++)
			{
				for (j = 0;j < b - 2;j++)
				{
					matrix[i][j] = matrix[i + 1][j + 1];
				}
			}
			a = a - 2;
			b = b - 2;
		}
		return 0;
	}
}

