package <missing>;

public class GlobalMembers
{
	//------------------------
	//   ?????????
	//      2010/12/5
	//        ADE
	//------------------------



	public static int GuiLing(int[][] a, int n, int sum)
	{
		int min;
		int i;
		int j;
		for (i = 0;i < n;i++)
		{
			min = a[i][0];
			for (j = 0;j < n;j++)
			{
				min = (min < a[i][j])?min:a[i][j];
			}
			for (j = 0;j < n;j++)
			{
				a[i][j] -= min;
			}
		} //???
		for (j = 0;j < n;j++)
		{
			min = a[0][j];
			for (i = 0;i < n;i++)
			{
				min = (min < a[i][j])?min:a[i][j];
			}
			for (i = 0;i < n;i++)
			{
				a[i][j] -= min;
			}
		} //???
		if (n > 2) //????2*2
		{
			sum = sum + a[1][1];
			for (i = 2;i < n;i++)
			{
				for (j = 0;j < n;j++)
				{
					a[i - 1][j] = a[i][j]; //??????
				}
			}
			for (j = 2;j < n;j++)
			{
				for (i = 0;i < n - 1;i++)
				{
					a[i][j - 1] = a[i][j]; //??????
				}
			}
			return GuiLing(a, n - 1, sum);
		}
		else
		{
			return sum + a[1][1];
		}
	}

	public static int Main()
	{
		int n;
		int i;
		int[][] a = new int[101][101];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			for (int j = 0;j < n;j++)
			{
				for (int k = 0;k < n;k++)
				{
					a[j][k] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			System.out.print(GuiLing(a, n, 0));
			System.out.print("\n");
		}
		return 0;
	}
}

