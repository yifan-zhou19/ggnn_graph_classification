package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String l1 = new String(new char[80]);
		String l2 = new String(new char[80]);
		int i = 0;
		int a = 0;
		int b = 0;
		l1 = new Scanner(System.in).nextLine();
		l2 = new Scanner(System.in).nextLine();
		for (i = 0;i < 80;i++)
		{
			if (l1.charAt(i) >= 'A' && l1.charAt(i) <= 'Z')
			{
				l1 = tangible.StringFunctions.changeCharacter(l1, i, l1.charAt(i) + 32);
			}
			if (l2.charAt(i) >= 'A' && l2.charAt(i) <= 'Z')
			{
				l2 = tangible.StringFunctions.changeCharacter(l2, i, l2.charAt(i) + 32);
			}
		}
	if (strcmp(l1,l2) > 0)
	{
		System.out.print(">");
	}
		if (strcmp(l1,l2) < 0)
		{
			System.out.print("<");
		}
		if (strcmp(l1,l2) == 0)
		{
			System.out.print("=");
		}
	}
}

