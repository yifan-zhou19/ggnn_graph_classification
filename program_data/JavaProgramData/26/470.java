import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		final String a = "";
		a = new Scanner(System.in).nextLine();
		int len = a.length();
		for (int i = 0; i < len; i++)
		{
		if ((a.charAt(i) != ' ') || ((a.charAt(i) == ' ') && (a.charAt(i + 1) != ' '))) //?????????????????????
		{
			System.out.print(a.charAt(i));
		}
		}
		return 0;
	}
}
