import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str1 = new String(new char[81]); //?????????
		String str2 = new String(new char[81]);
		char i;
		str1 = new Scanner(System.in).nextLine(); //????1
		str2 = new Scanner(System.in).nextLine(); //????2
		for (i = 0;i < str1.length();i++) //???1??????
		{
			if (str1.charAt(i) < 91)
			{
				str1 = tangible.StringFunctions.changeCharacter(str1, i, str1.charAt(i) + 32);
			}
		}
		for (i = 0;i < str2.length();i++) //???2??????
		{
				if (str2.charAt(i) < 91)
				{
					str2 = tangible.StringFunctions.changeCharacter(str2, i, str2.charAt(i) + 32);
				}
		}
		switch (strcmp(str1,str2)) //???????
		{
			   case 1:
			   System.out.print('>');
			   break;
		   case 0:
		   System.out.print('=');
		   break;
		   default:
			   System.out.print('<');
		}
		return 0;
	}
}

