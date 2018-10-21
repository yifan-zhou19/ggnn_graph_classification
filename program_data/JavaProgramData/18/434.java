package <missing>;

public class GlobalMembers
{
	public static int[][] a = new int[100][100];
	public static int t = 0;
	public static int sum(int n, int[][] a)
	{
		if (n == 1)
		{
			return 1;
		}
		int i;
		int j;
		int k;
		int min;
		for (j = 0;j < n;j++)
		{
				min = a[j][0];
				for (k = 1;k < n;k++)
				{
					if (a[j][k] < min)
					{
						min = a[j][k];
					}
				}
				for (k = 0;k < n;k++)
				{
					a[j][k] -= min; //????
				}
		}
		 for (j = 0;j < n;j++)
		 {
				min = a[0][j];
				for (k = 1;k < n;k++)
				{
					if (a[k][j] < min)
					{
						min = a[k][j];
					}
				}
				for (k = 0;k < n;k++)
				{
					a[k][j] -= min;
				}
		 } //????

			 t += a[1][1]; //??????
			 for (i = 0;i < n;i++)
			 {
				 for (j = 1;j < n - 1;j++)
				 {
					 a[i][j] = a[i][j + 1];

				 }
			 }
			for (i = 1;i < n - 1;i++)
			{
				 for (j = 0;j < n - 1;j++)
				 {
					 a[i][j] = a[i + 1][j];
				 }
			} //??

			sum(n - 1, a);
			 return t;

	}




	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)

			{
				for (k = 0;k < n;k++)
				{
					a[j][k] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			System.out.print(sum(n, a));
			System.out.print("\n");
			t = 0;
		}
		return 0;
	}

}

