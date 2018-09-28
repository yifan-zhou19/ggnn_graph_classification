package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int h;
		int l;
		int y;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p = null;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			y = 0;
			int[][] x = new int[101][101];
			h = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			l = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (j = 1;j <= h;j++)
			{
				for (k = 1;k <= l;k++)
				{
					x[j][k] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}


			for (p = x[1] + 1;p <= x[1] + l;p++)
			{
				y = y + (*p);

			}

			for (p = x[2] + 1;p <= x[h - 1] + 1;p = p + 101)
			{
				y = y + (*p) + (*(p + l - 1));
			}

			for (p = x[h] + 1;p <= x[h] + l;p++)
			{
				y = y + (*p);
			}
			System.out.print(y);
			System.out.print("\n");


		}

		return 0;
	}




}

