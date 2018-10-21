import java.util.*;

package <missing>;

public class GlobalMembers
{
	/*
	 *  ?????.cpp
	 *  Created on: 2012-11-24
	 *  Author: ???
	 */
	public static String a = new String(new char[300]); //a?b??????????????c??????
	public static String b = new String(new char[300]);
	public static String c = new String(new char[300]);
	public static String tem = new String(new char[300]);
	public static int i; //len1?len2???a?b???
	public static int len1;
	public static int len2;
	public static int len3;
	public static int firstout;
	public static int plu(int n, int add)
	{ //???????????
		if (n == 0)
		{ //?????1?0??
			if (a.charAt(0) + b.charAt(0) + add >= 106)
			{ //????????
				c = tangible.StringFunctions.changeCharacter(c, 0, a.charAt(0) + b.charAt(0) + add - 58); //??1?????
				for (i = len3;i >= 1;i--)
				{ //????????
					c = tangible.StringFunctions.changeCharacter(c, i, c.charAt(i - 1));
				}
				c = tangible.StringFunctions.changeCharacter(c, 0, '1');
				len3 = len3 + 1; //?1??�1�
			}
			else
			{ //?????
				c = tangible.StringFunctions.changeCharacter(c, 0, a.charAt(0) + b.charAt(0) + add - 48); //????1?
			}
		}
		else
		{ //?????1?
			if (a.charAt(n) + b.charAt(n) + add >= 106)
			{ //????
				/*if (n == (len3 - 1)) {//
					c[n] = a[n] + b[n] + add - 58;
					return plu(n - 1, 1);//
				} else {//*/
					c = tangible.StringFunctions.changeCharacter(c, n, a.charAt(n) + b.charAt(n) + add - 58);
					return plu(n - 1, 1);

			}
			else
			{
				c = tangible.StringFunctions.changeCharacter(c, n, a.charAt(n) + b.charAt(n) + add - 48);
				return plu(n - 1, 0);
			}
		}
	}
	public static int Main()
	{
		for (i = 0; i < 300; i++)
		{
			a = tangible.StringFunctions.changeCharacter(a, i, b[i] = c[i] = tem[i] = '0');
		}
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		len1 = a.length();
		a = tangible.StringFunctions.changeCharacter(a, len1, '0');
		len2 = b.length();
		b = tangible.StringFunctions.changeCharacter(b, len2, '0');
		if (len1 > len2)
		{
			len3 = len1;
			for (i = len2 - 1; i >= 0; i--)
			{
				tem = tangible.StringFunctions.changeCharacter(tem, i + (len3 - len2), b.charAt(i));
			}
			b = tem;
		}
		else
		{
			len3 = len2;
			for (i = len1 - 1; i >= 0; i--)
			{
				tem = tangible.StringFunctions.changeCharacter(tem, i + (len3 - len1), a.charAt(i));
			}
			a = tem;
		}
		plu(len3 - 1, 0);
		for (i = 0; i < len3; i++)
		{
			if (c.charAt(i) != '0')
			{
				firstout = i;
				break;
			}
		}
		for (i = firstout; i < len3; i++)
		{
			System.out.print(c.charAt(i));
		}
		return 0;
	}
}

