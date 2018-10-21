package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int t;
		int p;
		int j;
		int[][] a = new int[1000][30];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			a[i][0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (j = 1;j < a[i][0] * 2;j = j + 2)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			for (j = 2;j <= a[i][0] * 2;j = j + 2)
			{
				a[i][j] = 3;
			}
			for (j = j - 3;j >= 3;j = j - 2)
			{
				a[i][j] = a[i][j] - a[i][j - 2];
			}
			for (j = 1,t = 0;j <= a[i][0] * 2;j++)
			{
				t = t + a[i][j];
				if (t > 60)
				{
					if (j <= a[i][0] * 2)
					{
						j--;
					}
					break; //??????
				}
			}
			if ((j % 2 == 0 && t > 60) || t <= 60)
			{
				System.out.print(60 - (j / 2) * 3);
				System.out.print("\n");
			}
			else if (j % 2 == 1 && t > 60)
			{
				for (p = 1,t = 0;p < j + 1;p = p + 2)
				{
					t = a[i][p] + t; //????
				}
				System.out.print(t);
				System.out.print("\n");
			}
		}
	}
}

