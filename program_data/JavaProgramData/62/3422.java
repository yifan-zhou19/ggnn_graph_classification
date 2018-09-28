import java.util.*;

package <missing>;

public class GlobalMembers
{
	/*
	 * ???????????.cpp
	 * ??????
	 * ?????2012.11.10
	 * ??????????
	 */
	public static int Main()
	{
		String str = new String(new char[10000]);
		str = new Scanner(System.in).nextLine();
		int i;
		int j;
		for (i = 0; i < str.length(); i++)
		{
			if (str.charAt(i) != ' ')
			{
				System.out.print(str.charAt(i));
				continue;
			}
			else
			{
				for (j = i + 1; j < str.length(); j++)
				{
					if (str.charAt(j) != ' ')
					{
						break;
					}
				}
				System.out.print(" ");
				i = j - 1;
			}
		}
		return 0;
	}

}
