import java.util.*;

package <missing>;

public class GlobalMembers
{
	/*
	 * kaoshi____1225.cpp
	 *???????
	 *  Created on: 2011-12-25
	 *      Author: ???
	 */
	public static int Main()
	{
		String a = new String(new char[50]);
		a = new Scanner(System.in).nextLine();
		int i = 0;
		int j;
		while (i < a.length())
		{
			while (a.charAt(i) < '0' || a.charAt(i)>'9')
			{
				i++;
				if ((a.charAt(i) >= '0' && a.charAt(i) <= '9') || i == a.length() - 1)
				{
					System.out.print("\n");
					break;
				}

			}
			if (i == a.length() - 1 && (a.charAt(i) < '0' || a.charAt(i)>'9'))
			{
							break;
			}

			System.out.print(a.charAt(i));
			i++;
		}
		return 0;

	}


}
