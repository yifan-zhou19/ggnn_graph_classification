package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[80]);
		String b = new String(new char[80]);
		int i;
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		for (i = 0;i <= 79;i++)
		{
			if (a.charAt(i) > 90)
			{
				a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) - 32);
			}
			if (b.charAt(i) > 90)
			{
				b = tangible.StringFunctions.changeCharacter(b, i, b.charAt(i) - 32);
			}
			if (a.charAt(i) == b.charAt(i))
			{
				if (a.charAt(i) == '\0')
				{
					System.out.print("=");
					break;
				}
				else
				{
					continue;
				}
			}
			else if (a.charAt(i) > b.charAt(i))
			{

	System.out.print(">");
	break;
			}
			else
			{

		System.out.print("<");
		break;
			}

		}
		return 0;
	}


}

