package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int k;
		final String a = "";
		final String b = "";
		final String c = "";
		final String d = "";
		c = new Scanner(System.in).nextLine();
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		for (i = 0;;)
		{
			for (j = 0;c.charAt(i) != ' ' && c.charAt(i) != '\0';i++, j++)
			{
				d = tangible.StringFunctions.changeCharacter(d, j, c.charAt(i));
			}
			d = tangible.StringFunctions.changeCharacter(d, j, '\0');
			if (strcmp(d,a) == 0)
			{
				System.out.printf("%s",b);
			}
			else
			{
				for (k = 0;k < j;k++)
				{
					System.out.printf("%c",d.charAt(k));
				}
			}
			if (c.charAt(i) != '\0')
			{
				System.out.print(" ");
			}
			else
			{
				break;
			}
			i++;
		}
	}



}

