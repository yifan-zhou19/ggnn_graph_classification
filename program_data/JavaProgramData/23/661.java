package <missing>;

public class GlobalMembers
{
	public static char[][] str = new char[101][101];
	public static int n = 1;
	public static int Main()
	{
		while ((str[n] = ConsoleInput.readToWhiteSpace(true).charAt(0)).length() > 0)
		{
			n++;
		}
		for (n--;n > 1;n--)
		{
			System.out.print(str[n]);
			System.out.print(' ');
		}
		System.out.print(str[1]);
		return 0;
	}
}

