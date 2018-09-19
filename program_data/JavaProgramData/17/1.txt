package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String sen = new String(new char[101]);
		String rsen = new String(new char[101]);
		while ((sen = ConsoleInput.readToWhiteSpace(true).charAt(0)).length() > 0)
		{
			int[] pos = new int[101];
			int num = 0;
			int i;
			int t = 0;
		System.out.print(sen);
		System.out.print("\n");
		for (i = 0; i <= sen.length() - 1; i++)
		{
			if (sen.charAt(i) == '(')
			{
				num++;
				pos[num] = i;
				rsen = tangible.StringFunctions.changeCharacter(rsen, i, '$');
			}
			else if (sen.charAt(i) == ')')
			{
				if (num > 0)
				{
					rsen = tangible.StringFunctions.changeCharacter(rsen, pos[num], ' ');
					rsen = tangible.StringFunctions.changeCharacter(rsen, i, ' ');
					num--;
				}
				else
				{
					rsen = tangible.StringFunctions.changeCharacter(rsen, i, '?');
				}
			}
			else
			{
				rsen = tangible.StringFunctions.changeCharacter(rsen, i, ' ');
			}
		}
		if (num != 0)
		{
			for (i = 1; i <= num; i++)
			{
				rsen = tangible.StringFunctions.changeCharacter(rsen, pos[num], '$');
			}
		}
		for (i = 0; i <= sen.length() - 2; i++)
		{
			System.out.print(rsen.charAt(i));
		}
		System.out.print(rsen.charAt(sen.length() - 1));
		System.out.print("\n");
		};
		return 0;
	}
}

