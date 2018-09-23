import java.util.*;

package <missing>;

public class GlobalMembers
{
	/*
	 * 1000012889_30.3.cpp
	 *
	 *  Created on: 2010-11-10
	 *      Author: ???
	 *        ??:????
	 */



	public static int Main()
	{
		int k;
		int i;
		int j;
		int r;
		int h;
		int l;
		int m;
		int n;
		int p;
		int q;
		String s = new String(new char[101]);
		String a = new String(new char[101]);
		String b = new String(new char[101]);
		String c = new String(new char[101]);
		s = new Scanner(System.in).nextLine();
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b = ConsoleInput.readToWhiteSpace(true).charAt(0);
		k = s.length();
		i = a.length();
		j = b.length();
		for (r = 0;r <= k - i + 1;r++)
		{
			for (h = r,l = 0;h < r + i;h++,l++)
			{
				if (s.charAt(h) != a.charAt(l))
				{
					break;
				}
			}
			if (l == i && ((r == 0 && s.charAt(r + i) == ' ') || (r > 0 && s.charAt(r - 1) == ' ' && s.charAt(r + i) == ' ') || (r + i == k && s.charAt(r - 1) == ' ')))
			{
				for (m = 0,n = r + i;m <= k - r - i;m++,n++)
				{
					c = tangible.StringFunctions.changeCharacter(c, m, s.charAt(n));
				}
				for (p = 0,q = r;p <= j;p++,q++)
				{
					s = tangible.StringFunctions.changeCharacter(s, q, b.charAt(p));
				}
				s += c;
				k = k - i + j;
				r = r + j;
			}
		}
		System.out.print(s);
		System.out.print("\n");
		return 0;
	}




}

