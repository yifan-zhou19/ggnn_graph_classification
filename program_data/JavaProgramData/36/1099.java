import java.util.*;

package <missing>;

public class GlobalMembers
{
	/*
	 * ??????.cpp
	 *
	 *  Created on: 2011-12-25
	 *      Author: Administrator
	 */


	public static int Main()
	{
		String str1 = new String(new char[10000]);
		String str2 = new String(new char[10000]);
		int[] flag = new int[10000];
		str1 = new Scanner(System.in).nextLine();
		int i;
		int j;
		for (i = 0;str1.charAt(i) != ' ';i++)
		{
			;
		}
		for (j = i + 1;str1.charAt(j) != '\0';j++)
		{
			str2 = tangible.StringFunctions.changeCharacter(str2, j - i - 1, str1.charAt(j));
		}
		int len1;
		int len2;
		len1 = i;
		len2 = j - i - 1;
		if (len1 != len2)
		{
			System.out.print("NO");
			System.out.print("\n");
		}
		else
		{
			for (i = 0;i < len1;i++)
			{
				for (j = 0;j < len1;j++)
				{
					if (str1.charAt(i) == str2.charAt(j) && flag[j] == 0)
					{
						flag[j] = 1;
						break;
					}
				}
				if (j == len1)
				{
					System.out.print("NO");
					System.out.print("\n");
					break;
				}
			}
			if (i == len1)
			{
				System.out.print("YES");
				System.out.print("\n");
			}
		}



		return 0;
	}

}

