import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[257]);
		String sub = new String(new char[50]);
		String rep = new String(new char[50]);
		int i;
		int j;
		int t;
		int k;
		int len_s;
		int len_sub;
		s = new Scanner(System.in).nextLine();
		sub = new Scanner(System.in).nextLine();
		rep = new Scanner(System.in).nextLine();
		len_s = s.length();
		len_sub = sub.length();
		for (t = 0; t < len_s; t++)
		{
			if (s.charAt(t) == sub.charAt(0))
			{
				for (i = 0; i < len_sub; i++)
				{
					if (s.charAt(t + i) != sub.charAt(i))
					{
						break;
					}
				}
				if (i == len_sub)
				{
					break;
				}
			}
		}
		if (t == len_s)
		{
			System.out.print(s);
			System.out.print("\n");
		}
		else
		{
			for (i = 0; i < t; i++)
			{
				System.out.print(s.charAt(i));
			}
			System.out.print(rep);
			for (k = 0; s.charAt(i + len_sub + k) != '\0'; k++)
			{
				System.out.print(s.charAt(i + len_sub + k));
			}
			System.out.print("\n");
		}
		return 0;
	}
}
