package <missing>;

public class GlobalMembers
{
	//-----------------
	//  ??????
	//    Version 2.0
	//     ???
	//-----------------


	public static int Main()
	{
		int i = 0; //i,j??, blank?????????,words?????
		int j = 0;
		int blank = 0;
		int words = 0;
		int temp = 0;
		String str = new String(new char[101]);
		cin.get(str,101,'\n'); //????
		while (str.charAt(i) != '\0')
		{
			if (str.charAt(i) == ' ')
			{
				if (str.charAt(i - 1) != ' ')
				{
					words++;
				}
				 temp++;
				 str = tangible.StringFunctions.changeCharacter(str, i - blank + words - 1, str.charAt(i));
			}

			if (str.charAt(i) != ' ' && (blank != words))
			{
				blank = blank + temp;
				temp = 0;
				str = tangible.StringFunctions.changeCharacter(str, i - blank + words, str.charAt(i));
			}
			i++;
		}
		str = tangible.StringFunctions.changeCharacter(str, i - blank + words, '\0');
		System.out.print(str);
		return 0;
	}
}

