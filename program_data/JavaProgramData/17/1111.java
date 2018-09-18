package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		final String a = "";
		final String b = "";
		int len; //??????????????????1??????0?????
		int i;
		int j;
		int[] judge = new int[100];
		while ((a = ConsoleInput.readToWhiteSpace(true).charAt(0)).length() > 0)
		{
			len = a.length();
			for (i = 0;i < len;i++) //???????
			{
				b = tangible.StringFunctions.changeCharacter(b, i, ' ');
			}
			for (i = 99;i >= len;i--)
			{
				b = tangible.StringFunctions.changeCharacter(b, i, '\0');
			}
			for (i = 0;i < len;i++)
			{
				if (a.charAt(i) == ')')
				{
					for (j = i;j >= 0;j--)
					{
					if (judge[j] == 0 && a.charAt(j) == '(')
					{
						judge[j] = 1;
						judge[i] = 1;
						break;
					} //???
					}
				if (judge[i] == 0)
				{
					b = tangible.StringFunctions.changeCharacter(b, i, '?'); //????????????????????
				}
				}
			}
			for (i = 0;i < len;i++)
			{
				if (judge[i] == 0 && a.charAt(i) == '(')
				{
					b = tangible.StringFunctions.changeCharacter(b, i, '$'); //?????????????????$
				}

			}
				for (i = 0;i < len;i++)
				{
					System.out.print(a.charAt(i));
				}
				System.out.print('\n');
		for (i = 0;i < len;i++)
		{
			System.out.print(b.charAt(i));
		}
		System.out.print('\n');
			for (i = 0;i < 100;i++)
			{
				judge[i] = 0;
			}
		}
		return 0;
	}

}

