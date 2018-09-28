package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[][] input = new int[50000][2];
		int j;
		int a;
		int k;
		int b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < 2;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					input[i][j] = Integer.parseInt(tempVar2);
				}
			}
		}
		for (i = 0;i < n - 1;i++)
		{
			for (j = 0;j < n - 1 - i;j++)
			{
				if (input[j][0] > input[j + 1][0])
				{
					for (k = 0;k < 2;k++)
					{
						a = input[j][k];
						input[j][k] = input[j + 1][k];
						input[j + 1][k] = a;
					}
				}
			}
		}
		a = input[0][0];
		b = input[0][1];
		for (i = 0;i < n - 1;i++)
		{
			if (input[i + 1][0] >= a != 0 && input[i + 1][0] <= b)
			{
				if (b < input[i + 1][1])
				{
					b = input[i + 1][1];
				}
			}
			else
			{
				break;
			}
		}
		if (i < n - 1)
		{
			System.out.print("no");
		}
		else
		{
			System.out.printf("%d %d",a,b);
		}
		return 0;
	}


}

