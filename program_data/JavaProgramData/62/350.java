package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		final int MAXN = 300;
		String str = new String(new char[MAXN]);
		str = new Scanner(System.in).nextLine();
		int i;
		System.out.printf("%c", str.charAt(0));
		for (i = 1; i < str.length(); ++i)
		{
			if (str.charAt(i - 1) == ' ' && str.charAt(i) == ' ')
			{
			   continue;
			}
			else
			{
				System.out.printf("%c", str.charAt(i));
			}
		}
		System.out.print("\n");
		return 0;
	}

}
