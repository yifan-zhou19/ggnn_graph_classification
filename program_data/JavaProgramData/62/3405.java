import java.util.*;

package <missing>;

public class GlobalMembers
{
	/*
	 *????filter.cpp
	 *??:???
	 *?????2012-11-10
	 *??????????
	 */



	public static int Main()
	{
		int i;
		int len;
		String s = new String(new char[100001]); // s?????
		s = new Scanner(System.in).nextLine(); // ??
		len = s.length(); // ??
		for (i = 0;i < len;i++)
		{
			if (!((s.charAt(i) == ' ') && (i == 0 || i == len - 1 || s.charAt(i - 1) == ' ')))
			{
			// ???????????????????
				System.out.print(s.charAt(i));
			}
		}
		return 0;
	}
}
