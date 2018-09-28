import java.util.*;

package <missing>;

public class GlobalMembers
{
	/*????  ??*/
	public static int Main()
	{
		String a = new String(new char[30]);
		int i;
		a = new Scanner(System.in).nextLine();
		for (i = 0;i < a.length();i++)
		{
			if (a.charAt(i) - '0' >= 0 && a.charAt(i) - '0' < 10)
			{
				System.out.print(a.charAt(i));
			}
			else if (a.charAt(i + 1) - '0' >= 0 && a.charAt(i + 1) - '0' < 10)
			{
				System.out.print("\n");
			}
		}
		return 0;
	}
}
