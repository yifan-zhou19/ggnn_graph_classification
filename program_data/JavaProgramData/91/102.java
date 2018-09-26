package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n = 0;
		String c = new String(new char[101]);
		c = new Scanner(System.in).nextLine();
		for (i = 0;c.charAt(i) != '\0';i++)
		{
			n++;
		}
		for (i = 0;c.charAt(i) != '\0';i++)
		{
			if (i < n - 1)
			{
				System.out.printf("%c",c.charAt(i) + c.charAt(i + 1));
			}
			if (i == n - 1)
			{
				System.out.printf("%c",c.charAt(i) + c.charAt(0));
			}
		}
		return 0;
	}

}
