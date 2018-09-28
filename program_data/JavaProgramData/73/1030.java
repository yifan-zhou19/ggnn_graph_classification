package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[5][5];
		int f = 0;
		int min = INT_MAX;
		int temp;
		int I = 0;
		for (int i = 0;i < 5;i++)
		{
			for (int j = 0;j < 5;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					a[i][j] = Integer.parseInt(tempVar);
				}
			}
		}
		do
		{
			for (int i = 0;i < 5;i++)
			{
				if (min >= a[i][f])
				{
					min = a[i][f];
					temp = i;
				}
			}
			for (int j = 0;j < 5;j++)
			{
				if (min < a[temp][j])
				{
					break;
				}
				if (j == 4)
				{
					System.out.print(temp + 1);
					System.out.print(" ");
					System.out.print(f + 1);
					System.out.print(" ");
					System.out.print(min);
					System.out.print("\n");
					I++;
				}
			}
			f++;
			min = INT_MAX;
		}while (f < 5);
		if (I == 0)
		{
			System.out.print("not found");
			System.out.print("\n");
		}
		return 0;
	}
}

