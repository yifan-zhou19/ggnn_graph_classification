package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String c = new String(new char[20]);
		String d = new String(new char[20]);
		int i;
		int logo = 1;
		c = new Scanner(System.in).nextLine();
		d = new Scanner(System.in).nextLine();
		for (i = 0; c.charAt(i) != '\0' && d.charAt(i) != '\0'; i++)
		{
			if (c.charAt(i) >= 'A' && c.charAt(i) <= 'Z')
			{
				c.charAt(i) += ('a'-'A');
			}
			if (d.charAt(i) >= 'A' && d.charAt(i) <= 'Z')
			{
				d.charAt(i) += ('a'-'A');
			}
			if (c.charAt(i) != d.charAt(i))
			{
				logo = 0;
				if (c.charAt(i) > d.charAt(i))
				{
					System.out.print(">\n");
					break;
				}
				else if (c.charAt(i) < d.charAt(i))
				{
					System.out.print("<\n");
					break;
				}
			}
		}
		if (logo == 1)
		{
			System.out.print("=\n");
		}
		return 0;
	}
}
