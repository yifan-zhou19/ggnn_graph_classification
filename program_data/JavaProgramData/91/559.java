import java.util.*;

package <missing>;

public class GlobalMembers
{
	/**
	* ?????????? 
	* ?????
	* ???10.12.15
	***/

	public static int Main()
	{
		String str = new String(new char[150]);
		str = new Scanner(System.in).nextLine(); //?????
		int i;
		int len = str.length();
		for (i = 0; i < len - 1 ; i++)
		{
			System.out.print((char)(str.charAt(i) + str.charAt(i + 1)));
		}
		System.out.print((char)(str.charAt(len - 1) + str.charAt(0)));

		return 0;
	}



}
