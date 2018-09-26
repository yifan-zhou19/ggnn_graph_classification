package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] sz = new int[200][3];
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
		int j;
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < 3;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					sz[i][j] = Integer.parseInt(tempVar2);
				}
			}
		}

		int[] month = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

		int k;
		for (i = 0;i < n;i++)
		{


			int total = 0;

			if (sz[i][1] < sz[i][2])
			{
				if (sz[i][0] % 400 == 0 || (sz[i][0] % 4 == 0 && sz[i][0] % 100 != 0))
				{
				month[1] = 29;
				}
				else
				{
				month[1] = 28;
				}

				for (k = sz[i][1] - 1;k < sz[i][2] - 1;k++)
				{
					total += month[k];
				}




				if (total % 7 == 0)
				{
						System.out.print("YES\n");
				}
					else
					{
						System.out.print("NO\n");
					}
			}


			else
			{
				if (sz[i][0] % 400 == 0 || (sz[i][0] % 4 == 0 && sz[i][0] % 100 != 0))
				{
					 month[1] = 29;
				}
				  else
				  {
					month[1] = 28;
				  }
				 for (k = sz[i][2] - 1;k < sz[i][1] - 1;k++)
				 {
					 total += month[k];
				 }

					 if (total % 7 == 0)
					 {
						System.out.print("YES\n");
					 }
					else
					{
						System.out.print("NO\n");
					}
			}

		}

		return 0;
	}




}

