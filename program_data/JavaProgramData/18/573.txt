package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[][] a = new int[100][100];
		int ni;
		int[] minl = new int[100];
		int[] minh = new int[100];
		int i;
		int j;
		int k;
		int q;
		int sum;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (k = 0;k < n;k++)
		{
			sum = 0;
			for (i = 0;i < n;i++)
			{
				for (j = 0;j < n;j++)
				{
					a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			for (ni = n;ni > 1;ni--)
			{
				 for (i = 0;i < ni;i++) //??????
				 {
					minl[i] = a[i][0];
					   for (j = 0;j < ni;j++)
					   {
						if (minl[i] > a[i][j])
						{
							minl[i] = a[i][j];
						}
					   }
						for (j = 0;j < ni;j++)
						{
						a[i][j] = a[i][j] - minl[i];
						}
				 }
				for (j = 0;j < ni;j++)
				{
					minh[j] = a[0][j];
					for (i = 0;i < ni;i++)
					{
						if (minh[j] > a[i][j])
						{
							minh[j] = a[i][j];
						}
					}
					for (i = 0;i < ni;i++)
					{
						a[i][j] = a[i][j] - minh[j];
					}
				}
				sum += a[1][1];

				for (i = 0;i < ni;i++)
				{
					for (j = 1;j < ni - 1;j++)
					{
						a[i][j] = a[i][j + 1];
					}
				}

				for (j = 0;j < ni;j++)
				{
					for (i = 1;i < ni - 1;i++)
					{
						a[i][j] = a[i + 1][j];
					}
				}




			}
			System.out.print(sum);
			System.out.print("\n");

		}
















		return 0;
	}

}

