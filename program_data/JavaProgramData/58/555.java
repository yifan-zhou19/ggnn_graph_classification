import java.util.*;

package <missing>;

public class GlobalMembers
{
	/*
	 * qimofuxi_11.cpp
	 * ????????C????????
	 *  Created on: 2010-12-18
	 *      Author: william
	 */
	public static int Main()
	{
		int n;
		int m;
		int[] b = new int[1000];
		char[][] a = new char[1000][100];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		cin.ignore();
		for (int i = 0; i < n; i++)
		{
			   a[i] = new Scanner(System.in).nextLine();
			b[i] = String.valueOf(a[i]).length();
		}
		for (int j = 0; j < n; j++)
		{
			if (!(a[j][0] == '_' || (a[j][0] >= 'A' && a[j][0] <= 'Z') || (a[j][0] >= 'a' && a[j][0] <= 'z')))
			{
				System.out.print(0);
				System.out.print("\n");
			}
			else
			{
				m = 1;
				for (m = 1; m < b[j]; m++)
				{
					if (!(a[j][m] == '_' || (a[j][m] >= 'A' && a[j][m] <= 'Z') || (a[j][m] >= 'a' && a[j][m] <= 'z') || (a[j][m] >= '0' && a[j][m] <= '9')))
					{
						System.out.print(0);
						System.out.print("\n");
						break;
					}
				}
				if (m == b[j])
				{
					System.out.print(1);
					System.out.print("\n");
				}
			}
		}
		return 0;
	}
}

