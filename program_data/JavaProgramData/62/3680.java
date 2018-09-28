package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[201]);
		String b = new String(new char[201]);
		int m;
		int n = 0;
		int len;
		a = new Scanner(System.in).nextLine();
		len = a.length();
		for (m = 0;m < len;m++)
		{
			if (a.charAt(m) == ' ' && a.charAt(m + 1) == ' ')
			{
			}
			else
			{
				b = tangible.StringFunctions.changeCharacter(b, n, a.charAt(m));
				n++;
			}
		}
		b = tangible.StringFunctions.changeCharacter(b, n, '\0');
		System.out.printf("%s", b);
		return 0;
	}


}

