package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
	int m = 0;
	int i;
		String a = new String(new char[80]);
		String b = new String(new char[80]);
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		for (i = 0;a.charAt(i) != '\0' && b.charAt(i) != '\0';i++)
		{
			if (a.charAt(i) >= 'A' && a.charAt(i) <= 'Z')
			{
				a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) - ('A'-'a'));
			}
			if (b.charAt(i) >= 'A' && b.charAt(i) <= 'Z')
			{
				b = tangible.StringFunctions.changeCharacter(b, i, b.charAt(i) - ('A'-'a'));
			}
		}
		for (i = 0;a.charAt(i) != '\0' && b.charAt(i) != '\0';i++)
		{
			if (a.charAt(i) > b.charAt(i))
			{
				System.out.print(">");
				m = 1;
				break;
			}
			else if (a.charAt(i) < b.charAt(i))
			{
				System.out.print("<");
				m = 1;
				break;
			}
		}
		if (m == 0)
		{
			System.out.print("=");
		}
	}





}

