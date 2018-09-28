import java.util.*;

package <missing>;

public class GlobalMembers
{
	//********************************
	//*??????????   **
	//*?????? 1200012988 **
	//*???2012.12.04  **
	//********************************


	public static int Main()
	{
		String str1 = new String(new char[101]);
		String str2 = new String(new char[101]);
		int len;
		int i;
		str1 = new Scanner(System.in).nextLine();
		len = str1.length();
		for (i = 0; i < len - 1; i++)
		{
			*(str2.Substring(i)) = *(str1.Substring(i)) + *(str1.Substring(i) + 1);
		}
		*(str2.Substring(len) - 1) = *str1 + *(str1.Substring(len) - 1);
		for (i = 0; i < len; i++)
		{
			System.out.print(str2.charAt(i));
		}
		System.out.print("\n");

		return 0;
	}


}
