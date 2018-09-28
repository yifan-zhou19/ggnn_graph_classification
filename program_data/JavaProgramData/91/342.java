import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[102]);
		a = new Scanner(System.in).nextLine();
		int length = a.length();
		int a0 = a.charAt(0);
		for (int i = 0; i < length - 1; i++)
		{
			a.charAt(i) += a.charAt(i + 1);
		}
		a.charAt(length - 1) += a0;
		System.out.print(a);
	}
}
