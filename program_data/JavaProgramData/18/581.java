package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[][] a = new int[101][101];
		int j;
		int k;
		int sum = 0;
		int[] min = new int[101];
		int l;
		int[] min1 = new int[101];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		l = n;
		for (k = 1;k <= l;k++)
		{

			for (i = 1;i <= l;i++)
			{
				for (j = 1;j <= l;j++)
				{
					a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

				}
			}
			 n = l;

		   while (n > 1)
		   {

			  for (i = 1;i <= n;i++)
			  {
				min[i] = a[i][1];
				for (j = 1;j <= n;j++)
				{
					if (min[i] > a[i][j])
					{
						min[i] = a[i][j];
					}

				}
			  }

			for (i = 1;i <= n;i++)
			{

				for (j = 1;j <= n;j++)
				{
					a[i][j] = a[i][j] - min[i];

				}
			}
			  for (j = 1;j <= n;j++)
			  {
				  min1[j] = a[1][j];
				  for (i = 1;i <= n;i++)
				  {
					  if (min1[j] > a[i][j])
					  {
						  min1[j] = a[i][j];
					  }
				  }
			  }
			  for (j = 1;j <= n;j++)
			  {
				  for (i = 1;i <= n;i++)
				  {
					  a[i][j] = a[i][j] - min1[j];
				  }
			  }




			sum = sum + a[2][2];
			for (j = 2;j < n;j++)
			{
				a[1][j] = a[1][j + 1];
			}
			for (i = 2;i < n;i++)
			{
				a[i][1] = a[i + 1][1];
			}
			for (i = 2;i < n;i++)
			{
				for (j = 2;j < n;j++)
				{
					a[i][j] = a[i + 1][j + 1];
				}
			}
			n--;
		   }
		   System.out.print(sum);
		   System.out.print("\n");
		   sum = 0;

		}

		return 0;
	}








}

