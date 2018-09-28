package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s1 = new String(new char[100]);
		String s2 = new String(new char[100]);
		s1 = ConsoleInput.readToWhiteSpace(true).charAt(0);
		s2 = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int l1 = s1.length();
		int l2 = s2.length();
		int t = 0;
		if (l1 != l2)
		{
			System.out.print("NO");
			System.out.print("\n");
		}
		else
		{
			for (int i = 0; i < l1; i++)
			{
				for (int j = 0; j < l2; j++)
				{
					if (s1.charAt(i) == s2.charAt(j))
					{
						s2 = tangible.StringFunctions.changeCharacter(s2, j, ' ');
						t++;
						break;
					}
				}
			}
			if (t == l1)
			{
				System.out.print("YES");
				System.out.print("\n");
			}
			else
			{
				System.out.print("NO");
				System.out.print("\n");
			}
		}
		return 0;
	}
}

