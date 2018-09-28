package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String c = new String(new char[30]);
		int i;
		int x = 0;
		int y = 0;
		c = new Scanner(System.in).nextLine();
		for (i = 0;i < 30;i++)
		{
		y = y + 1;
		if (c.charAt(i) == '\0')
		{
				break;
		}
		}
		for (i = 0;i < y;i++)
		{
			if (c.charAt(i) == '1' || c.charAt(i) == '2' || c.charAt(i) == '3' || c.charAt(i) == '4' || c.charAt(i) == '5' || c.charAt(i) == '6' || c.charAt(i) == '7' || c.charAt(i) == '8' || c.charAt(i) == '9' || c.charAt(i) == '0')
			{
				System.out.printf("%c",c.charAt(i));
			x = 0;
			}
			else
			{
				if (x == 0)
				{
				System.out.print("\n");
				}
				x = x + 1;
			}
		}
		return 0;
	}
}
