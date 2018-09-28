package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[MAX]);
		String b = new String(new char[MAX]);
		int i;
		int len;
		int j;
		a = new Scanner(System.in).nextLine();
		len = a.length();
		for (i = 0,j = 0;i < len;i++)
		{
			if (a.charAt(i) == '\0')
			{
				break;
			}
			if (a.charAt(i) == ' ' && a.charAt(i + 1) == ' ')
			{
				continue;
			}
			b = tangible.StringFunctions.changeCharacter(b, j, a.charAt(i));
			j++;
		}
		b = tangible.StringFunctions.changeCharacter(b, j, '\0');
		System.out.println(b);
		return 0;
	}
}

