package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		String c = new String(new char[300]);
		c = new Scanner(System.in).nextLine();
		i = 0;
		while (c.charAt(i) != 0)
		{
			if ((c.charAt(i) == ' ') && (c.charAt(i + 1) == ' '))
			{
				i++;
			}
			else
			{
				System.out.printf("%c",c.charAt(i));
				i++;
			}
		}
		return 0;
	}

}
