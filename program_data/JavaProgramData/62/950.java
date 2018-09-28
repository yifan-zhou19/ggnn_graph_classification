package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] str = new char[101][101];
		int n = 1;
		String p = null;
		while ((str[n] = ConsoleInput.readToWhiteSpace(true).charAt(0)).length() > 0)
		{
			n++;
		}
		for (p = str + 1;p < str + n - 1;p++)
		{
			System.out.print(p);
			System.out.print(" ");
		}
		System.out.print(p);
		return 0;
	}
}

