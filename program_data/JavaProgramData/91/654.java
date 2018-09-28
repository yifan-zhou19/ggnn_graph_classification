import java.util.*;

package <missing>;

public class GlobalMembers
{
	//Name: ???????#
	//Author:   ??      #
	//Number: 1000062710  #
	//Date: 2010?12?15?#
	///#####################
	public static int Main()
	{
		String str = new String(new char[101]);
		str = new Scanner(System.in).nextLine();
		int lin = str.length();
		String a = new String(new char[100]);
		for (int i = 0; i <= lin; i++)
		{
			if (i < lin)
			{
				str = tangible.StringFunctions.changeCharacter(str, i, str.charAt(i));
			}
			else
			{
				str = tangible.StringFunctions.changeCharacter(str, i, str.charAt(0));
			}
		}
		for (int j = 0; j < lin; j++)
		{
			a = tangible.StringFunctions.changeCharacter(a, j, str.charAt(j) + str.charAt(j + 1));
			System.out.print(a.charAt(j));
		}
		System.out.print("\n");
		return 0;
	}
}

