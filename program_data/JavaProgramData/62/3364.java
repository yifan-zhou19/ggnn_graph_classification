package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int n;
		int t = 0;
		String s = new String(new char[100]);
		s = new Scanner(System.in).nextLine();
		k = s.length();
		for (i = 0;i < k;i++)
		{
			if (s.charAt(i) == ' ')
			{
				if (s.charAt(i + 1) == ' ')
				{
					t = t + 1;
					for (n = i;n >= t - 1;n--)
					{
						s = tangible.StringFunctions.changeCharacter(s, n + 1, s.charAt(n));
					}

				}
			}

		}
			for (j = t;j < k;j++)
			{
				System.out.printf("%c",s.charAt(j));
			}
			return 0;
	}



}

