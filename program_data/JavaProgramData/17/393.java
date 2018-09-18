package <missing>;

public class GlobalMembers
{
	/*
	 * XIII4.cpp
	 *
	 *  Created on: 2012-11-30
	 *      Author: 12100
	 *      ??:??????
	 */
	public static String a = new String(new char[101]);
	public static String b = new String(new char[101]);
	public static int[] panduan = new int[101];
	public static int l;
	public static void deal(int k)
	{
		if (k > 0)
		{
			if (a.charAt(k - 1) == ')')
			{
					panduan[k - 1] = 1;
					deal(k - 1);
			}
			else if (a.charAt(k - 1) == '(')
			{
				panduan[k - 1] = 2;
				for (int i = k; i < l; i++)
				{
					if (panduan[i] == 1)
					{
						panduan[k - 1] = 0;
						panduan[i] = 0;
						break;
					}
				}
				deal(k - 1);
			}
			else
			{
				deal(k - 1);
			}
		}
	}
	public static int Main()
	{
		int i;
		for (i = 0; i < 101; i++)
		{
			a = tangible.StringFunctions.changeCharacter(a, i, ' ');
			b = tangible.StringFunctions.changeCharacter(b, i, ' ');
			panduan[i] = 0;
		}
		while ((a = ConsoleInput.readToWhiteSpace(true).charAt(0)).length() > 0)
		{
			l = a.length();
			deal(l);
			for (i = 0; i < l; i++)
			{
				if (panduan[i] == 1)
				{
					b = tangible.StringFunctions.changeCharacter(b, i, '?');
				}
				if (panduan[i] == 2)
				{
					b = tangible.StringFunctions.changeCharacter(b, i, '$');
				}
			}
			for (i = 0; i < l; i++)
			{
				System.out.print(a.charAt(i));
			}
			System.out.print("\n");
			for (i = 0; i < l; i++)
			{
				System.out.print(b.charAt(i));
			}
			System.out.print("\n");
			for (i = 0; i < 101; i++)
			{
				a = tangible.StringFunctions.changeCharacter(a, i, ' ');
				b = tangible.StringFunctions.changeCharacter(b, i, ' ');
				panduan[i] = 0;
			}
		}
	}

}

