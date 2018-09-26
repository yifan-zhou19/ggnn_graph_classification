package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String c = new String(new char[30]);
		int i;
		int n;
		c = new Scanner(System.in).nextLine();
		n = c.length();
		for (i = 0;i < n;i++)
		{
			if (((c.charAt(i) >= '0') && (c.charAt(i) <= '9')) && ((c.charAt(i + 1) >= '0') && (c.charAt(i + 1) <= '9')))
			{
				System.out.printf("%c",c.charAt(i));
			}
			else if (((c.charAt(i) >= '0') && (c.charAt(i) <= '9')) && ((c.charAt(i + 1) < '0') || (c.charAt(i + 1)>'9')))
			{
				System.out.printf("%c\n",c.charAt(i));
			}
		}
	}
}
