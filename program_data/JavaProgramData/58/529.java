import java.util.*;

package <missing>;

public class GlobalMembers
{
	/*
	 * 1.cpp
	 *
	 *  Created on: 2010-11-28
	 *      Author: Administrator
	 */

	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		String a = new String(new char[100]);
		a = new Scanner(System.in).nextLine();
		for (int i = 0;i < n;i++)
		{
			String b = new String(new char[100]); //?????
			b = new Scanner(System.in).nextLine();
			int t = 1;
			if (!(b.charAt(0) == '_' || (b.charAt(0) >= 'a' && b.charAt(0) <= 'z') || (b.charAt(0) >= 'A' && b.charAt(0) <= 'Z')))
			{
				t = 0; //?????
			}
			for (int j = 0;j < b.length();j++)
			{
				if (!(b.charAt(j) == '_' || (b.charAt(j) >= 'a' && b.charAt(j) <= 'z') || (b.charAt(j) >= 'A' && b.charAt(j) <= 'Z') || (b.charAt(j) >= '0' && b.charAt(j) <= '9')))
				{
					t = 0; //???????
				}
			}
			System.out.print(t);
			System.out.print("\n");
		}
		return 0;
	}

}

