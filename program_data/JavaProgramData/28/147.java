package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		final String a = "";
		final String c = "";
		int i;
		int j;
		int k = 0;
		a = new Scanner(System.in).nextLine();
		for (i = 0;a.charAt(i) != '\0';)
		{
			if (a.charAt(i) == 32)
			{
				i++;
			}
			else
			{
			for (j = 0;a.charAt(i) != 32 && a.charAt(i) != '\0';i++, j++)
			{
				c = tangible.StringFunctions.changeCharacter(c, j, a.charAt(i));
			}
			c = tangible.StringFunctions.changeCharacter(c, j, '\0');
			if (k == 0)
			{
				System.out.printf("%d",c.length());
			}
			else
			{
				System.out.printf(",%d",c.length());
			}
			i++;
			k++;
			}
		}
	}
}

