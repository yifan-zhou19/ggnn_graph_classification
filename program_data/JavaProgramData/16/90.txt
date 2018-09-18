import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String zhengshu = new String(new char[10001]);
		zhengshu = new Scanner(System.in).nextLine();
		int length = zhengshu.length();
		int i;
		int[] a = new int[10000];
		for (i = 0; i < length; i++)
		{
			a[i] = zhengshu.charAt(i) - '0';
		}
		for (i = length - 1; i >= 0; i--)
		{
			System.out.print(a[i]);
		}
		System.out.print("\n");
		return 0;
	}

}
