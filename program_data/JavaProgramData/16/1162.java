package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[1000]);
		str = ConsoleInput.readToWhiteSpace(true).charAt(0);
		for (int i = str.length() - 1; i >= 0; i--)
		{
			System.out.print(str.charAt(i));
		}
		return 0;
	}

}

