import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str1 = new String(new char[100]); //str1?str2????????????????str3?????????
		final String str2 = "";
		String str3 = new String(new char[2]);
		int i;
		str1 = new Scanner(System.in).nextLine();
		for (i = 0;i < str1.length();i++) //???????????????str2
		{
			if (str1.charAt(i) != ' ' || str1.charAt(i) == ' ' && str1.charAt(i + 1) != ' ')
			{
				str3 = tangible.StringFunctions.changeCharacter(str3, 0, str1.charAt(i));
				str3 = tangible.StringFunctions.changeCharacter(str3, 1, '\0');
				str2 += str3;
			}
		}
		System.out.print(str2);
		return 0;
	}
}

