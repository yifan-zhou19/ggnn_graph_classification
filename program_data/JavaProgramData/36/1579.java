package <missing>;

public class GlobalMembers
{
	public static void bubble_sort(String s, int l)
	{
		int i;
		int j;
		char t;
		for (i = 0;i < l - 1;i++)
		{
			for (j = 0;j < l - 1 - i;j++)
			{
				if (s[j].compareTo(s[j + 1]) > 0)
				{
					t = s[j];
					s[j] = s[j + 1];
					s[j + 1] = t;
				}
			}
		}
	}
	public static int Main()
	{
		String s = new String(new char[502]);
		String a = new String(new char[502]);
		String b = new String(new char[502]);
		int l;
		int i;
		s = new Scanner(System.in).nextLine();
		l = s.length() / 2;
		for (i = 0;i < l;i++)
		{
			a = tangible.StringFunctions.changeCharacter(a, i, s.charAt(i));
			b = tangible.StringFunctions.changeCharacter(b, i, s.charAt(l + i + 1));
		}
		a = tangible.StringFunctions.changeCharacter(a, l, '\0');
		b = tangible.StringFunctions.changeCharacter(b, l, '\0');
		bubble_sort(a, l);
		bubble_sort(b, l);
		if (strcmp(a,b))
		{
			System.out.print("NO\n");
		}
			else
			{
				System.out.print("YES\n");
			}
	}

}

