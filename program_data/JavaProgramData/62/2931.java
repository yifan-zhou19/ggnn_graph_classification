package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String c = new String(new char[10000]);
		int i;
		int n;
		c = new Scanner(System.in).nextLine();
		for (i = 0;c.charAt(i) != '\0';i++)
		{
			if (c.charAt(i) != ' ')
			{
				System.out.printf("%c",c.charAt(i));
			}
			else if (c.charAt(i) == ' ' && c.charAt(i + 1) != ' ')
			{
				System.out.printf("%c",c.charAt(i));
			}
		}
	}
}
