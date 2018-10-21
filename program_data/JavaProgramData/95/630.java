package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[80]);
		String b = new String(new char[80]);
		char t = 0;
		int len;
		int i;
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		len = a.length();
		if (b.length() <= len)
		{
			len = b.length();
		}
		for (i = 0;i < len;i++)
		{
			if (a.charAt(i) == b.charAt(i) || a.charAt(i) == b.charAt(i) - 'a'+'A' || a.charAt(i) == b.charAt(i) + 'a'-'A')
			{
				t++;
				continue;
			}
			if (a.charAt(i) <= 'z' && a.charAt(i) >= 'a' && b.charAt(i) <= 'z' && b.charAt(i) >= 'a')
			{
				if (a.charAt(i) > b.charAt(i))
				{
					System.out.print(">");
				}
				else
				{
					System.out.print("<");
				}
				break;
			}
			if (a.charAt(i) <= 'Z' && a.charAt(i) >= 'A' && b.charAt(i) <= 'Z' && b.charAt(i) >= 'A')
			{
				if (a.charAt(i) > b.charAt(i))
				{
					System.out.print(">");
				}
				else
				{
					System.out.print("<");
				}
				break;
			}
			if (a.charAt(i) <= 'Z' && a.charAt(i) >= 'A' && b.charAt(i) <= 'z' && b.charAt(i) >= 'a')
			{
				b = tangible.StringFunctions.changeCharacter(b, i, b.charAt(i) + 'A'-'a');
				if (a.charAt(i) > b.charAt(i))
				{
					System.out.print(">");
				}
				else
				{
					System.out.print("<");
				}
				break;
			}
			if (b.charAt(i) <= 'Z' && b.charAt(i) >= 'A' && a.charAt(i) <= 'z' && a.charAt(i) >= 'a')
			{
				b = tangible.StringFunctions.changeCharacter(b, i, b.charAt(i) - 'A'+'a');
				if (a.charAt(i) > b.charAt(i))
				{
					System.out.print(">");
				}
				else
				{
					System.out.print("<");
				}
				break;
			}
		}
		if (t == len && a.length() == b.length())
		{
			System.out.print("=");
		}
		if (t == len && a.length() < b.length())
		{
			System.out.print("<");
		}
		if (t == len && a.length() > b.length())
		{
			System.out.print(">");
		}
		return 0;
	}

}

