import java.util.*;

package <missing>;

public class GlobalMembers
{
	/*
	 * biaozhun.cpp
	 *
	 *  Created on: 2010-11-24
	 *      Author: lz
	 */

	public static int Main()
	{
		int n;
		int i;
		char[][] c = new char[105][85];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i <= n;i++)
		{
			c[i] = new Scanner(System.in).nextLine(); //?????????
		}
		for (i = 1;i <= n;i++)
		{
			int j = 0;
			if (c[i][j] != '_' && (c[i][j] < 'A' || c[i][j]>'z' || (c[i][j] > 'Z' && c[i][j] < 'a'))) //??????
			{
				System.out.print("0");
				System.out.print("\n");
			}
			else
			{
				j++;
				while (c[i][j] != '\0')
				{
					if (c[i][j] != '_' && (c[i][j] < '0' || c[i][j]>'9' && c[i][j] < 'A' || c[i][j]>'Z' && c[i][j] < 'a' || c[i][j]>'z'))
					{
						//????
						System.out.print("0");
						System.out.print("\n");
						break;
					}
					else
					{
						j++;
					}
				}
				if (c[i][j] == '\0') //??????
				{
					System.out.print("1");
					System.out.print("\n");
				}
			}
		}
		return 0;
	}

}

