import java.util.*;

package <missing>;

public class GlobalMembers
{
	/*
	 *function: ???????
	 *created on: 2012-12-15
	 *author: ???
	 */
	public static int Main()
	{
		String a = new String(new char[105]); // b??????????
		String b = new String(new char[105]);
		int i;
		int len;
		a = new Scanner(System.in).nextLine(); // a??????????
		len = a.length();
		for (i = 0;i < len - 1;i++)
		{
			*(b.Substring(i)) = *(a.Substring(i)) + *(a.Substring(i) + 1); // ????a?????????????
			System.out.print((b.Substring(i)));
		}
		*(b.Substring(len) - 1) = *(a.Substring(len) - 1) + *a;
		System.out.print((b.Substring(len) - 1));
		System.out.print("\n");
		return 0;
	}






}
