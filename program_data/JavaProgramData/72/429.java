package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[][] a = new int[22][22];
		for (i = 1 ; i <= m ; i++)
		{
			for (j = 1; j <= n ; j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		int[][] b = new int[400][2];
		int count = 0;
		for (i = 1 ; i <= m ; i++)
		{
			for (j = 1 ; j <= n ; j++)
			{
				if ((a[i][j] >= a[i - 1][j]) && (a[i][j] >= a[i + 1][j]) && (a[i][j] >= a[i][j - 1]) && (a[i][j] >= a[i][j + 1]))
				{
					b[count][0] = i - 1;
					b[count][1] = j - 1;
					count++;
				}
			}
		}
		for (i = 0 ; i < count - 1 ; i++)
		{
			for (j = 0 ; j < count - i - 1 ;i++)
			{
				if (b[j][1] > b[j + 1][1])
				{
					int temp1;
					int temp2;
					temp1 = b[j][0];
					b[j][0] = b[j + 1][0];
					b[j + 1][0] = temp1;
					temp2 = b[j][1];
					b[j][1] = b[j + 1][1];
					b[j + 1][1] = temp2;
				}
			}
		}
		for (i = 0 ; i < count - 1 ; i++)
		{
			for (j = 0 ; j < count - 1 - i ;j++)
			{
				if (b[j][0] > b[j + 1][0])
				{
					int temp3;
					int temp4;
					temp3 = b[j][0];
					b[j][0] = b[j + 1][0];
					b[j + 1][0] = temp3;
					temp4 = b[j][1];
					b[j][1] = b[j + 1][1];
					b[j + 1][1] = temp4;
				}
			}
		}
		for (i = 0 ; i < count ; i++)
		{
			System.out.print(b[i][0]);
			System.out.print(" ");
			System.out.print(b[i][1]);
			System.out.print("\n");
		}
		return 0;
	}





}

