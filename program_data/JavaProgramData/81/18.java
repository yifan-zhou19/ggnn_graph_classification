package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[6][6];
		int i;
		int j;
		int b;
		int c;
		int d;
		int e;
		for (i = 1;i <= 5;i++)
		{
			for (j = 1;j <= 5;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		c = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (b >= 0 && b <= 4 && c >= 0 && c <= 4)
		{
			b++;
			c++;
			for (i = 1;i <= 5;i++)
			{
				d = a[b][i];
				a[b][i] = a[c][i];
				a[c][i] = d;
			}
			for (i = 1;i <= 5;i++)
			{
				for (j = 1;j <= 5;j++)
				{
								   System.out.print(a[i][j]);
								   if (j < 5)
								   {
									   System.out.print(' ');
								   }
				}
				System.out.print("\n");
			}
		}
		else
		{
			System.out.print("error");
			System.out.print("\n");
		}
		return 0;
	}
}

