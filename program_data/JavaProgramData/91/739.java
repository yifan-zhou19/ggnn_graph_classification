import java.util.*;

package <missing>;

public class GlobalMembers
{
	/*??????
	 *?????zhizhen6.cpp
	 *Created on: 2012-12-11
	 *??????????
	 */
	public static int Main()
	{
		String cha1 = new String(new char[150]); //?????????
		String cha2 = new String(new char[150]);
		String t = null;
		cha1 = new Scanner(System.in).nextLine(); //????
		t = cha1;
		int i;
		int len;
		len = cha1.length();
		for (i = 0; i < len - 1; i++) //???????
		{
			cha2 = tangible.StringFunctions.changeCharacter(cha2, i, *(t.Substring(i)) + *(t.Substring(i) + 1));
		}
		cha2 = tangible.StringFunctions.changeCharacter(cha2, len - 1, t + *(t.Substring(len) - 1));
		for (i = 0;i < len;i++) //????
		{
		System.out.print(cha2.charAt(i));
		}
		return 0; //????
	}

}

