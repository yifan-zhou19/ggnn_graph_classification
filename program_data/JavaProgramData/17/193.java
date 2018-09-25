package <missing>;

public class GlobalMembers
{
	//*****************************************
	//*   ??????                        *
	//*   ??????                        *
	//*   ?????2011?12?17?            *
	//*****************************************


	public static int Main()
	{
		int i;
		int j;
		int n;
		String a = new String(new char[200]);
		while (cin.get(a, 200)) //???????
		{
			n = a.length(); //????????
			for (i = 0; i < n; i++)
			{
				System.out.print(a.charAt(i));
			}
			System.out.print("\n");
			for (i = 0; i < n; i++)
			{
				if (a.charAt(i) == '(')
				{
					a = tangible.StringFunctions.changeCharacter(a, i, '$'); //?????????$
				}
				else if (a.charAt(i) == ')')
				{
					a = tangible.StringFunctions.changeCharacter(a, i, '?'); //??????????
					for (j = i - 1; j >= 0; j--) //???????????
					{
						if (a.charAt(j) == '$') //?????????
						{
							a = tangible.StringFunctions.changeCharacter(a, i, ' ');
							a = tangible.StringFunctions.changeCharacter(a, j, ' '); //?????????????
							break;
						}
					}
				}
				else
				{
					a = tangible.StringFunctions.changeCharacter(a, i, ' '); //??????????
				}
			}
			for (i = 0; i < n; i++)
			{
				System.out.print(a.charAt(i));
			}
			System.out.print("\n");
			System.in.read(); //????????????
		}
		return 0;
	}
}

