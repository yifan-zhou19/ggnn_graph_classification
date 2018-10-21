import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int u;
		int v;
		int l;
		int num = 0;
		String str = new String(new char[100]);
		String p = null;
		String r = null;
		str = new Scanner(System.in).nextLine();
		p = str;
		r = str;
		l = str.length();
		for (u = 0; u <= l - 1; u++)
		{
			if (*(p.Substring(u)) != ' ')
			{
				*(p.Substring(u) - num) = *(p.Substring(u));
			}
			else
			{
				*(p.Substring(u) - num) = ' ';
				for (v = u + 1; * (p.Substring(v)) == ' '; v++)
				{
					num++;
				}
				u = v - 1;
			}
		}
		u = 0;
		for (u = 0; u <= l - 1 - num; u++)
		{
			System.out.print((p.Substring(u)));
		}
		System.out.print("\n");
		return 0;
	}
}
