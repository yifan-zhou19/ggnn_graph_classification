package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100000]);
		a = new Scanner(System.in).nextLine();
		int i;
		int l;
		l = a.length();
		for (i = l - 1;i > 0;i--)
		{
			if (a.charAt(i) == ' ' && a.charAt(i - 1) == ' ')
			{
				a = tangible.StringFunctions.changeCharacter(a, i - 1, a.charAt(i));
			}
		}
		System.out.printf("%s",a);
		return 0;
	}

}

