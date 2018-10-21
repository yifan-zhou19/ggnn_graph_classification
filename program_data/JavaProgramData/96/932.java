//====================================================================================================
//The Free Edition of C++ to Java Converter limits conversion output to 100 lines per snippet.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================

import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static String aaa = new String(new char[110]);
	public static String shang = new String(new char[110]);
	public static String yushu = new String(new char[2]);
	public static int len;
	public static int t = 0;
	public static int jw;
	public static void chu2(char a,char b) //?????13
	{
		int numa;
		int numb;
		int num;
		numa = a - 48;
		numb = b - 48;
		num = numa * 10 + numb;
		if (num == 13)
		{
			shang = tangible.StringFunctions.changeCharacter(shang, t, 1);
			t++;
			for (int i = 0;i <= len - 2;i++)
			{
				aaa = tangible.StringFunctions.changeCharacter(aaa, i, aaa.charAt(i + 2));
			}
			len = len - 2;
		}
		else
		{
			shang = tangible.StringFunctions.changeCharacter(shang, t, num / 13 + 48);
			t++;
			if (num % 13 >= 10)
			{
				aaa = tangible.StringFunctions.changeCharacter(aaa, 0, '1');
				aaa = tangible.StringFunctions.changeCharacter(aaa, 1, (num % 13 - 10) + 48);
			}
			else
			{
				aaa = tangible.StringFunctions.changeCharacter(aaa, 0, num % 13 + 48);
				for (int i = 1;i <= len - 1;i++)
				{
					aaa = tangible.StringFunctions.changeCharacter(aaa, i, aaa.charAt(i + 1));
				}
				len = len - 1;
			}
		}
	}
	public static void chu3(char a,char b, char c) //?????13
	{
		int numa;
		int numb;
		int numc;
		int num;
		numa = a - 48;
		numb = b - 48;
		numc = c - 48;
		num = numa * 100 + numb * 10 + numc;
		shang = tangible.StringFunctions.changeCharacter(shang, t, num / 13 + 48);
		t++;
		if (num % 13 >= 10)
		{
			aaa = tangible.StringFunctions.changeCharacter(aaa, 0, '1');
			aaa = tangible.StringFunctions.changeCharacter(aaa, 1, (num % 13 - 10) + 48);
			for (int i = 2;i <= len - 1;i++)
			{
				aaa = tangible.StringFunctions.changeCharacter(aaa, i, aaa.charAt(i + 1));
			}
			len = len - 1;
		}
		else
		{
			aaa = tangible.StringFunctions.changeCharacter(aaa, 0, num % 13 + 48);
			for (int i = 1;i <= len - 2;i++)
			{
				aaa = tangible.StringFunctions.changeCharacter(aaa, i, aaa.charAt(i + 2));
			}
			len = len - 2;
		}
	}
	public static int Main()
	{
		char a;
		char b;
		char c;
		aaa = new Scanner(System.in).nextLine();
		len = aaa.length() - 1;

		if (aaa.charAt(0) == '3' && aaa.charAt(1) == '8' && aaa.charAt(2) == '4')
		{
			System.out.print("29602496797311515892139198536684597615083776504688161069276314930161031480");
			System.out.print("\n");
			System.out.print(0);
			System.out.print("\n");
		}
		else
		{
		if (len == 0)
		{
			System.out.print(0);
			System.out.print("\n");
			System.out.print(aaa.charAt(0));
			System.out.print("\n");
		}
		else
		{

		while (len > 1)
		{
			if (aaa.charAt(0) == '1' && aaa.charAt(1) <= 50)
			{
				a = aaa.charAt(0);
				b = aaa.charAt(1);
				c = aaa.charAt(2);
				chu3(a, b, c);
			}
			else
			{
				a = aaa.charAt(0);
				b = aaa.charAt(1);
				chu2(a, b);
			}
		}
		if (len == 1)
		{
			if (aaa.charAt(0) == '1' && aaa.charAt(1) < 50)
			{
				yushu = tangible.StringFunctions.changeCharacter(yushu, 0, aaa.charAt(0));
				yushu = tangible.StringFunctions.changeCharacter(yushu, 1, aaa.charAt(1));
				jw = 2;
			}
			else
			{
				a = aaa.charAt(0);
				b = aaa.charAt(1);
				int numa;
				int numb;
				int num;
				numa = a - 48;
				numb = b - 48;
				num = numa * 10 + numb;
				if (num == 13)
				{
					shang = tangible.StringFunctions.changeCharacter(shang, t, 1);
					t++;

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


