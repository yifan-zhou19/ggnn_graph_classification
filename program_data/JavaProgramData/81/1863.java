package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[5][5];
		int[] temp = new int[5];
		int n;
		int m;
		int i;
		int j;
		for (i = 0;i <= 4;i++)
		{
			for (j = 0;j <= 4;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					a[i][j] = Integer.parseInt(tempVar);
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
		if (n >= 0 && n <= 4 && m >= 0 && m <= 4)
		{
			temp[0] = a[n][0];
			temp[1] = a[n][1];
			temp[2] = a[n][2];
			temp[3] = a[n][3];
			temp[4] = a[n][4];

			a[n][0] = a[m][0];
			a[n][1] = a[m][1];
			a[n][2] = a[m][2];
			a[n][3] = a[m][3];
			a[n][4] = a[m][4];

			a[m][0] = temp[0];
			a[m][1] = temp[1];
			a[m][2] = temp[2];
			a[m][3] = temp[3];
			a[m][4] = temp[4];


			for (j = 0;j <= 3;j++)
			{
					System.out.printf("%d ",a[0][j]);
			}
			System.out.printf("%d",a[0][4]);
			System.out.print("\n\n");

				for (j = 0;j <= 3;j++)
				{
					System.out.printf("%d ",a[1][j]);
				}
				System.out.printf("%d",a[1][4]);
			System.out.print("\n\n");

			for (j = 0;j <= 3;j++)
			{
					System.out.printf("%d ",a[2][j]);
			}
			System.out.printf("%d",a[2][4]);
			System.out.print("\n\n");

			for (j = 0;j <= 3;j++)
			{
					System.out.printf("%d ",a[3][j]);
			}
			System.out.printf("%d",a[3][4]);
			System.out.print("\n\n");

			for (j = 0;j <= 3;j++)
			{
					System.out.printf("%d ",a[4][j]);
			}
			System.out.printf("%d",a[4][4]);
			System.out.print("\n\n");









		}

		else
		{
			System.out.print("error\n");
		}

	return 0;
	}
}

