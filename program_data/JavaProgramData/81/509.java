package <missing>;

public class GlobalMembers
{
	public static int[][] array = new int[5][5];
	public static int change(int m,int n)
	{
		int i;
		int t;
		if (n >= 0 && n < 5 && m >= 0 && m < 5)
		{
			for (i = 0;i < 5;i++)
			{
				t = array[n][i];
				array[n][i] = array[m][i];
				array[m][i] = t;
			}
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static int Main()
	{
		int i;
		int j;
		int n;
		int m;
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
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				m = Integer.parseInt(tempVar3);
			}
			if (change(n, m) != 0)
			{
				for (i = 0;i < 5;i++)
				{
					for (j = 0;j < 5;j++)
					{
						System.out.printf("%d",array[i][j]);
						if (j != 4)
						{
							System.out.print(" ");
						}
						else
						{
							System.out.print("\n");
						}
					}
				}
			}
			else
			{
				System.out.print("error");
			}
					return 0;
	}

}

