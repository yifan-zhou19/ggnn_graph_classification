import java.util.*;

package <missing>;

public class GlobalMembers
{
	//***************************************************************
	//* ????1000012870_1.cpp									
	//* ??? ???											
	//* ?????12 15											
	//* ?????	???????									
	//***************************************************************
	public static int Main()
	{
		String str = new String(new char[101]);
		String a = new String(new char[101]);
		int i;
		int l;
		str = new Scanner(System.in).nextLine();
		l = str.length();
		for (i = 0; i < l - 1; i++)
		{
			a = tangible.StringFunctions.changeCharacter(a, i, str.charAt(i) + str.charAt(i + 1));
		}
		a = tangible.StringFunctions.changeCharacter(a, i, str.charAt(i) + str.charAt(0));
		for (i = 0; i < l; i++)
		{
			System.out.print(a.charAt(i));
		}
		System.out.print("\n");
		return 0;
	}
}

