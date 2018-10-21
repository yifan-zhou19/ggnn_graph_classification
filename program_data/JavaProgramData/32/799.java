import java.util.*;

package <missing>;

public class GlobalMembers
{
	/********************************
	 *?????						*
	 *								*
	 *  Created on: 2010-12-24		*
	 *      Author: ??				*
	 ********************************/
	public static int Main()
	{
		String a = new String(new char[101]); //????????????????
		String b = new String(new char[101]);
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (n > 0)
		{
			a = new Scanner(System.in).nextLine();
			a = new Scanner(System.in).nextLine(); //???????
			b = new Scanner(System.in).nextLine();
			int k = a.length() - 1;
			for (int i = b.length() - 1;i >= 0;i--) //????????????
			{

				if (a.charAt(k) >= b.charAt(i))
				{
					a = tangible.StringFunctions.changeCharacter(a, k, a.charAt(k) - b.charAt(i) + 48); //?????????????????
				}
				else
				{
					a = tangible.StringFunctions.changeCharacter(a, k, a.charAt(k) + 10 - b.charAt(i) + 48); //?????????
					int j = 1;
					while (true)
					{
						if (a.charAt(k - j) != '0')
						{
							a = tangible.StringFunctions.changeCharacter(a, k - j, a.charAt(k - j) - 1);
							break;
						}
						else
						{
							a = tangible.StringFunctions.changeCharacter(a, k - j, '9');
							j++;
						}
					}
				}
				k--;
			}
			System.out.print(a);
			System.out.print("\n");
			n--;
		}
		return 0;
	}

}

