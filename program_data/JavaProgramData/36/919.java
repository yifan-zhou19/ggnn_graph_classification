package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		String s1 = new String(new char[100]);
		String s2 = new String(new char[100]);
		s1 = ConsoleInput.readToWhiteSpace(true).charAt(0);
		s2 = ConsoleInput.readToWhiteSpace(true).charAt(0);
		for (i = 0;s1.charAt(i) != 0;i++)
		{
			for (j = 0;s2.charAt(j) != 0;j++)
			{
				if (s1.charAt(i) == s2.charAt(j))
				{
					s2 = tangible.StringFunctions.changeCharacter(s2, j, ' ');
					break;
				}
			}
			if (s2.charAt(j) == 0)
			{
				break;
			}
		}
		if (s1.charAt(i) != 0)
		{
			System.out.print("NO");
			System.out.print("\n");
		}
		else
		{
			for (i = 0;s2.charAt(i) != 0;i++)
			{
				if (s2.charAt(i) != ' ')
				{
					break;
				}
			}
			if (s2.charAt(i) != 0)
			{
				System.out.print("NO");
				System.out.print("\n");
			}
			else
			{
				System.out.print("YES");
				System.out.print("\n");
			}
		}
		return 0;
	}
}

