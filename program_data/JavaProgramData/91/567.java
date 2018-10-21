import java.util.*;

package <missing>;

public class GlobalMembers
{
	//*****************************
	//*  ???????????   *
	//*  ?  ?????           *
	//*  ?  ??1000012738       *
	//*  ?  ??2010.12.21.      *
	//*****************************

	public static int Main()
	{
		String str = new String(new char[101]); // ????????
		String convert = new String(new char[101]);
		str = new Scanner(System.in).nextLine(); // ?????
		int length = str.length(); // ????
		int i; // ??????
		for (i = 0; i < length - 1; i++) // ?????????
		{
			convert = tangible.StringFunctions.changeCharacter(convert, i, str.charAt(i) + str.charAt(i + 1)); // ????
		}
		convert = tangible.StringFunctions.changeCharacter(convert, i, str.charAt(0) + str.charAt(i)); // ????
		for (i = 0; i < length; i++)
		{
			System.out.print(convert.charAt(i));
		}
		System.out.print("\n");
		return 0;
	}
}

