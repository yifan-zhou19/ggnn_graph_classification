package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[100]);
		for (int i = 0;i < 100;i++)
		{
				str = tangible.StringFunctions.changeCharacter(str, i, '\0');
		}
		cin.get(str,100); //????
		int i = 0;
		int k = 0;
		for (i = 0;i < 100;i++)
		{
			 if (str.charAt(i) == '\0')
			 {
				k = i;
			 break;
			 }
			 else if (str.charAt(i) != ' ')
			 {
				 continue;
			 }
			 else
			 {
					 for (int j = i;j < 100;j++)
					 {
						 if (str.charAt(i + 1) != ' ')
						 {
						 break;
						 }
				 else
				 {
							for (int j = i;j < 100;j++) //?????????????
							{
								str = tangible.StringFunctions.changeCharacter(str, j, str.charAt(j + 1));
							}
				 }
					 }
			 }
		}
		for (int i = 0;i < k;i++)
		{
				System.out.print(str.charAt(i));
		}

		return 0;
	}

}

