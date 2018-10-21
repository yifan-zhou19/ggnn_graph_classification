package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int l;
		int j;
		String a = new String(new char[256]);
		a = new Scanner(System.in).nextLine();
		l = a.length();
		for (j = 0;j < 100;j++)
		{
		for (i = 0;i < l;i++)
		{
			if (a.charAt(i) == ' ' && a.charAt(i + 1) == ' ')
			{
				while (i < l)
				{
					a = tangible.StringFunctions.changeCharacter(a, i + 1, a.charAt(i + 2));
					i++;
				}
			}
		}
		}
		System.out.printf("%s",a);
		return 0;
	}


}

