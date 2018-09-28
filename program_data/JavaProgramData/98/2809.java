package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String c = new String(new char[41]);
		int s = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int y = 0;
		for (int i = 0;i < n;i++)
		{

			int f = 0;
			c = ConsoleInput.readToWhiteSpace(true).charAt(0);
			s += c.length() + 1;
			if (s > 81)
			{
				System.out.print("\n");
				s = 0;
				s += c.length() + 1;
				f = 1;
			}
			else
			{
				if (y != 0)
				{
				System.out.print(" ");
				}
			}
			y = 1;
			System.out.print(c);
		}
		return 0;
	}
}

