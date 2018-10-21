package <missing>;

public class GlobalMembers
{
	/*
	 * ????.cpp
	 *
	 *  Created on: 2010-12-20
	 *      Author: ???
	 */
	public static int Main()
	{
		String a = new String(new char[501]); //a???????b??????c??????
		String b = new String(new char[501]);
		String c = new String(new char[501]);
		int i; //len???
		int len;
		int j;
		int k;
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		len = a.length();
		for (k = 2;k <= len;k++) //????k?????
		{
			for (i = 0;i < 501;i++) //???
			{
				b = tangible.StringFunctions.changeCharacter(b, i, c[i] = '\0');
			}
			for (i = 0;i < len;i++)
			{
				if (i + k <= len) //????????
				{
				   for (j = i;j < i + k;j++) //??k???????
				   {
					   b = tangible.StringFunctions.changeCharacter(b, j - i, a.charAt(j));
				   }
				   for (j = 0;j < k;j++) //??
				   {
						c = tangible.StringFunctions.changeCharacter(c, j, b.charAt(k - j - 1));
				   }
				   if (strcmp(b,c) == 0) //?????????
				   {
					   System.out.print(b);
					   System.out.print("\n");
				   }
				}
				else
				{
					break;
				}
			}
		}
		return 0;
	}
}

