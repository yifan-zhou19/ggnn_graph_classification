package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String x = new String(new char[101]);
		int i;
		int l;
		int t;
		int j;
		int L;
		x = new Scanner(System.in).nextLine();
		l = x.length();
		t = 0;
		L = l;
		for (i = 0;i < l;i++)
		{
			if (x.charAt(i) == ' ')
			{
				if (t == 1)
				{
					for (j = i;j < l - 1;j++)
					{
						x = tangible.StringFunctions.changeCharacter(x, j, x.charAt(j + 1));
					}
					L--;
					i--;
				}
				else
				{
					t = 1;
				}
			}
			else
			{
				t = 0;
			}
		}
		x = tangible.StringFunctions.changeCharacter(x, L, '\0');
		System.out.println(x);
		return 0;
	}
}

