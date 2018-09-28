package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int l;
		int i;
		int j;
		int x = 0;
		String s = new String(new char[256]);
		String a = new String(new char[256]);
		String b = new String(new char[256]);
		String p = new String(new char[256]);
		s = new Scanner(System.in).nextLine();
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		k = (int)s.length();
		l = (int)a.length();
		for (i = 0;i < k - l + 1;i++)
		{
			for (j = 0;j < l;j++)
			{
				p = tangible.StringFunctions.changeCharacter(p, j, s.charAt(j + i));
			}
			p = tangible.StringFunctions.changeCharacter(p, j, '\0');
			if (strcmp(p,a) == 0)
			{
				x = i;
				break;
			}
		}
		if (x == 0)
		{
			System.out.printf("%s",s);
		}
		else
		{
			for (i = 0;i < x;i++)
			{
				System.out.printf("%c",s.charAt(i));
			}
			System.out.printf("%s",b);
			for (i = x + l;i < k;i++)
			{
				System.out.printf("%c",s.charAt(i));
			}
		}
		return 0;
	}
}

