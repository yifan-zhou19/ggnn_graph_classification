package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int[] num = new int[maxx];

	public static int com(int x)
	{
		if (x == 1 || x == 2)
		{
			return 1;
		}
		return com(x - 1) + com(x - 2);
	}
	public static int Main()
	{
		int temp;
		while ((n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			while (n-- != 0)
			{
				temp = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				System.out.print(com(temp));
				System.out.print("\n");
			}
		}
		return 0;
	}
}

