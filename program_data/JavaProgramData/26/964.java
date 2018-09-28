package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		a = new Scanner(System.in).nextLine();
		int c = a.length();
		int d = 0;
		int i;
		for (i = 0;i < c;i++)
		{
			if (a.charAt(i) == ' ' && a.charAt(i + 1) == ' ')
			{
				d++;
				continue;
			}
			else
			{
				b = tangible.StringFunctions.changeCharacter(b, i - d, a.charAt(i));
			}
		}
		b = tangible.StringFunctions.changeCharacter(b, i - d, '\0');
		System.out.println(b);
		return 0;
	}
}

