import java.util.*;

package <missing>;

public class GlobalMembers
{
	/*
	 * ?????C????????.cpp
	 *
	 *  Created on: 2010-11-24
	 *      Author: lenovo
	 */
	public static int Main()
	{
		int n;
		int i;
		int j;
		String a = new String(new char[100]);
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		for (i = 1;i <= n;i++)
		{
			int t = 0;
			a = new Scanner(System.in).nextLine();
			if (!((a.charAt(0) == '_') || (a.charAt(0) >= 'a' && a.charAt(0) <= 'z') || (a.charAt(0) >= 'A' && a.charAt(0) <= 'Z')))
			{
				System.out.print('0');
				System.out.print("\n");
			}
			else
			{
				for (j = 1;j < a.length();j++)
				{
					if (!((a.charAt(j) == '_') || (a.charAt(j) >= 'a' && a.charAt(j) <= 'z') || (a.charAt(j) >= 'A' && a.charAt(j) <= 'Z') || (a.charAt(j) >= '0' && a.charAt(j) <= '9')))
					{
						System.out.print('0');
						System.out.print("\n");
						t++;
						break;
					}
				}
				  if (t == 0)
				  {
					System.out.print('1');
					System.out.print("\n");
				  }
			}
		}
		return 0;
	}
}

