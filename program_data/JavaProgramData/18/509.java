package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[][] a = new int[100][100];
		int N;
		int i;
		int j;
		int k;
		int l;
		int min;
		int sum = 0;
		N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < N;i++) //N???
		{
			for (j = 0;j < N;j++)
			{
				for (k = 0;k < N;k++)
				{
					a[j][k] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
				n = N;
				for (l = 0;l < N - 1;l++)
				{
				for (j = 0;j < n;j++)
				{
					min = a[j][0];
					for (k = 0;k < n;k++)
					{
						if (a[j][k] < min)
						{
							min = a[j][k];
						}
					}
					for (k = 0;k < n;k++)
					{
						a[j][k] = a[j][k] - min;
					}
				} //????
				for (k = 0;k < n;k++)
				{
					min = a[0][k];
					for (j = 0;j < n;j++)
					{
						if (a[j][k] < min)
						{
							min = a[j][k];
						}
					}
					for (j = 0;j < n;j++)
					{
						a[j][k] = a[j][k] - min;
					}
				} //????
				sum = sum + a[1][1]; //??
				for (k = 1;k < n - 1;k++)
				{
					for (j = 0;j < n;j++)
					{
						a[j][k] = a[j][k + 1]; //?????
					}
				}
					for (j = 1;j < n - 1;j++)
					{
						for (k = 0;k < n - 1;k++)
						{
							a[j][k] = a[j + 1][k]; //?????
						}
					}
						n = n - 1; //????????
				}
				System.out.print(sum);
				System.out.print("\n");
				sum = 0;

		}
		return 0;
	}


}

