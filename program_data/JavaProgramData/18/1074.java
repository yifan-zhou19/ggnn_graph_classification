package <missing>;

public class GlobalMembers
{
	//**********************************
	//****       ??????     *****
	//****        1200016612       *****
	//**  ????????????  ****
	//**********************************
	public static int Main() //?????
	{
		int n = 0;
		int i = 0;
		int j = 0;
		int k = 0;
		int s = 0;
		int[] b = new int[100]; //??a[100][100]???n???????b[100]??????????a[1][1]???
		int[][] a = new int[100][100];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++) //??n?n???
		{
				for (j = 0;j < n;j++)
				{ //??n???
					for (k = 0;k < n;k++)
					{
						a[j][k] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
					}
				}
			for (s = n;s > 1;s--) //?????n-1?
			{
				int min1 = 10000;
				for (j = 0;j < n;j++) //??????????????????????????
				{
					min1 = 10000;
					for (k = 0;k < n;k++)
					{
						if (a[j][k] < min1)
						{
							min1 = a[j][k];
						}
					}
					for (k = 0;k < n;k++)
					{
						a[j][k] -= min1;
					}
				}
				for (j = 0;j < n;j++) //??????????????????????????
				{
					min1 = 10000;
					for (k = 0;k < n;k++)
					{
						if (a[k][j] < min1)
						{
							min1 = a[k][j];
						}
					}
					for (k = 0;k < n;k++)
					{
						a[k][j] -= min1;
					}
				}
				b[n - s] = a[1][1]; //??????a[1][1]
				for (j = 2;j < n;j++) //?a[1][1]?????????????
				{
					for (k = 0;k < n;k++)
					{
						a[k][j - 1] = a[k][j];
					}
				}
				for (k = 2;k < n;k++)
				{
					for (j = 0;j < n;j++)
					{
						a[k - 1][j] = a[k][j];
					}
				}
			}
			int sum = 0;
			for (k = 0;k < n - 1;k++) //??????????a[1][1]??
			{
				sum = sum + b[k];
			}
			System.out.print(sum);
			System.out.print("\n");
		}
		return 0;
	}
}

