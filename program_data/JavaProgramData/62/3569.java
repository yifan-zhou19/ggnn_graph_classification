package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[200]);
		int i;
		int j;
		int l;
		int s;
		s = -1;
		a = new Scanner(System.in).nextLine();
		l = a.length();
		for (j = 0;j < 100000;j++)
		{
		for (i = 0;i < l - 1;i++)
		{
			if (a.charAt(i) == ' ' && a.charAt(i + 1) == ' ')
			{
				s = s + 1;
				for (j = i;j < l - 1;j++)
				{
					a = tangible.StringFunctions.changeCharacter(a, j, a.charAt(j + 1));
					a = tangible.StringFunctions.changeCharacter(a, l - s, '\0');
				}
			}
		}
		}
		System.out.println(a);
		return 0;
	}

}

