package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		n = 0;
		String a = new String(new char[80]);
		String b = new String(new char[80]);
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		for (i = 0;i < 80;i++)
		{
			if ((a.charAt(i) <= 'Z') && (a.charAt(i) >= 'A'))
			{
				a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) - 'A'+'a');
			}
			if ((b.charAt(i) <= 'Z') && (b.charAt(i) >= 'A'))
			{
				b = tangible.StringFunctions.changeCharacter(b, i, b.charAt(i) - 'A'+'a');
			}
		}

		for (i = 0;;)
		{
			if ((a.charAt(i) == b.charAt(i)) && (a.charAt(i) != '\0'))
			{
				i++;
			}
			else if ((a.charAt(i) == '\0') && (b.charAt(i) == '\0'))
			{
				break;
			}
			else
			{
				n = a.charAt(i) - b.charAt(i);
				break;
			}

		}
		if (n > 0)
		{
		System.out.print(">");
		}
		else if (n == 0)
		{
			System.out.print("=");
		}
		else
		{
			System.out.print("<");
		}
		return 0;
	}
}

