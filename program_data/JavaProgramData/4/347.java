package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int i;
	int j;
	int[][] a = new int[100][100];
	int row;
	int col;
	int t = 0;
	int flag = 0;
	int max;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		row = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead(" ");
	if (tempVar2 != null)
	{
		col = Integer.parseInt(tempVar2);
	}
	for (i = 0;i < row;i++)
	{
		for (j = 0;j < col;j++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i][j] = Integer.parseInt(tempVar3);
			}
		}
	}
	max = (row > col)?row:col;
	for (i = 0,j = 0;;)
	{
		if (i < row && j < col)
		{
			System.out.printf("%d\n",a[i][j]);
		}
		if (i == max - 1 && j == max - 1)
		{
			break;
		}
		if (flag == 0)
		{
			if (j == 0 && i == max - 1)
			{
				flag = 1;
				t = max;
				j = max - 1;
			}
			else if (j == 0)
			{
				t = t + 1;
				j = t;
			}
			else
			{
				j = j - 1;
			}
		}
		else
		{
			if (i == max - 1)
			{
				t = t + 1;
				j = max - 1;
			}
			else
			{
				j = j - 1;
			}
		}
		i = t - j;
	}
	}
}

