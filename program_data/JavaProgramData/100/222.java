package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[501]);
		String c = new String(new char[26]);
		String b = new String(new char[26]);
		int i;
		int j;
		int sum = 0;
		a = new Scanner(System.in).nextLine();
		for (i = 0;i < 26;i++)
		{
			b = tangible.StringFunctions.changeCharacter(b, i, 'a' + i);
		}
		for (i = 0;i < 26;i++)
		{
			c = c.substring(0, i);
		}
		for (i = 0;i < 26;i++)
		{
			for (j = 0;a.charAt(j) != '\0';j++)
			{
				if (b.charAt(i) == a.charAt(j))
				{
					c = tangible.StringFunctions.changeCharacter(c, i, c.charAt(i) + 1);
				}
			}
		}
		for (i = 0;a.charAt(i) != '\0';i++)
		{
			sum = sum + c.charAt(i);
		}
		if (sum == 0)
		{
			System.out.print("No");
		}
		else
		{
			for (i = 0;i < 26;i++)
			{
				if (c.charAt(i) != 0)
				{
					System.out.printf("%c=%d\n",b.charAt(i),c.charAt(i));
				}
			}
		}
	}
}

