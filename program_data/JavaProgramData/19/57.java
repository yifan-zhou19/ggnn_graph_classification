package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m;
		int n;
		int i;
		int j;
		int l;
		int sum = 0;
		int k = 0;
		String s = new String(new char[100]);
		String a = new String(new char[10]);
		String b = new String(new char[10]);
		String c = new String(new char[10]);
		s = new Scanner(System.in).nextLine();
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		n = s.length();
		m = a.length();
		l = b.length();
		for (i = 0;i <= n - 1;)
		{
			if ((s.charAt(i) == a.charAt(0) && i == 0) || (s.charAt(i) == a.charAt(0) && s.charAt(i - 1) == ' '))
			{
				j = 0;
				while ((s.charAt(i + j) != ' ') && ((i + j) != n))
				{
					c = tangible.StringFunctions.changeCharacter(c, j, s.charAt(i + j));
					j++;
				}
				c = tangible.StringFunctions.changeCharacter(c, j, '\0');
				if (strcmp(c,a) == 0)
				{
					System.out.printf("%s ",b);
					i = i + m + 1;
				}
				else
				{
					System.out.printf("%c",s.charAt(i));
					i++;
				}
			}
			else
			{
				System.out.printf("%c",s.charAt(i));
				i++;
			}

		}


	}
}

