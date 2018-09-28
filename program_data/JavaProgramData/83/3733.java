package <missing>;

public class GlobalMembers
{
	public static int Main()


	{
		int n;
		int i;
		int j;

			 float y = 0F;
			 float z = 0F;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		int[][] sz = new int[2][n];

		float x;

		for (i = 0;i < n;i++)

		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sz[0][i] = Integer.parseInt(tempVar2);
			}

			y += sz[0][i];

		}


		for (j = 0;j < n;j++)

		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				sz[1][j] = Integer.parseInt(tempVar3);
			}

			if (sz[1][j] >= 90 && sz[1][j] <= 100)
			{
				x = 4.0 * sz[0][j];
			}

			if (sz[1][j] >= 85 && sz[1][j] <= 89)
			{
				x = 3.7 * sz[0][j];
			}

			if (sz[1][j] >= 82 && sz[1][j] <= 84)
			{
				x = 3.3 * sz[0][j];
			}

			if (sz[1][j] >= 78 && sz[1][j] <= 81)
			{
				x = 3.0 * sz[0][j];
			}

			if (sz[1][j] >= 75 && sz[1][j] <= 77)
			{
				x = 2.7 * sz[0][j];
			}

			if (sz[1][j] >= 72 && sz[1][j] <= 74)
			{
				x = 2.3 * sz[0][j];
			}

				if (sz[1][j] >= 68 && sz[1][j] <= 71)
				{
					x = 2.0 * sz[0][j];
				}

					if (sz[1][j] >= 64 && sz[1][j] <= 67)
					{
						x = 1.5 * sz[0][j];
					}

						if (sz[1][j] >= 60 && sz[1][j] <= 63)
						{
							x = 1.0 * sz[0][j];
						}
						if (sz[1][j] < 60)
						{
							x = 0 * sz[0][j];
						}
		z += x;

		}



		float GPA;

		GPA = z / y;

	System.out.printf("%.2f",GPA);

	return 0;

	}
}

