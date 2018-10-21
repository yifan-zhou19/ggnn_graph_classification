package <missing>;

public class GlobalMembers
{
	/*
	 * 8.cpp
	 *
	 *  Created on: 2013-12-5
	 *      Author: Administrator
	 */
	public static int Main()
	{
		String a = new String(new char[100]);
		int i;
		int k;
		int s;
		for (;scanf("%s",a) != EOF;)
		{
			s = 0;
			s = a.length();
			for (i = 0;i < s;i++)
			{
				System.out.print(a.charAt(i));
			}
			System.out.print("\n");
			for (i = 0;i < s;i++)
			{
				if (a.charAt(i) == '(')
				{
					a = tangible.StringFunctions.changeCharacter(a, i, '$'); //??????????�$"
				}
				else
				{
					if (a.charAt(i) == ')')
					{
						a = tangible.StringFunctions.changeCharacter(a, i, '?'); //?????????�?�
					}
					else
					{
						a = tangible.StringFunctions.changeCharacter(a, i, ' '); //???????????
					}
				}
			}
			for (i = s - 1;i >= 0;i--) //???????????
			{
				if (a.charAt(i) == '$')
				{
					for (k = i;k < s;k++) //???????????
					{
						if (a.charAt(k) == '?')
						{
							a = tangible.StringFunctions.changeCharacter(a, i, ' ');
							a = tangible.StringFunctions.changeCharacter(a, k, ' ');
							break; //?????????� �????????
						}
					}
				}
			}
			for (i = 0;i < s;i++)
			{
				System.out.print(a.charAt(i));
			}
			System.out.print("\n");
		}
	return 0;
	}

}

