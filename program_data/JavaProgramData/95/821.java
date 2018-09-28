package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[80]);
		String b = new String(new char[80]);
		char i;
		char j;
		char k;
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		j = a.length();
		k = b.length();
		for (i = 0;i < j;i++)
		{
			if (Character.isUpperCase(a.charAt(i)))
			{
			a = tangible.StringFunctions.changeCharacter(a, i, Character.toLowerCase(a.charAt(i)));
			}
		}
		for (i = 0;i < k;i++)
		{
			if (Character.isUpperCase(b.charAt(i)))
			{
			b = tangible.StringFunctions.changeCharacter(b, i, Character.toLowerCase(b.charAt(i)));
			}
		}
		if (strcmp(a,b) > 0)
		{
		System.out.print(">");
		}
		if (strcmp(a,b) < 0)
		{
		System.out.print("<");
		}
		if (strcmp(a,b) == 0)
		{
		System.out.print("=");
		}
		return 0;
	}

}

