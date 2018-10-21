package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int w;
		int i;
		int j;
		int n;
		int[][] a = new int[12][2];
		w = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a[0][0] = w;
		for (i = 0;i < 12;i++)
		{
			if (i == 0 || i == 2 || i == 4 || i == 6 || i == 7 || i == 9 || i == 11)
			{
				n = 31;
			}
			else if (i == 1)
			{
				n = 28;
			}
				 else
				 {
					 n = 30;
				 }
			a[i][1] = a[i][0] + 12;
			a[i + 1][0] = a[i][0] + n;
			if (a[i][1] % 7 == 5)
			{
				System.out.print(i + 1);
				System.out.print("\n");
			}
		}
		return 0;
	}
}

