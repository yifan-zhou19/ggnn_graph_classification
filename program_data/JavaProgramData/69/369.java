//====================================================================================================
//The Free Edition of C++ to Java Converter limits conversion output to 100 lines per snippet.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================

import java.util.*;

package <missing>;

public class GlobalMembers
{
	/*
	 * 12.10.cpp
	 *
	 *  Created on: 2011-12-2
	 *      Author: wuch
	 */

	public static int Main()
	{
		String a = new String(new char[250]); //??????a?b
		String b = new String(new char[250]);
		int[] c = new int[251];
		int i;
		int aa;
		int bb;
		int len1;
		int len2;
		a = new Scanner(System.in).nextLine(); //??a?b
		b = new Scanner(System.in).nextLine();
		len1 = a.length(); //??a?b???
		len2 = b.length();
		for (i = 0;i <= 250;i++)
		{
			c[i] = 0;
		}
		if (len1 > len2)
		{ //?????????0??????????
			for (i = len1 - 1;i >= len1 - len2;i--)
			{
				b = tangible.StringFunctions.changeCharacter(b, i, b.charAt(i - len1 + len2));
			}
			for (i = 0;i < len1 - len2;i++)
			{
				b = tangible.StringFunctions.changeCharacter(b, i, '0');
			}
			len2 = len1;
		}
		if (len1 < len2)
		{
				for (i = len2 - 1;i >= len2 - len1;i--)
				{
					a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i - len2 + len1));
				}
				for (i = 0;i < len2 - len1;i++)
				{
					a = tangible.StringFunctions.changeCharacter(a, i, '0');
				}
				len1 = len2;
		}
		for (i = 0;i < len1;i++)
		{ //?????i???????
			switch (a.charAt(len1 - i - 1)) //??a?????i?
			{
			case'0':
			aa = 0;
			break;
			case'1':
			aa = 1;
			break;
			case'2':
			aa = 2;
			break;
			case'3':
			aa = 3;
			break;
			case'4':
			aa = 4;
			break;
			case'5':
			aa = 5;
			break;
			case'6':
			aa = 6;
			break;
			case'7':
			aa = 7;
			break;
			case'8':
			aa = 8;
			break;
			case'9':
			aa = 9;
			break;
			default:
				break;
			}
			switch (b.charAt(len1 - i - 1)) //??b?????i?
			{
			case'0':
			bb = 0;
			break;
			case'1':
			bb = 1;
			break;
			case'2':
			bb = 2;
			break;
			case'3':
			bb = 3;
			break;
			case'4':
			bb = 4;
			break;
			case'5':
			bb = 5;
			break;
			case'6':
			bb = 6;
			break;
			case'7':
			bb = 7;
			break;
			case'8':
			bb = 8;
			break;
			case'9':
			bb = 9;
			break;
			default:
				break;
			}
			c[i] = c[i] + aa + bb; //????

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


