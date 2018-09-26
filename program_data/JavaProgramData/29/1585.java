package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m = 0; //m?????????n
		int n = 0;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0; i < m; i++)
		{
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			double add = 2; //??????????
			double x = 2;
			double y = 1;
			for (int j = 1; j < n; j++)
			{
				x = x + y;
				y = x - y;
				add = add + x / y;
			}
			System.out.printf("%.3f", add);
			System.out.print("\n");
		}
		return 0;
	}
}

