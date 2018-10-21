package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String c = new String(new char[101]);
		c = new Scanner(System.in).nextLine();
		int len;
		len = c.length();
		int i;
		for (i = 0;i < len;i++)
		{
			if (i == len - 1)
			{
				System.out.printf("%c",c.charAt(i) + (c.charAt(0) - ' ' + 32));
			}
			else
			{
				System.out.printf("%c",c.charAt(i) + (c.charAt(i + 1) - ' ' + 32));
			}
		}
	}
}
