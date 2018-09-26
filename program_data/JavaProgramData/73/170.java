package <missing>;

public class GlobalMembers
{
	//**********************
	//* ??? ????    *
	//* ??? 1200012878  *
	//* 11?9?            *
	//**********************
	public static int Main()
	{
		int[][] a =
		{
			{0, 0, 0, 0, 0}
		};
		int[] max = new int[5];
		int[] min = new int[5];
		int i;
		int j;
		int flag = 0;
		for (i = 0; i <= 4; i++)
		{
			for (j = 0; j <= 4; j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 0; i <= 4; i++)
		{
			max[i] = a[i][0];
			min[i] = a[0][i];
			for (j = 1; j <= 4; j++)
			{
				if (a[i][j] > max[i])
				{
					max[i] = a[i][j];
				}
				if (a[j][i] < min[i])
				{
					min[i] = a[j][i];
				}
			}
		}
		for (i = 0; i <= 4; i++)
		{
			for (j = 0; j <= 4; j++)
			{
				if (a[i][j] == max[i] && a[i][j] == min[j])
				{
					System.out.print(i + 1);
					System.out.print(" ");
					System.out.print(j + 1);
					System.out.print(" ");
					System.out.print(a[i][j]);
					System.out.print("\n");
					flag = 1;
				}
			}
		}
		if (flag == 0)
		{
			System.out.print("not found");
		}
		return 0;
	}







}

