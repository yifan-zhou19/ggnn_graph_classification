package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int t;
		int[][] tri = new int[100][100];
		int h;
		int l;
		int[] point = tri[0];
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1;i <= t;i++)
		{
			h = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			l = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			int temp = 0;
			for (int p = 1;p <= h;p++)
			{
				for (int q = 1;q <= l;q++)
				{
					point[100 * p + q] = ConsoleInput.readToWhiteSpace(true);
					if (p == 1 || q == 1 || p == h || q == l)
					{
						temp += point[100 * p + q];
					}
				}
			}
			System.out.print(temp);
			System.out.print("\n");
		}

		return 0;
	}


}

