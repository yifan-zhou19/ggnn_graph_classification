import java.util.*;

package <missing>;

public class GlobalMembers
{
	/*
	 * 88.cpp
	 *
	 *  Created on: 2011-12-25
	 *      Author: 1
	 */

	public static int Main()
	{
		int n;
		int aa;
		int bb;
		int i;
		int j;
		int p;
		int q;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		String d = new String(new char[100]);
		a = new Scanner(System.in).nextLine();
		while (n > 0)
		{
			n = n - 1;
			a = new Scanner(System.in).nextLine();
			b = new Scanner(System.in).nextLine();
			d = new Scanner(System.in).nextLine();
			aa = (strlen)(a);
			bb = (strlen)(b);
			for (i = aa;i >= 0;i--)
			{
				b = tangible.StringFunctions.changeCharacter(b, i, b.charAt(i - aa + bb));
			}
			for (i = 0;i < aa - bb;i++)
			{
				b = tangible.StringFunctions.changeCharacter(b, i, '0');
			}
			int[] c = new int[aa];
			for (i = aa - 1;i >= 0;i--)
			{
				p = (int)(a.charAt(i));
				q = (int)(b.charAt(i));
				if (p >= q)
				{
					c[i] = p - q;
				}
				else
				{
					c[i] = p + 10 - q;
					a = tangible.StringFunctions.changeCharacter(a, i - 1, (char)((int)(a.charAt(i - 1)) - 1));
				}
			}
			for (i = 0;i < 100;i++)
			{
				if (c[i] != 0)
				{
					break;
				}
			}
			for (j = i;j < 100;j++)
			{
				c[j - i] = c[j];
			}
			for (j = 0;j < aa - i;j++)
			{
				System.out.print(c[j]);
			}
			System.out.print("\n");
		}
		return 0;
	}

}

