package <missing>;

public class GlobalMembers
{
	//*****************************
	//*??? :????           *
	//*??   :???             *
	//*??   :2011?10?         *
	//*****************************
	public static int Main()
	{
		int[][] a = new int[5][5];
		int i = 0;
		int j = 0;
		int[] max = new int[5];
		int flag = 1;
		int[] q = new int[5];
		int[] min = {1000000, 1000000, 1000000, 1000000, 1000000};
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				if (a[i][j] > max[i])
				{
					max[i] = a[i][j];
					q[i] = j;
				}
			}
		}
		for (j = 0;j < 5;j++)
		{
			for (i = 0;i < 5;i++)
			{
				if (a[i][j] < min[j])
				{
					min[j] = a[i][j];
				}
			}
		}
		for (i = 0;i < 5;i++)
		{
				if (max[i] == min[q[i]])
				{
				System.out.print(i + 1);
				System.out.print(" ");
				System.out.print(q[i] + 1);
				System.out.print(" ");
				System.out.print(max[i]);
				flag = 0;
				}
		}

		if (flag == 1)
		{
			System.out.print("not found");
		}
		return 0;
	}



}

