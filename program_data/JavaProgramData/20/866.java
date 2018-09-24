package <missing>;

public class GlobalMembers
{
	//********************************************************
	//*??????????.cpp                              *
	//*??????                                          *
	//*?????2010?12?18?                              *
	//********************************************************
	public static int Main()
	{
		final String substr = ""; //?????
		final String str = "";
		final String out = ""; //?????
		int length = 0;
		int i = 0;
		int j = 0;
		char temp = '\0';
		int num = 0;
		while ((str = ConsoleInput.readToWhiteSpace(true).charAt(0)).length() > 0 && (substr = ConsoleInput.readToWhiteSpace(true).charAt(0)).length() > 0) //??????
		{
			length = str.length(); //???????
			for (i = 0;i < length;i++) //?????????
			{
				if (str.charAt(i) > temp)
				{
					temp = str.charAt(i);
					num = i;
				}
			}
			for (i = 0;i <= num;i++) //????????????????
			{
				out = tangible.StringFunctions.changeCharacter(out, i, str.charAt(i));
			}
			out += substr; //????????????
			for (i = num + 4, j = num + 1;i < (length + 3) && j < length;i++, j++) //?????
			{
				out = tangible.StringFunctions.changeCharacter(out, i, str.charAt(j));
			}
			num = 0; //??????
			temp = '\0';
			System.out.print(out);
			System.out.print("\n");
			for (i = 0;i < 13;i++) //??????????
			{
				out = tangible.StringFunctions.changeCharacter(out, i, '\0');
			}
		}

		return 0;
	}
}

