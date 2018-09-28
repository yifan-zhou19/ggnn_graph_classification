package <missing>;

public class GlobalMembers
{
	//-----------------
	//  ??????
	//    ????
	//     ???
	//-----------------


	public static int Main()
	{
		int i = 0; //i,j??, blank?????
		int j = 0;
		int blank = 0;
		String str = new String(new char[101]);
		cin.get(str,101,'\n'); //????
		while (str.charAt(i) != '\0')
		{
			if (str.charAt(i) == ' ')
			{
				blank++;
				if (str.charAt(i + 1) != ' ')
				{
				   if (blank > 1)
				   {
					   j = i + 1;
					   while (str.charAt(j) != '\0')
					   {
						   str = tangible.StringFunctions.changeCharacter(str, j - blank + 1, str.charAt(j));
						   j++;
					   }
					   str = tangible.StringFunctions.changeCharacter(str, j - blank + 1, '\0');
					   i = i - blank + 1;
					   blank = 0;
				   }
				   if (blank == 1)
				   {
					   blank = 0;
				   }
				}
			}
			i++;
		}
		for (j = 0;j < i;j++)
		{
			System.out.print(str.charAt(j));
		}
		return 0;

	}

}

