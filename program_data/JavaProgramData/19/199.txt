package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[100]);
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		s = new Scanner(System.in).nextLine();
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		int i;
		int j = 0;
		int k = 0;
		final String c = "";
		for (i = 0;s.charAt(i) != '\0';i++)
		{
			if (s.charAt(i) != ' ')
			{
				c.charAt(j)[k] = s.charAt(i);
				k++;
			}
			else
			{
				j++;
				k = 0;
			}
		}
		for (i = 0;i <= j;i++)
		{
			if (strcmp(c.charAt(i),a) == 0)
			{
				c = tangible.StringFunctions.changeCharacter(c, i, b);
			}
		}
		for (i = 0;i <= j;i++)
		{
			if (i == 0)
			{
			System.out.printf("%s",c.charAt(i));
			}
			else
			{
			System.out.printf(" %s",c.charAt(i));
			}
		}
		return 0;
	}

}

