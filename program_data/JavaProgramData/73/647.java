package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] c = new int[6][6]; //??a??????????????b????????????n????????
		int[] a = new int[6];
		int[] b = new int[6];
		int i;
		int j;
		int n = 0;
		for (i = 1; i <= 5; i++)
		{
		  for (j = 1; j <= 5; j++)
		  {
			c[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		  }
		}
		for (i = 1; i <= 5; i++)
		{
			a[i] = 1;
			b[i] = 1;
			for (j = 2; j <= 5; j++)
			{
				if (c[i][j] > c[i][a[i]])
				{
				  a[i] = j;
				}
				if (c[j][i] < c[b[i]][i])
				{
				  b[i] = j;
				}
			}
		}
		for (i = 1; i <= 5; i++)
		{
		  if (b[a[i]] == i)
		  {
				System.out.print(i);
				System.out.print(' ');
				System.out.print(a[i]);
				System.out.print(' ');
				System.out.print(c[i][a[i]]);
				System.out.print("\n");
				n++;
		  }
		}
		if (n == 0)
		{
		  System.out.print("not found");
		}
		return (0);
	}
}

