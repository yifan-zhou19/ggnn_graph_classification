import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int num;
		int len = 0;
		int i = 0;
		String p = null;
		String a = new String(new char[10000]);
		a = new Scanner(System.in).nextLine();
		len = a.length();
		p = a.charAt(len - 1);
		for (i = 0 ; i <= len - 1 ; i++)
		{
			System.out.print((p - i));
		}
		return 0;
	}
}
