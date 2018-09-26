import java.util.*;

package <missing>;

public class GlobalMembers
{
	/*
	 * assignment.cpp
	 *
	 *  Created on: 2010-11-23
	 *      Author: ??
	 *      ?????C????????
	 */


	public static int Main()
	{
		int n;
		int j = 1;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		char[][] a = new char[n + 1][100];
		for (int i = 0; i <= n; i++)
		{
			a[i] = new Scanner(System.in).nextLine();
		}
		for (int i = 1; i <= n; i++)
		{

			//???????????
			if ((a[i][0] >= 'A' && a[i][0] <= 'Z') || (a[i][0] >= 'a' && a[i][0] <= 'z') || a[i][0] == '_')
			{

				//???????????????????
				j = 1;
				while (a[i][j] != '\0')
				{
					if (!((a[i][j] >= 'A' && a[i][j] <= 'Z') || (a[i][j] >= 'a' && a[i][j] <= 'z') || a[i][j] == '_' || (a[i][j] >= '0' && a[i][j] <= '9')))
					{
						System.out.print("0");
						System.out.print("\n");
						break;
					}
					j++;
				}
				if (a[i][j] == '\0') //???????1
				{
				System.out.print("1");
				System.out.print("\n");
				}
			}
			else
			{ //?????????0
				System.out.print("0");
				System.out.print("\n");
			}
		}
		return 0;
	}

}

