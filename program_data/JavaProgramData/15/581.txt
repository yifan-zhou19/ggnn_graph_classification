package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int n;
		int m;
		int sum;
		int num;
		int lon;
		int wid;
		int[][] c = new int[100][100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
			for (i = 0;i < n;i++)
			{
				for (j = 0;j < n;j++)
				{
					String tempVar2 = ConsoleInput.scanfRead();
					if (tempVar2 != null)
					{
						(c[i][j]) = Integer.parseInt(tempVar2);
					}
				}
			}
			for (i = 0;i < n;i++)
			{
				sum = 0;
				for (j = 0;j < n;j++)
				{
					if (c[i][j] == 0)
					{
						sum += 1;
					}

					if (sum > 2)
					{
						lon = sum;
					}
				}
			}
			for (j = 0;j < n;j++)
			{
				num = 0;
				for (i = 0;i < n;i++)
				{
					if (c[i][j] == 0)
					{
						num += 1;
					}
										 if (num > 2)
										 {
						wid = num;
										 }
				}
			}
				m = (lon - 2) * (wid - 2);
				System.out.printf("%d\n",m);
	}




}

