import java.util.*;

package <missing>;

public class GlobalMembers
{
	/**********************************************************************************
	 * 04.cpp																		  *
	 *																				  *
	 *  Created on: 2010-11-20														  *
	 *      Author: jsgl															  *
	 **********************************************************************************/
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		final int m = n + 1;
		char[][] a = new char[m][81]; //?????????
		int i;
		int j;
		for (i = 0;i < m;i++)
		{
			a[i] = new Scanner(System.in).nextLine(); //??????
		}
		for (i = 1;i <= n;i++)
		{
			if ((a[i][0] < 65) || (a[i][0]>90 && a[i][0] < 95) || (a[i][0] == 96) || (a[i][0]>122))
			{
				System.out.print("0");
				System.out.print("\n");
				continue;
			}
			for (j = 1;j <= String.valueOf(a[i]).length();j++)
			{
				if (a[i][j] == '\0')
				{
					break;
				}
				if ((a[i][j] >= 48 && a[i][j] <= 57) || (a[i][j] >= 65 && a[i][j] <= 90) || (a[i][j] == 95) || (a[i][j] >= 97 && a[i][j] <= 122))
				{
					continue;
				}
				else
				{
					System.out.print("0");
					System.out.print("\n");
					break;
				}
			}
			if (j == String.valueOf(a[i]).length())
			{
				System.out.print("1");
				System.out.print("\n");
				continue;
			}
		}
		return 0;
	}



}

