package <missing>;

public class GlobalMembers
{
	/*
	 * 1000012761_303.cpp
	 *
	 *  Created on: 2010-11-5
	 *      Author: 378073652
	 */

	public static int Main()
	{
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		String c = new String(new char[100]);
		String d = new String(new char[10000]);
		int i = 0;
		int j = 0;
		int k;
		int la;
		int lb;
		int lc;
		int s = 0;
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		c = new Scanner(System.in).nextLine();
		la = a.length();
		lb = b.length();
		lc = c.length();
		for (i = 0;i < la;i++)
		{
			for (k = 0,s = 0;k < lb;k++)
			{
				if (a.charAt(i) == b.charAt(k))
				{
					s = s + 1;
				}
				i = i + 1;
			}


			   if ((a.charAt(i - k - 1) == ' ') && (s == lb) || ((i - k == 0) && (s == lb)))
			   {
				   i = i - 1;
				   for (k = 0;k < lc;k = k + 1)
				   {
					   d = tangible.StringFunctions.changeCharacter(d, j, c.charAt(k));
					   j = j + 1;
				   }
			   }
				else
				{
					i = i - k;
					d = tangible.StringFunctions.changeCharacter(d, j, a.charAt(i));
					j = j + 1;
				}



		}
		System.out.print(d);
	}



}

