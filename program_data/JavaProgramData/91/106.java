package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		final String c = "";
		c = new Scanner(System.in).nextLine();
		n = (int)c.length();
		for (i = 0; i < n; i++)
		{
			if (i < n - 1)
			{
				System.out.printf("%c",c.charAt(i) + c.charAt(i + 1));
			}
			else
			{
				System.out.printf("%c",c.charAt(i) + c.charAt(0));
			}
		}
	}

}
