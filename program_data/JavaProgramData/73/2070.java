package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i; //i,j,k??????p,q??????r,s?????????????
		int j;
		int k;
		int p = 0;
		int q = 0;
		int r;
		int s;
		int[][] a = new int[5][5]; //??????a[5][5]?????????????m[5]?????????????n[5]???????????
		int[] m = new int[5];
		int[] n = new int[5];
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
				if (a[i][j] > m[i])
				{
					m[i] = a[i][j];
					n[i] = j;
				}
			}
			j = 0;
		}
		i = 0;
		j = 0;
		for (i = 0;i < 5;i++)
		{
			j = n[i];
			for (k = 0;k < 5;k++)
			{
				if (a[k][j] < m[i])
				{
					p = 1;
					break;
				}
			}
			if (p == 1)
			{
				p = 0;
				continue;
			}
			else
			{
				r = i + 1;
				s = j + 1;
				System.out.print(r);
				System.out.print(' ');
				System.out.print(s);
				System.out.print(' ');
				System.out.print(m[i]);
				System.out.print("\n");
				q = 1;
				break;
			}
		}
		if (q == 0)
		{
			System.out.print("not found");
			System.out.print("\n");
		}
		return 0;
	}
}

