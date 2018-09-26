import java.util.*;

package <missing>;

public class GlobalMembers
{
	/*
	 * 1.cpp
	 *?????C????????
	 *  Created on: 2011-12-3
	 *      Author: ??
	 */
	public static int Main()
	{ //???
		int n; //n????? i???????
		int i;
		int j; //j???????
		char k; //k?????????????l????????????
		char l;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		char[][] a = new char[n][81]; //????
		a[0] = new Scanner(System.in).nextLine();
		for (i = 0;i < n;i++) //??
		{
			a[i] = new Scanner(System.in).nextLine();
		}
		for (i = 0;i < n;i++)
		{
			k = a[i][0];
			if (!(k == '_' || (k >= 'A' && k <= 'Z') || (k >= 'a' && k <= 'z'))) //??????
			{
				System.out.print(0);
				System.out.print("\n");
				continue;
			} //??????????0
			else //??
			{
				for (j = 0;j < String.valueOf(a[i]).length();j++)
				{
					l = a[i][j];
					if (!(l == '_' || (l >= 'A' && l <= 'Z') || (l >= 'a' && l <= 'z') || (l >= '0' && l <= '9'))) //??????????
					{
						System.out.print(0);
						System.out.print("\n");
						break; //???????0
					}
				}
				if (j == String.valueOf(a[i]).length())
				{
					System.out.print(1);
					System.out.print("\n");
				}
			}
		}
		return 0; //????
	}
}

