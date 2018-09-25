package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int len;
		String str = new String(new char[6]);

		str = ConsoleInput.readToWhiteSpace(true).charAt(0);
		len = str.length();
		for (int i = len - 1; i >= 0; i--)
		{
			System.out.print(str.charAt(i));
		}

		return 0;
	}
}

