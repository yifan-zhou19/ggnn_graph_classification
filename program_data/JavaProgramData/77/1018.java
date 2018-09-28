package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		int k;
		String s = new String(new char[102]);
		s = new Scanner(System.in).nextLine();
		for (i = 1;s.charAt(i) != '\0';i++)
		{
			if (s.charAt(i) != s.charAt(0))
			{
				for (j = i - 1;j >= 0;j--)
				{
					if (s.charAt(j) == s.charAt(0))
					{
						s = tangible.StringFunctions.changeCharacter(s, j, s.charAt(i));
						System.out.printf("%d %d\n",j,i);
						break;
					}
				}
			}

		}

		return 0;
	}


}

