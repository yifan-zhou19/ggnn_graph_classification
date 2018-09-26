import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str1 = new String(new char[10000]);
		String str2 = new String(new char[10000]);
		int i = 0;
		int k = 1;
		str1 = new Scanner(System.in).nextLine();
		str2 = tangible.StringFunctions.changeCharacter(str2, 0, str1.charAt(0));
		for (i = 1;i < 10000;i++)
		{
			if ((str1.charAt(i) != ' ') || ((str1.charAt(i - 1) != ' ') && (str1.charAt(i + 1) == ' ')) || ((str1.charAt(i - 1) != ' ') && (str1.charAt(i + 1) != ' ')))
			{
				str2 = tangible.StringFunctions.changeCharacter(str2, k, str1.charAt(i));
				k = k + 1;
			}
		}
		System.out.print(str2);
		System.out.print("\n");
		return 0;
	}
}

