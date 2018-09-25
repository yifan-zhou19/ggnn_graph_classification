package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[6][6]; //??????a[6][6]
		int i; //??????i,j,????t
		int j;
		int t = 0;
		int[] max = new int[6]; //????????max[6],??????min[6]???row,??colum
		int[] min = new int[6];
		int[] row = {1, 1, 1, 1, 1, 1};
		int[] colum = {1, 1, 1, 1, 1, 1};
		for (i = 1;i <= 5;i++) //?????a[6][6]
		{
			for (j = 1;j <= 5;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				max[i] = a[i][1]; //????????a[i][1]
				min[j] = a[1][j]; //????????a[1][j]
			}
		}
		for (i = 1;i <= 5;i++) //????????5?????
		{
			for (j = 2;j <= 5;j++)
			{
				if (a[i][j] > max[i])
				{
					max[i] = a[i][j]; //??i??????max[i]
					colum[i] = j; //??i???????????colum[i]
				}
			}
		}
		for (j = 1;j <= 5;j++) //????
		{
			for (i = 2;i <= 5;i++)
			{
				if (a[i][j] < min[j])
				{
					min[j] = a[i][j];
					row[j] = i;
				}
			}
		}
		for (i = 1;i <= 5;i++) //?????5?????5????????
		{
			for (j = 1;j <= 5;j++)
			{
				if (max[i] == min[j]) //??i???????j????
				{
					System.out.print(row[j]);
					System.out.print(' ');
					System.out.print(colum[i]);
					System.out.print(' ');
					System.out.print(max[i]);
					System.out.print("\n");
					t = t + 1; //t?1
					break; //????
				}
			}
		}
		if (t == 0) //?t=0
		{
			System.out.print("not found");
			System.out.print("\n");
		}
		return 0;
	}

}

