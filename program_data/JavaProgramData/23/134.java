package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[500]);
		String b = new String(new char[500]);
		int i;
		int la;
		int k = 0;
		int j;
		a = new Scanner(System.in).nextLine();
		la = a.length();
		for (i = 0;i < la;i++)
		{
			if (a.charAt(i) != ' ')
			{
				k = k + 1;
			}
			else
			{
				for (j = i - k;j < i;j++)
				{
				   b = tangible.StringFunctions.changeCharacter(b, la + j + k - 2 * i, a.charAt(j));
				}
				b = tangible.StringFunctions.changeCharacter(b, la - i - 1, ' ');
				k = 0;
			}
		}
		for (j = i - k;j < i;j++)
		{
			b = tangible.StringFunctions.changeCharacter(b, la + j + k - 2 * i, a.charAt(j));
		}
		b = tangible.StringFunctions.changeCharacter(b, la, '\0');
		System.out.println(b);
	}
}

