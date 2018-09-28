import java.util.*;

package <missing>;

public class GlobalMembers
{
	//**********************************
	//????10000012825              *
	//??????                     *
	//???12.15                      *
	//????????????         *
	//**********************************
	public static int Main()
	{
		String str1 = new String(new char[101]);
		String str2 = new String(new char[101]);
		int i;
		int len;
		str1 = new Scanner(System.in).nextLine();
		len = str1.length(); //??????????
		for (i = 0; i <= len - 2; i++)
		{
			str2 = tangible.StringFunctions.changeCharacter(str2, i, str1.charAt(i) + str1.charAt(i + 1)); //??????????????
		}
		str2 = tangible.StringFunctions.changeCharacter(str2, len - 1, str1.charAt(len - 1) + str1.charAt(0));
		str2 = tangible.StringFunctions.changeCharacter(str2, len, '\0'); //?????\0?????
		for (i = 0; str2.charAt(i) != 0; i++)
		{
			System.out.print(str2.charAt(i));
		}
		System.out.print("\n");
		return 0;
	}



}

