package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int k = 0;
		String a = new String(new char[80]);
		String b = new String(new char[80]);
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		for (i = 0;a.charAt(i) != '\0' && b.charAt(i) != '\0' && k == 0;i++)
		{
			if (a.charAt(i) > b.charAt(i))
			{
				k = 1;
				if ((a.charAt(i) >= 'a' && a.charAt(i) <= 'z'))
				{
					a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) - 'a'+'A');
				}
				if (a.charAt(i) == b.charAt(i))
				{
					k = 0;
				}
				if (a.charAt(i) < b.charAt(i))
				{
					k = -1;
				}
			}
				if (a.charAt(i) < b.charAt(i))
				{
				k = -1;
				if ((a.charAt(i) >= 'A' && a.charAt(i) <= 'Z'))
				{
					a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) - 'A'+'a');
				}
				if (a.charAt(i) == b.charAt(i))
				{
					k = 0;
				}
				if (a.charAt(i) > b.charAt(i))
				{
					k = 1;
				}
				}
		}
		if (k == 1)
		{
			System.out.print(">");
		}
		if (k == 0)
		{
			System.out.print("=");
		}
		if (k == -1)
		{
			System.out.print("<");
		}
		return 0;
	}


}

