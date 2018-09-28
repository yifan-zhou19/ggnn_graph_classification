package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] s = new char[101][101];
		int i = 0;
		while ((s[i] = ConsoleInput.readToWhiteSpace(true).charAt(0)).length() > 0)
		{
			i++;
		}
		System.out.print(s[i - 1]);
		for (i - = 2; i >= 0; i--)
		{
			System.out.print(" ");
			System.out.print(s[i]);
		}
		return 0;
	}

}

