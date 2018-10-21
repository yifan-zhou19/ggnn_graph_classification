package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int c;
		int l;
		String a = new String(new char[201]);
		a = new Scanner(System.in).nextLine();
		l = a.length();
		for (i = 0;i < l;i++)
		{
			if (a.charAt(i) == ' ' && a.charAt(i + 1) == ' ')
			{
				for (j = i + 2;j < l;j++)
				{
					if (a.charAt(j) != ' ')
					{
						break;
					}
				}
				for (c = 0;c < l;c++)
				{
					a = tangible.StringFunctions.changeCharacter(a, i + 1 + c, a.charAt(j + c));
				}
			}
		}
		System.out.println(a);
		return 0;
	}

}

