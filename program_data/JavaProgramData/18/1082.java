package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n; //n???????,r??????
		int r;
		int[][] mat = new int[100][100]; //??????
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int a = 0;a < n;a++) //??n???
		{
			int sum = 0; //sum????0
			r = n; //r????n
			for (int b = 0;b < n;b++) //?????????
			{
				for (int c = 0;c < n;c++)
				{
					mat[b][c] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			for (int d = 0;d < n - 1;d++) //??+??n-1?
			{
				int[] minh = new int[100]; //minh??????,minl??????
				int[] minl = new int[100];
				for (int d = 0;d < r;d++) //???
				{
					minh[d] = 9999999;
					minl[d] = 9999999;
				}
				for (int e = 0;e < r;e++) //?????
				{
					for (int f = 0;f < r;f++)
					{
						if (minh[e] > mat[e][f])
						{
							minh[e] = mat[e][f];
						}
					}
				}
				for (int g = 0;g < r;g++) //???
				{
					for (int h = 0;h < r;h++)
					{
						mat[g][h] -= minh[g];
					}
				}
				for (int e = 0;e < r;e++) //?????
				{
					for (int f = 0;f < r;f++)
					{
						if (minl[f] > mat[e][f])
						{
							minl[f] = mat[e][f];
						}
					}
				}
				for (int g = 0;g < r;g++) //???
				{
					for (int h = 0;h < r;h++)
					{
						mat[g][h] -= minl[h];
					}
				}
				sum += mat[1][1]; //??sum
				for (int g = 1;g < r - 1;g++) //???
				{
					for (int h = 0;h < r;h++)
					{
						mat[g][h] = mat[g + 1][h];
					}
				}
				for (int h = 1;h < r - 1;h++) //???
				{
					for (int g = 0;g < r - 1;g++)
					{
						mat[g][h] = mat[g][h + 1];
					}
				}
				r--; //????,????-1
			}
			System.out.print(sum);
			System.out.print("\n");
		}
		return 0;
	}
}

