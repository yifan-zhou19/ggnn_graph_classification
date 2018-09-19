package <missing>;

public class GlobalMembers
{
	public static int jz(int[][] a, int k) //??????, ?????a[][],???k
	{
		int sum = 0;
		int min;
		int i;
		int j;
		int b;
		int judge = 0;
		for (b = k;b > 1;b--) //???b????????????
		{
			for (i = 0;i < b;i++)
			{
				min = a[i][0];
				for (j = 1;j < b;j++)
				{
					if (a[i][j] < min)
					{
						min = a[i][j]; //?????????
					}
				}
				for (j = 0;j < b;j++)
				{
					a[i][j] = a[i][j] - min; //??????
				}
			}
			for (i = 0;i < b;i++)
			{
				judge = 0;
				for (j = 1;j < b;j++)
				{
					if (a[j][i] == 0) //????0?,????
					{
						judge = 1;
						break;
					}
				}
				if (judge == 0)
				{
					min = a[0][i];
					for (j = 1;j < b;j++)
					{
						if (a[j][i] < min)
						{
							min = a[j][i];
						}
					}
					for (j = 0;j < b;j++)
					{
						a[j][i] = a[j][i] - min;
					}
				}
			}
			sum = sum + a[1][1]; //??a[1][1]
			for (i = 0;i < b;i++)
			{
				for (j = 2;j < b;j++)
				{
					a[i][j - 1] = a[i][j]; //? 2?????????
				}
			}
			for (i = 0;i < b;i++)
			{
				for (j = 2;j < b;j++)
				{
					a[j - 1][i] = a[j][i]; //?2?????????
				}
			}
		}
		return sum;
	}
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int[][] num = new int[100][100];
		int[] ans = new int[100];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				for (k = 0;k < n;k++)
				{
					num[j][k] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			ans[i] = jz(num, n); //????
		}
		for (i = 0;i < n;i++)
		{
			System.out.print(ans[i]);
			System.out.print("\n");
		}
		return 0;
	}
}

