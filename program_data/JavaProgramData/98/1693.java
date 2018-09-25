package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int len;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		String str = new String(new char[42]);
		str = ConsoleInput.readToWhiteSpace(true).charAt(0);
		System.out.print(str);
		int num = str.length();
		n = n - 1;
		while (n-- != 0)
		{
			str = ConsoleInput.readToWhiteSpace(true).charAt(0);
			len = str.length();
			num = num + len + 1;
			if (num <= 80)
			{
				System.out.print(' ');
				System.out.print(str);
			}
			else
			{
				System.out.print("\n");
				System.out.print(str);
				num = len;
			}
		}
		return 0;
	}
}

