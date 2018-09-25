import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[1000]);
		a = new Scanner(System.in).nextLine();
		int i;
		int l = a.length();
		for (i = l - 1;i >= 0;i--)
		{
			System.out.print(a.charAt(i));
		}
		System.out.print("\n");
	}
}
