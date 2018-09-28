package <missing>;

public class GlobalMembers
{
	//****************************************
	//*?????13                       
	//*?????? 1100012789      
	//*???2011.11.4                       
	//****************************************

	public static int Main()
	{
		String number = new String(new char[101]); // number????????result?????
		String result = new String(new char[101]);
		int i; // i?????remain??????digit??????
		int remain = 0;
		int digit;
		number = ConsoleInput.readToWhiteSpace(true).charAt(0);
		digit = number.length();
		for (i = 0; i < digit; i++)
		{
			result = tangible.StringFunctions.changeCharacter(result, i, ((remain * 10 + (number.charAt(i) - '0')) / 13) + '0'); // ?????????
			remain = (remain * 10 + (number.charAt(i) - '0')) % 13; // ???????
		}
		result = tangible.StringFunctions.changeCharacter(result, i, '\0'); // ??????
		for (i = 0; result.charAt(i) == '0' && i < result.length() - 1;) // ?????????????????
		{
				i++;
		}
		System.out.print(result.Substring(i));
		System.out.print("\n");
		System.out.print(remain);
		System.out.print("\n");
		return 0;
	}
	//??3?11?????????
}

