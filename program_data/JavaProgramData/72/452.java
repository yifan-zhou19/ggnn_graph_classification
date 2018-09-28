package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int[][] height = new int[20][20];
		int i;
		int j;
		int count = 0;
		int[] a = new int[401];
		int[] b = new int[401];
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < m; i++)
		{
			for (j = 0; j < n; j++)
			{
				height[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		if (height[0][0] >= height[0][1] != 0 && height[0][0] >= height[1][0])
		{
			a[count] = 0;
			b[count] = 0;
			count++;
		}
		for (j = 1; j < n - 1; j++)
		{
			if (height[0][j] >= height[0][j - 1] != 0 && height[0][j] >= height[0][j + 1] != 0 && height[0][j] >= height[1][j])
			{
				a[count] = 0;
				b[count] = j;
				count++;
			}
		}
		if (height[0][n - 1] >= height[0][n - 2] != 0 && height[0][n - 1] >= height[1][n - 1])
		{
				a[count] = 0;
				b[count] = n - 1;
				count++;
		}
		for (i = 1; i < m - 1; i++)
		{
			if (height[i][0] >= height[i + 1][0] != 0 && height[i][0] >= height[i][1] != 0 && height[i][0] >= height[i - 1][0])
			{
				a[count] = i;
				b[count] = 0;
				count++;
			}
			for (j = 1; j < n - 1;j++)
			{
				if (height[i][j] >= height[i - 1][j] != 0 && height[i][j] >= height[i][j - 1] != 0 && height[i][j] >= height[i][j + 1] != 0 && height[i][j] >= height[i + 1][j])

				{
				a[count] = i;
			b[count] = j;
				count++;
				}
			}
		   if (height[i][n - 1] >= height[i][n - 2] != 0 && height[i][n - 1] >= height[i + 1][n - 1] != 0 && height[i][n - 1] >= height[i - 1][n - 1])
		   {
				a[count] = i;
				b[count] = n - 1;
				count++;
		   }
		}
		 if (height[m - 1][0] >= height[m - 1][1] != 0 && height[m - 1][0] >= height[m - 2][0])
		 {
				a[count] = m - 1;
				b[count] = 0;
				count++;
		 }
			for (j = 1; j < n - 1; j++)
			{
				if (height[m - 1][j] >= height[m - 1][j - 1] != 0 && height[m - 1][j] >= height[m - 1][j + 1] != 0 && height[m - 1][j] >= height[m - 2][j])
				{
					a[count] = m - 1;
					b[count] = j;
					count++;
				}
			}
			if (height[m - 1][n - 1] >= height[m - 1][n - 2] != 0 && height[m - 1][n - 1] >= height[m - 2][n - 1])
			{
					a[count] = m - 1;
					b[count] = n - 1;
					count++;
			}
			for (i = 0; i < count; i++)
			{
				System.out.print(a[i]);
				System.out.print(" ");
				System.out.print(b[i]);
				System.out.print("\n");
			}
		return 0;
	}




}

