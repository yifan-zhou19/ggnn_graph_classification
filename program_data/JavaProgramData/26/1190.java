package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int m;
		int j = 0;
		String a = new String(new char[101]);
		String b = new String(new char[101]);
		a = new Scanner(System.in).nextLine();
		n = a.length();
		for (i = 0;i < n;i++)
		{
			if (a.charAt(i) != ' ')
			{
				b = tangible.StringFunctions.changeCharacter(b, j, a.charAt(i));
				j = j + 1;
			}
			else
			{
				if (a.charAt(i) == ' ' && a.charAt(i + 1) != ' ')
				{
					b = tangible.StringFunctions.changeCharacter(b, j, a.charAt(i));
					j = j + 1;
				}
			}
		}
		for (i = 0;i < j;i++)
		{
			System.out.printf("%c",b.charAt(i));
		}
		return 0;

	}
}

