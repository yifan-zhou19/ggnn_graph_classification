package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[101]);
		String a = new String(new char[101]);
		String b = new String(new char[101]);
		String t = new String(new char[101]);
		String w = new String(new char[101]);
		s = new Scanner(System.in).nextLine();
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		int i;
		int j;
		int r;
		int k;
		int n;
		for (n = 1;n < 5;n++)
		{
			r = 0;
			for (i = 0;i < 101;i++)
			{
				if (s.charAt(i) != 0)
				{
					if (s.charAt(i) != ' ')
					{
						t = tangible.StringFunctions.changeCharacter(t, i - r, s.charAt(i));
					}
					else
					{
						t = t.substring(0, i - r);
						r = r + t.length() + 1;
						if (strcmp(t,a) == 0)
						{
							k = t.length();
							for (j = i;j < 101;j++)
							{
								w = tangible.StringFunctions.changeCharacter(w, j - i, s.charAt(j));
							}
							s = s.substring(0, i - k);
							s += b;
							s += w;
						}
					}
				}
				else
				{
					t = t.substring(0, i - r);
					if (strcmp(t,a) == 0)
					{
						k = t.length();
						s = s.substring(0, i - k);
							 s += b;
											 break;
					}
				}
			}
		}
		System.out.printf("%s\n",s);
		return 0;
	}
}

