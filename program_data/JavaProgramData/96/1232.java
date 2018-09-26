import java.util.*;

package <missing>;

public class GlobalMembers
{
	/*???????
	 * thirteen.cpp
	 *
	 *  Created on: 2013-12-23
	 *      Author: Administrator
	 */
	public static int Main()
	{
		String istr = new String(new char[101]);
		String istr1 = new String(new char[101]);
		int len = 0;
		int left = 0;
		int a = 0;
		int i = 0;
		int count = 0;
		while (istr = new Scanner(System.in).nextLine())
		{
			count = 0;
			len = istr.length();
			for (i = 0;i < len;i++)
			{
				a = left * 10 + istr.charAt(i) - '0';
				left = a % 13;
				istr1 = tangible.StringFunctions.changeCharacter(istr1, i, a / 13 + '0');
			}
			istr1 = tangible.StringFunctions.changeCharacter(istr1, i, '\0');
			for (i = 0;i < len;i++)
			{
				if (istr1.charAt(i) != '0' || count != 0)
				{
					System.out.print(istr1.charAt(i));
					count = 1;
				}
			}
			if (count == 0)
			{
				System.out.print("0");
			}
			System.out.print("\n");
			System.out.printf("%d", "\n");
			System.in.read();
		}
		return 0;
	}


}

