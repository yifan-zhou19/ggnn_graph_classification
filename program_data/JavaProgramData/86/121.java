package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int a;
		int sum;
		int[][] num = new int[100][60];
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
				num[i][0] = Integer.parseInt(tempVar2);
			}
			for (j = 1; j <= num[i][0]; j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					num[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			if (num[i][0] == 0)
			{
				System.out.print("60\n");
			}
			else
			{
				a = num[i][0];
				if (num[i][a] + 3 * a > 60)
				{
					for (j = 1; j <= num[i][0]; j++)
					{
						if (num[i][j] + 3 * j == 61)
						{
							sum = 60 - 3 * j + 1;
							break;
						}
						else if (num[i][j] + 3 * j == 62)
						{
							sum = 60 - 3 * j + 2;
							break;
						}
						else if (num[i][j] + 3 * j == 63 || num[i][j] + 3 * j > 63)
						{
							sum = 60 - 3 * (j - 1);
							break;
						}
					}
				}
				else
				{
					sum = 60 - 3 * a;
				}
				System.out.printf("%d\n", sum);
			}
		}
		return 0;
	}
}

