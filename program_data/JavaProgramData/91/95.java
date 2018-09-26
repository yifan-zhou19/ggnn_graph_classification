package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		final String c = "";
		c = new Scanner(System.in).nextLine();
		n = c.length();
		for (i = 0;i < n - 1;i++)
		{
			System.out.printf("%c",c.charAt(i) + c.charAt(i + 1));
		}
		System.out.printf("%c",c.charAt(0) + c.charAt(n - 1));
		return 0;
	}
}
