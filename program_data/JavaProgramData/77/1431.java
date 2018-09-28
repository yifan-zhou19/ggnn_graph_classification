package <missing>;

public class GlobalMembers
{
	public static int i;
	public static int num;
	public static String s = new String(new char[102]);
		public static char c1;
		public static char c2;
	public static int sol()
	{
		if (i >= num)
		{
			return -1;
		}
		int n = i;
		char b = s.charAt(i++);
		if (b == c1)
		{
			System.out.print(n);
			System.out.print(" ");
			System.out.print(sol());
			System.out.print("\n");
			return sol();
		}
		else if (b == c2)
		{
			return n;
		}
	}
	public static int Main()
	{

		s = ConsoleInput.readToWhiteSpace(true).charAt(0);
		num = s.length();
		c1 = s.charAt(0);
		for (int i = 1;i < num;i++)
		{
			if (s.charAt(i) != c1)
			{
				c2 = s.charAt(i);
				break;
			}
		}
		sol();
	}
}

