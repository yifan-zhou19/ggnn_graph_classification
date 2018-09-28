package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[2];
		int i;
		int j;
		int[][] b = new int[2][100];
		int p;
		int[] c = new int[100];
		int s;
		int t;

		for (i = 0;i < 2;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Integer.parseInt(tempVar);
			}
		}

		for (i = 0;i < 2;i++)
		{
			for (j = 0;j < a[i];j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					b[i][j] = Integer.parseInt(tempVar2);
				}
			}
		}

			for (i = 0;i < 2;i++)
			{
				for (s = 0;s < a[i] - 1;s++)
				{
					for (t = 0;t < a[i] - 1 - s;t++)
					{
						if (b[i][t] > b[i][t + 1])
						{
							p = b[i][t];
							b[i][t] = b[i][t + 1];
							b[i][t + 1] = p;
						}
					}
				}
			}

						for (i = 0;i < a[0];i++)
						{
							c[i] = b[0][i];
						}
						for (j = 0;j < a[1];j++)
						{
							c[a[0] + j] = b[1][j];
						}

						for (s = 0;s < a[0] + a[1] - 1;s++)
						{
							System.out.printf("%d ",c[s]);
						}
							System.out.printf("%d",c[a[0] + a[1] - 1]);

	}













}

