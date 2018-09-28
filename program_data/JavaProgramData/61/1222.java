package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int i;
		int x;
		int y;
		int temp;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while ((m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			x = 1;
			y = 1;
			for (i = 0;i < m - 2;i++)
			{
				x = y + x;
				temp = y;
				y = x;
				x = temp;
			}
		System.out.print(y);
		System.out.print("\n");
		}
		return 0;
	}
}

