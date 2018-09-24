import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		final String str = "";
		str = new Scanner(System.in).nextLine();
		for (int i = str.length() - 1;i >= 0;i--)
		{
			System.out.print(str.charAt(i));
		}
		return 0;
	}
}
