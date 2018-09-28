import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str1 = new String(new char[80]); //????
		String str2 = new String(new char[80]);
		int length1; //??1???2?????????
		int length2;
		int i;
		int a;
		str1 = new Scanner(System.in).nextLine(); //????
		str2 = new Scanner(System.in).nextLine();
		length1 = str1.length(); //????
		length2 = str2.length();
		for (i = 0;i <= length1 - 1;i++) //???1??????????
		{
			if ((str1.charAt(i) <= 'z') && (str1.charAt(i) >= 'a'))
			{
				str1 = tangible.StringFunctions.changeCharacter(str1, i, str1.charAt(i) - 32);
			}
		}
		for (i = 0;i <= length2 - 1;i++) //???2??????????
		{
			if ((str2.charAt(i) <= 'z') && (str2.charAt(i) >= 'a'))
			{
				str2 = tangible.StringFunctions.changeCharacter(str2, i, str2.charAt(i) - 32);
			}
		}
		a = strcmp(str1,str2); //??????
		if (a == 0)
		{
			System.out.print("=");
			System.out.print("\n");
		}
		if (a == 1)
		{
			System.out.print(">");
			System.out.print("\n");
		}
		if (a == -1)
		{
			System.out.print("<");
			System.out.print("\n");
		}
		return 0;
	}

}

