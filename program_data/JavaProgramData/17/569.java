package <missing>;

public class GlobalMembers
{
	/*
	 * kuohaopipei.cpp
	 * ??????
	 *  Created on: 2012-12-4
	 *      Author: ???
	 */
	public static int Main()
	{
		String str1 = new String(new char[101]); //????????
		String str2 = new String(new char[101]);
		int i; //figure??????????
		int figure = 0;
		int[] temp = new int[100];
		while ((str1 = ConsoleInput.readToWhiteSpace(true).charAt(0)).length() > 0)
		{ //?????????
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(str2, ' ', (Character.SIZE / Byte.SIZE)); //??????????
			for (i = 0; i < str1.length(); i++)
			{ //????????????????
				if (str1.charAt(i) == '(')
				{
					str2 = tangible.StringFunctions.changeCharacter(str2, i, '$'); //??????
					temp[figure++] = i; //??????
				}
				if (str1.charAt(i) == ')')
				{ //????????
					if (figure > 0)
					{ //???????????
						str2 = tangible.StringFunctions.changeCharacter(str2, temp[figure - 1], ' '); //?????????
						figure--; //????????????
					}
					else
					{
						str2 = tangible.StringFunctions.changeCharacter(str2, i, '?'); //?????????
					}
				}
			}
			for (i = 0; i < str1.length() - 1; i++) //???????
			{
				System.out.print(str1.charAt(i));
			}
			System.out.print(str1.charAt(str1.length() - 1));
			System.out.print("\n");
			for (i = 0; i < str1.length() - 1; i++) //??????????
			{
				System.out.print(str2.charAt(i));
			}
			System.out.print(str2.charAt(str1.length() - 1));
			System.out.print("\n");
			figure = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(str1, ' ', (Character.SIZE / Byte.SIZE)); //?????
		}
		return 0;
	}

}

