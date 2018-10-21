import java.util.*;

package <missing>;

public class GlobalMembers
{
	/*
	 *????????
	 *?????
	 *??: 2011-1-7
	 */


	public static int Main()
	{
		String s = new String(new char[100]);
		s = new Scanner(System.in).nextLine();
		int i = 0;
		while (i < s.length())
		{
			while (s.charAt(i) - '0' <= 9 && s.charAt(i) - '0' >= 0)
			{
				System.out.print(s.charAt(i));
				i++;
			}
			System.out.print("\n");
			while (!(s.charAt(i) - '0' <= 9 && s.charAt(i) - '0' >= 0) && i < s.length())
			{
				i++;
			}
		}
		return 0;
	}
}
