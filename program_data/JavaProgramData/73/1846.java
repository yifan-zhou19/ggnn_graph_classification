package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[5][5];
		int[] b = new int[5];
		int[] c = new int[5];
		int[] b1 = new int[5];
		int[] c1 = new int[5];
		int[] a1 = new int[5];
		int[] a2 = new int[5];
		int i = 0;
		int j = 0;
		int k = 0;
		int p = 0;
		int m = 0;
		int n = 0;
		int max;
		int min;
		int count = 0;
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 0;i < 5;i++)
		{
			max = a[i][0];
			b[k] = i;
			c[k] = 0;
			for (j = 0;j < 5;j++)
			{
				if (a[i][j] > max)
				{
					max = a[i][j];
					b[k] = i;
					c[k] = j;
				}
			}
			a1[k] = max;
			k++;
			max = 0;
		}
		for (m = 0;m < 5;m++)
		{
			min = a[0][m];
			b1[p] = 0;
			c1[p] = m;
			for (n = 0;n < 5;n++)
			{
				if (a[n][m] < min)
				{
					min = a[n][m];
					b1[p] = n;
					c1[p] = m;
				}
			}
			a2[p] = min;
			p++;
			min = 0;
		}
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				if (a1[j] == a2[i] && b[j] == b1[i] && c[j] == c1[i])
				{
					System.out.print(b[j] + 1);
					System.out.print(' ');
					System.out.print(c[j] + 1);
					System.out.print(' ');
					System.out.print(a1[j]);
					System.out.print("\n");
				}
				else
				{
					count++;
				}
			}
		}
		if (count == 25)
		{
			System.out.print("not found");
			System.out.print("\n");
		}
		return 0;
	}
}

