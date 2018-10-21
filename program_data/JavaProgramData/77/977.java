package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String ch = new String(new char[200]);
		String t = new String(new char[2]);
		int i;
		int j;
		int l;
		int g;
		int b;
		ch = new Scanner(System.in).nextLine();
		l = ch.length();
		t = tangible.StringFunctions.changeCharacter(t, 0, ch.charAt(0));
		t = tangible.StringFunctions.changeCharacter(t, 1, ch.charAt(l - 1));
		for (i = 1;i < l;i++)
		{
			g = 1;
			b = 0;
			if (ch.charAt(i) != 0)
			{
			if (ch.charAt(i) == t.charAt(1))
			{
				for (j = i - 1;j >= 0;j--)
				{
					if (ch.charAt(j) == t.charAt(1))
					{
						g++;
					}
					else if (ch.charAt(j) == t.charAt(0))
					{
						b++;
					}
					if (g == b)
					{
						ch = ch.substring(0, i);
						ch = ch.substring(0, j);
						System.out.printf("%d %d\n",j,i);
						break;
					}

				}
			}
			}
		}

		return 0;
	}

}

