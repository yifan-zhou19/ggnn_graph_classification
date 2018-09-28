package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int a = 0;
		final String c = "";
		c = new Scanner(System.in).nextLine();
		for (i = 0;i < c.length();i++)
		{
			if (c.charAt(i) != '\0')
			{
				if (c.charAt(i) > 47 && c.charAt(i) < 58)
				{
					for (j = i;j <= c.length();j++)
					{
						if (c.charAt(j) < 48 || c.charAt(j)>57)
						{
							System.out.print("\n");
							i = j;
							break;
						}
						System.out.printf("%c",c.charAt(j));
					}
				}
			}
		}
		return 0;
	}
}
