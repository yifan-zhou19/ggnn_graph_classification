package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int len;
		String word = new String(new char[30]);
		word = ConsoleInput.readToWhiteSpace(true).charAt(0);
		len = word.length();
		System.out.print(len);
		while ((word = ConsoleInput.readToWhiteSpace(true).charAt(0)).length() > 0)
		{
			len = word.length();
			System.out.print(",");
			System.out.print(len);
		}
		System.out.print("\n");
		return 0;
	}
}

