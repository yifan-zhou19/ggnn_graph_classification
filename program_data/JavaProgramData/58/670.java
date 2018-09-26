import java.util.*;

package <missing>;

public class GlobalMembers
{
	/*
	 * 1000062703_30.cpp
	 *
	 *  Created on: 2010-9-26
	 *      Author: ??
	 */
	public static int Main()
	{
		int n;
		int i;
		int flag;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		while (n > 0)
		{
			String z = new String(new char[81]);
			z = new Scanner(System.in).nextLine();
			flag = 1;
				if (z.charAt(0) == '_' || (z.charAt(0) >= 'a' && z.charAt(0) <= 'z') || (z.charAt(0) >= 'A' && z.charAt(0) <= 'Z'))
				{
					for (i = 1;i < z.length();i++)
					{
						if ((z.charAt(i) != ' ') && !(z.charAt(i) >= '!' && z.charAt(i) < '0') && (z[i] = '_' || (z.charAt(i) >= 'a' && z.charAt(i) <= 'z') || (z.charAt(i) >= 'A' && z.charAt(i) <= 'Z') || (z.charAt(i) >= '0' && z.charAt(i) <= '9')))
						{
							continue;
						}
						flag = 0;
					}
					if (flag != 0)
					{
						System.out.print(1);
						System.out.print("\n");
					}
					else
					{
						System.out.print(0);
						System.out.print("\n");
					}
				}
				else
				{
					System.out.print(0);
					System.out.print("\n");
				}
				n--;
		}
		return 0;
	}



}

