package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[40]);
		String b = new String(new char[40]);
		int length;
		int i;
		int j;
		int x;
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b = ConsoleInput.readToWhiteSpace(true).charAt(0);
		if (a.length() != b.length())
		{
			System.out.print("NO");
			System.out.print("\n");
		}
		else
		{
			length = a.length();
			x = length;
			for (i = 0;i < length;i++)
			{
				for (j = 0;j < length;j++)
				{
					if (a.charAt(i) == b.charAt(j))
					{
						b = tangible.StringFunctions.changeCharacter(b, j, '\0');
						x--;
						break;
					}
				}
			}
			if (x == 0)
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

