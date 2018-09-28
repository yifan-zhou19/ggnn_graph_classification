package <missing>;

public class GlobalMembers
{
	public static int change1(int n)
	{
		return n % 10;
	}
	public static int change2(int n)
	{
		return n % 100 / 10;
	}
	public static int change3(int n)
	{
		return n / 100;
	}








	public static int Main()
	{

		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		String a = new String(new char[20]);
		int len;
		int relen = 0;
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		relen += a.length();
		System.out.print(a);
		for (int i = 0;i < n - 1;i++)
		{
			a = ConsoleInput.readToWhiteSpace(true).charAt(0);
			len = a.length();
			if (relen + 1 + len <= 80)
			{
				relen += 1 + len;
				System.out.print(' ');
				System.out.print(a);
			}
			else
			{
				System.out.print("\n");
				relen = a.length();
				System.out.print(a);
			}
		}

















		return 0;
	}
}

