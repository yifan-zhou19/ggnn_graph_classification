import java.util.*;

package <missing>;

public class GlobalMembers
{
	/*
	 * 1.cpp
	 *
	 *  Created on: 2011-1-8
	 *      Author: Administrator
	 */
	public static int Main()
	{
		String string = new String(new char[101]);
		String = new Scanner(System.in).nextLine();
		int i;
		int j;
		int lenth = String.length();
		for (i = 0;i < lenth;i++)
		{
			if (String[i] == '\0')
			{
				break;
			}
			if (String[i] == ' ')
			{
				j = i;
				while (true)
				{
					if (String[j + 1] != ' ')
					{
						break;
					}
					j++;
				}
				int l = j - i;
				for (j = i + 1;j < lenth - l;j++)
				{
					String[j] = string.charAt(j + l);
				}
				String[j] = '\0';
			}
		}
		System.out.print(String);
		System.out.print("\n");
		return 0;
	}


}
