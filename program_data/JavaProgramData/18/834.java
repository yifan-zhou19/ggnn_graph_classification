package <missing>;

public class GlobalMembers
{
	public static int[][] map = new int[100][100];
	public static int sum = 0;
	public static int min = 1000;
	public static int[] rst = new int[100];
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
				for (j = 0;j < n;j++)
				{
				for (k = 0;k < n;k++)
				{
					String tempVar2 = ConsoleInput.scanfRead();
					if (tempVar2 != null)
					{
						map[j][k] = Integer.parseInt(tempVar2);
					}
				}
				}
				for (t = n;t > 1;t--) //do 't' times
				{
					for (j = 0;j < t;j++) // decrease
					{
							for (k = 0;k < t;k++)
							{
								if (map[j][k] < min)
								{
								min = map[j][k];
								}
							}
						 for (k = 0;k < t;k++)
						 {
								map[j][k] = map[j][k] - min;
						 }
						 min = 1000;


					}

					min = 1000;
					for (k = 0;k < t;k++) // decrease
					{
							for (j = 0;j < t;j++)
							{
								if (map[j][k] < min)
								{
								min = map[j][k];
								}
							}
						 for (j = 0;j < t;j++)
						 {
								map[j][k] = map[j][k] - min;
						 }

						  min = 1000;

					}
					sum = sum + map[1][1]; //delete

					for (k = 1;k < t - 1;k++)
					{
						map[0][k] = map[0][k + 1];
					}
					for (j = 1;j < t - 1;j++)
					{
						map[j][0] = map[j + 1][0];
					}
					for (j = 1;j < t - 1;j++)
					{
					for (k = 1;k < t - 1;k++)
					{
						map[j][k] = map[j + 1][k + 1];
					}
					}

					min = 1000;

				}
				rst[i] = sum;
				sum = 0;
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%d\n",rst[i]);
		}
	}

}

