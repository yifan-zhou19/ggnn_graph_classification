import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[101]);
		String p;
		int i;
		s = new Scanner(System.in).nextLine();
		int l = s.length();
		p = s;
		for (i = 0;i < l - 1;i++)
		{
			char a = p.charAt(i) + p.charAt(i + 1);
			System.out.print(a);
		}
		char b = p.charAt(0) + p.charAt(l - 1);
		System.out.print(b);

		return 0;
	}
}
