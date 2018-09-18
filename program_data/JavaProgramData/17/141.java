package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[102]);
		String b = new String(new char[102]);
		int len;
		int i;
		int left;
		int[] leftNum = new int[102];
		while ((a = ConsoleInput.readToWhiteSpace(true).charAt(0)).length() > 0)
		{
			left = 0;
			len = a.length();
			for (i = 0; i < 102; i++)
			{
				b = tangible.StringFunctions.changeCharacter(b, i, ' ');
			}
			for (i = 0; i < len; i++)
			{
				if (a.charAt(i) == '(')
				{
					b = tangible.StringFunctions.changeCharacter(b, i, '$');
					left++;
					leftNum[left] = i;
				}
				if (a.charAt(i) == ')')
				{
					if (left > 0)
					{
						b = tangible.StringFunctions.changeCharacter(b, leftNum[left], ' ');
						left--;
					}
					else
					{
						b = tangible.StringFunctions.changeCharacter(b, i, '?');
					}
				}
			}
			b = tangible.StringFunctions.changeCharacter(b, len, '\0');
			System.out.print(a);
			System.out.print("\n");
			System.out.print(b);
			System.out.print("\n");
		}
		return 0;
	}
	// ????????????$????????????????????
}

