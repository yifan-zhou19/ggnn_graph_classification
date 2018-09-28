package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[10000]);
		String b = new String(new char[10000]);
		int l;
		int i = 0;
		int j = 0;
		a = new Scanner(System.in).nextLine();
		l = a.length();
		while (i < l)
		{
			if (a.charAt(i) != ' ')
			{
				b = tangible.StringFunctions.changeCharacter(b, j, a.charAt(i));
				i++;
				j++;
			}
			else if (a.charAt(i - 1) != ' ')
			{
				b = tangible.StringFunctions.changeCharacter(b, j, a.charAt(i));
				j++;
				i++;
			}
			else
			{
				i++;
			}
		}
		System.out.println(b);
		return 0;
	}
}

