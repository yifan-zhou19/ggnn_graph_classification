import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[102]);
		String s1 = new String(new char[102]);
		s = new Scanner(System.in).nextLine();
		int i = 0;
		String p = s;
		String q = s1;
		for (i = 0;i < s.length() - 1;i++)
		{
			*(q.Substring(i)) = *(p.Substring(i)) + *(p.Substring(i) + 1);
			System.out.print((q.Substring(i)));
		}
			*(q.Substring(i)) = *(p.Substring(i)) + (p);
			System.out.print((q.Substring(i)));
		return 0;
	}
}
