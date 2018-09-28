package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[100]);
		s = new Scanner(System.in).nextLine();
		int a;
		int i;
		int j;
		int b;
		b = a = s.length();
		for (i = 1;i < a;)
		{
			if (s.charAt(i) == ' ' && s.charAt(i - 1) == ' ')
			{
				for (j = i;j < b - 1;j++)
				{
					s = tangible.StringFunctions.changeCharacter(s, j, s.charAt(j + 1));
				}
				b--;
			}
			else
			{
				i++;
			}
		}
		s = tangible.StringFunctions.changeCharacter(s, b, '\0');
		System.out.println(s);
		return 0;
	}
}

