import java.util.*;

package <missing>;

public class GlobalMembers
{
	//********************************
	//*??????????   **
	//*?????? 1200012827 **
	//*???2012.12.09  **
	//********************************
	public static int Main()
	{
		String str = new String(new char[101]); //????????????
		String Friend = new String(new char[101]);
		str = new Scanner(System.in).nextLine();
		int len = str.length();
		Friend = tangible.StringFunctions.changeCharacter(Friend, len, '\0');
		Friend = tangible.StringFunctions.changeCharacter(Friend, len - 1, str.charAt(0) + str.charAt(len - 1)); //????????????????
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		p = str;
		for (int i = 0; i <= len - 2; i++)
		{
			Friend = tangible.StringFunctions.changeCharacter(Friend, i, (*p++) + *(p + 1)); //????????
		}
		System.out.print(Friend);
		return 0;
	}

}

