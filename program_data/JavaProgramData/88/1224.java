import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String a = new String(new char[320]);
		a = new Scanner(System.in).nextLine();
		n = a.length();
		if ('0' <= a.charAt(0) && a.charAt(0) <= '9')
		{
			System.out.print(a.charAt(0));
		}
		for (int i = 1;i < n;i++)
		{
			if ('0' <= a.charAt(i) && a.charAt(i) <= '9')
			{
				System.out.print(a.charAt(i));
			}
			else if (a.charAt(i - 1) >= '0' && a.charAt(i - 1) <= '9')
			{
				System.out.print("\n");
			}
			else
			{
				continue;
			}
		}
		System.out.print("\n");
		return 0;
	}
}
