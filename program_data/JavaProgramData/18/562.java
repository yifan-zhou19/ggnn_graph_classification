package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int l;
		int m;
		double[][] a = new double[100][100];
		int min;
		int sum = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			sum = 0;
			for (j = 0;j < n;j++)
			{
			   for (k = 0;k < n;k++)
			   {
					 a[j][k] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			   }
			}
			for (l = 1;l < n;l++)
			{


				for (j = 0;j < n;j++)
				{
				   k = 0;
				   while (a[j][k] < 0)
				   {
					   k++;
				   }
				   while (k < n)
				   {
					min = a[j][k];
					for (;k < n;k++)
					{
					if (min > a[j][k] && a[j][k] >= 0)
					{
						min = a[j][k];
					}
					}
					for (k = 0;k < n;k++)
					{
					a[j][k] -= min;
					}
				   }
				}

				for (k = 0;k < n;k++)
				{
				   j = 0;
				   while (a[j][k] < 0)
				   {
					   j++;
				   }
				   while (j < n)
				   {
					min = a[j][k];
					for (j = 1;j < n;j++)
					{
					if (min > a[j][k] && a[j][k] >= 0)
					{
						min = a[j][k];
					}
					}
					for (j = 0;j < n;j++)
					{
					a[j][k] -= min;
					}
				   }
				}



				sum += a[l][l];
				for (m = 0;m < n;m++)
				{
					a[l][m] = -1;
					a[m][l] = -1;
				}


			}

			System.out.print(sum);
			System.out.print("\n");







		}

		return 0;
	}

}

