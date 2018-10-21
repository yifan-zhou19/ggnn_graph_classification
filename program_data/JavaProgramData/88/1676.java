package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String c = new String(new char[31]);
		int i;
		c = new Scanner(System.in).nextLine();
		if (c.charAt(0) >= 48 && c.charAt(0) <= 57)
		{
		System.out.printf("%C",c.charAt(0));
		}
		for (i = 1;i < 31;i++)
		{
			if (c.charAt(i) >= 48 && c.charAt(i) <= 57)
			{
			System.out.printf("%c",c.charAt(i));
			}
			else if (c.charAt(i - 1) >= 48 && c.charAt(i - 1) <= 57)
			{
				 System.out.print("\n");
			}
		}
	}
}
