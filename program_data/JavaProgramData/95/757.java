import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{ //???
		String str1 = new String(new char[80]); //?????
		String str2 = new String(new char[80]);
		str1 = new Scanner(System.in).nextLine();
		str2 = new Scanner(System.in).nextLine(); //????????
		for (int i = 0;i < str1.length();i++)
		{ //????1????1???????????????
			if (str1.charAt(i) <= 'z' && str1.charAt(i) >= 'a')
			{
						str1 = tangible.StringFunctions.changeCharacter(str1, i, str1.charAt(i) - 32);
			}
		}
		for (int j = 0;j < str2.length();j++)
		{ //????2????2???????????????
				if (str2.charAt(j) <= 'z' && str2.charAt(j) >= 'a')
				{
							str2 = tangible.StringFunctions.changeCharacter(str2, j, str2.charAt(j) - 32);
				}
		}
		strcmp(str1,str2); //??????????
		if (strcmp(str1,str2) == 0)
		{
			System.out.print("=");
			System.out.print("\n");
		}
		if (strcmp(str1,str2) == 1)
		{
			System.out.print(">");
			System.out.print("\n");
		}
		if (strcmp(str1,str2) == -1)
		{
			System.out.print("<");
			System.out.print("\n");
		}
		return 0; //????
	}
}

