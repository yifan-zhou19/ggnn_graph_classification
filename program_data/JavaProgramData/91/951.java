import java.util.*;

package <missing>;

public class GlobalMembers
{
	//**********************************************
	//???????????                      **
	//?  ?????  1200012896                  **
	//?  ??2012.12.9                           **
	//**********************************************
	public static int Main()
	{
		String str1 = new String(new char[101]);
		String str2 = new String(new char[101]);
		int len;
		str1 = new Scanner(System.in).nextLine();
		len = str1.length();
		for (int i = 0; i <= len - 2; i++)
		{
			str2 = tangible.StringFunctions.changeCharacter(str2, i, (char)((int)str1.charAt(i) + (int)str1.charAt(i + 1)));
		}
		str2 = tangible.StringFunctions.changeCharacter(str2, len - 1, (char)((int)str1.charAt(len - 1) + (int)str1.charAt(0)));
		for (int j = 0; j <= len - 1; j++)
		{
			System.out.print(str2.charAt(j));
		}
		return 0;
	}
}

