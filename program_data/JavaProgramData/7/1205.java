import java.util.*;

package <missing>;

public class GlobalMembers
{
	//********************************
	//*???????               **
	//*??????                 **
	//*???2012.12.26             **
	//*******************************/


	public static int Main()
	{
		String str = new String(new char[256]);
		String subStr = new String(new char[256]);
		String repStr = new String(new char[256]);
		int strLen;
		int subStrLen;
		int repStrLen;
		int i;
		int j;
		int k;
		int flag2 = 0;
		str = new Scanner(System.in).nextLine();
		subStr = new Scanner(System.in).nextLine();
		repStr = new Scanner(System.in).nextLine();
		subStrLen = subStr.length();
		repStrLen = repStr.length();
		strLen = str.length();
		for (i = 0; i < strLen && flag2 == 0; i++)
		{
			if (str.charAt(i) == subStr.charAt(0))
			{
				int flag1 = 0;
				for (j = 1; j < subStrLen; j++)
				{
					if (str.charAt(i + j) != subStr.charAt(j))
					{
						flag1 = 1;
					}
				}
				if (flag1 == 0)
				{
					if (subStrLen > repStrLen)
					{
						for (j = 0; j < repStrLen; j++)
						{
							str = tangible.StringFunctions.changeCharacter(str, i + j, repStr.charAt(j));
						}
						for (j = i + subStrLen; j < strLen; j++)
						{
							str = tangible.StringFunctions.changeCharacter(str, j - (subStrLen - repStrLen), str.charAt(j));
						}
					}
					else if (subStrLen == repStrLen)
					{
						for (j = 0; j < repStrLen; j++)
						{
							str = tangible.StringFunctions.changeCharacter(str, i + j, repStr.charAt(j));
						}
					}
					else
					{
						for (j = strLen - 1; j >= i + subStrLen; j--)
						{
							str = tangible.StringFunctions.changeCharacter(str, j - (subStrLen - repStrLen), str.charAt(j));
						}
						for (j = 0; j < repStrLen; j++)
						{
							str = tangible.StringFunctions.changeCharacter(str, i + j, repStr.charAt(j));
						}
					}
					flag2 = 1;
				}
			}
		}
		if (flag2 == 1)
		{
			for (i = 0; i < strLen - subStrLen + repStrLen; i++)
			{
				System.out.print(str.charAt(i));
			}
		}
		else
		{
			for (i = 0; i < strLen; i++)
			{
				System.out.print(str.charAt(i));
			}
		}
		return 0;
	}

}

