package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[80]);
		String b = new String(new char[80]);
		char i;
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		for (i = 0;(a.charAt(i) != '\0') || (b.charAt(i) != '\0');i++)
		{
			if ((a.charAt(i) >= 'A') && (a.charAt(i) <= 'Z'))
			{
				a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) - 'A'+'a');
			}
			if ((b.charAt(i) >= 'A') && (b.charAt(i) <= 'Z'))
			{
				b = tangible.StringFunctions.changeCharacter(b, i, b.charAt(i) - 'A'+'a');
			}
		}
		i = 0;
		while ((a.charAt(i) == b.charAt(i)) && (a.charAt(i) != '\0'))
		{
			i++;
		}
		if ((a.charAt(i) == '\0') && (b.charAt(i) == '\0'))
		{
		 System.out.print("=\n");
		}
		else if (a.charAt(i) > b.charAt(i))
		{
			System.out.print(">\n");
		}
			else
			{
				System.out.print("<\n");
			}
	}

}

