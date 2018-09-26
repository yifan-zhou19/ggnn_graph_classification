import java.util.*;

package <missing>;

public class GlobalMembers
{
	/*
	 * qipengyuanshui.cpp
	 *?????
	 *  Created on: 2012-12-12
	 *      Author: ???
	 */
	public static int Main()
	{
		String str1 = new String(new char[105]); //??????????
		String str2 = new String(new char[105]);
		int i;
		int j = 0;
		int k;
		int len;
		str1 = new Scanner(System.in).nextLine(); //????????????
		len = str1.length();
		for (i = 0;i < len - 1;i++)
		{
			str2 = tangible.StringFunctions.changeCharacter(str2, j, str1.charAt(i) + str1.charAt(i + 1)); //?????????len-1?
			j++;
		}
		str2 = tangible.StringFunctions.changeCharacter(str2, j, str1.charAt(len - 1) + str1.charAt(0)); //?????
		for (k = 0;k < len;k++)
		{
			System.out.print(str2.charAt(k));
		}
		return 0;
	}
}

