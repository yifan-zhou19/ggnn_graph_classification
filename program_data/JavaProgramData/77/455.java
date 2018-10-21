import java.util.*;

package <missing>;

public class GlobalMembers
{
	//*************************************************************
	//*                  ?????????                       *
	//*                  ?????1000010573                     *
	//*                  ?????2011?01?                     *         
	//*************************************************************



	public static String str = new String(new char[100]);
	public static int len = 0;
	public static int[] num = new int[100];
	public static int[] paixu = new int[100];
	public static void search(char b,char g)
	{
		int i = 0;
		int n = 0;
		for (n = 0; n < len ; n++)
		{
			if (str.charAt(n) == g)
			{
				if (str.charAt(n - 1) == b)
				{
					paixu[num[n]] = num[n - 1];
					i = n - 1;
					for (;i <= len; i++)
					{
						str = tangible.StringFunctions.changeCharacter(str, i, str.charAt(i + 2));
					}
					i = n - 1;
					for (; i <= len; i++)
					{
						num[i] = num[i + 2];
					}
				}
			}
		}
		if (str.charAt(0) != '\0')
		{
			search(b, g);
		}
	}
	public static int Main()
	{

		char b;
		char g;
		String str1 = new String(new char[100]);
		str = new Scanner(System.in).nextLine();
		b = str.charAt(0); //?????????
		int i;
		len = str.length();
		for (i = 0;i < len ;i++)
		{
			num[i] = i;
		}
		for (i = 1; str.charAt(i) == str.charAt(0) ; i++)
		{
			;
		}
		g = str.charAt(i); //?????????
		for (i = 0; i < len; i++)
		{
			str1 = tangible.StringFunctions.changeCharacter(str1, i, str.charAt(i));
		}
		search(b, g); //????

		for (i = 0; i < len; i++)
		{
			if (str1.charAt(i) == g)
			{
				System.out.print(paixu[i]);
				System.out.print(" ");
				System.out.print(i);
				System.out.print("\n");
			}
		}


		return 0;
	}
}

