import java.util.*;

package <missing>;

public class GlobalMembers
{
	/*
	 * 004.cpp
	 * name:?????
	 *  Created on: 2011-12-25
	 *      Author: 11029
	 */
	public static int Main()
	{
		String a = new String(new char[101]);
		String b = new String(new char[101]);
		int la;
		int lb;
		int i;
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		while (n-- != 0)
		{
			a = new Scanner(System.in).nextLine();
			b = new Scanner(System.in).nextLine();
			la = a.length();
			lb = b.length();
			for (i = lb - 1;i >= 0;i--)
			{
				a.charAt(i + la - lb) -= (b.charAt(i) - '0');
				if (a.charAt(i + la - lb) < '0')
				{
					a.charAt(i + la - lb) += 10;
					a.charAt(i + la - lb - 1)--;
				}
			}
			System.out.print(a);
			System.out.print("\n");
			System.in.read();
		}
	}

}

