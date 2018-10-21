package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int b;
		int j;
		int l;
		String s = new String(new char[MAX + 1]);
		String a = new String(new char[MAX + 1]);
		s = new Scanner(System.in).nextLine();
		l = s.length();
		b = 0;
		for (i = 0;i <= l;i++)
		{
			if (s.charAt(i) != ' ')
			{
				a = tangible.StringFunctions.changeCharacter(a, b, s.charAt(i));
				b++;
			}
			else
			{
				a = tangible.StringFunctions.changeCharacter(a, b, s.charAt(i));
				b++;
				for (j = i;s.charAt(j) == ' ';j++)
				{
				}
				i = j - 1;
			}
		}
		System.out.println(a);
		return 0;
	}
}

