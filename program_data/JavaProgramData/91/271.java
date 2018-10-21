import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[110]);
		String s1 = new String(new char[110]);
		String p = s;
		String p1 = s1;
		int i;
		int n;
		s = new Scanner(System.in).nextLine();
		n = s.length();
		for (i = 0;i < n - 1;i++)
		{
			*(p1.Substring(i)) = *(p.Substring(i)) + *(p.Substring(i) + 1);
		}
		*(p1.Substring(n) - 1) = *(p.Substring(n) - 1) + p;
		for (i = 0;i < n;i++)
		{
			System.out.print((p1.Substring(i)));
		}
	}

}
