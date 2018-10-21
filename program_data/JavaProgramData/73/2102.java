package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[5][5];
		int i = 0;
		int j = 0;
		int k = 0;
		int l = 0;
		int min;
		int max;
		int s = 0;
		int[] b = new int[5];
		int[] c = new int[5];
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 0,k = 0,j = 0;i < 5,k < 5;i++,k++,j = 0)
		{
			max = a[i][j];
			b[k] = 0;
			for (j = 0;j < 5;j++)
			{

				if (a[i][j] >= max)
				{
					max = a[i][j];
					b[k] = j;
				}
			}
		}
		for (j = 0,l = 0,i = 0;j < 5,l < 5;j++,l++,i = 0)
		{
			min = a[i][j];
			c[l] = 0;
			for (i = 0;i < 5;i++)
			{
				if (a[i][j] <= min)
				{
					min = a[i][j];
					c[l] = i;
				}
			}

		}
		for (l = 0;l < 5;l++)
		{
			for (k = 0;k < 5;k++)
			{
				if (l == b[k])
				{
					if (k == c[l])
					{
						System.out.print(k + 1);
						System.out.print(" ");
						System.out.print(l + 1);
						System.out.print(" ");
						System.out.print(a[k][l]);
						System.out.print("\n");
						s = 1;
					}
				}
			}

		}
		if (s == 0)
		{
			System.out.print("not found");
			System.out.print("\n");
		}
		return 0;
	}

}

