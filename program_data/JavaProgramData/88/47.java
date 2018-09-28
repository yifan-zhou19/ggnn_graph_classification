import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String ch = new String(new char[50]);
		int i;
		int j;
		int t1 = 0;
		int t2 = 0;
		int n = 0;
		int l;
		ch = new Scanner(System.in).nextLine();
		l = ch.length();
		n = 0;
		for (i = 0;i < l;i++)
		{
			if (ch.charAt(i) >= 48 && ch.charAt(i) <= 57)
			{
				if (t1 == 0)
				{
					t1 = 1;
				}
				n *= 10;
				n += ch.charAt(i) - 48;
			}
			else
			{
				if (t1 == 1)
				{
					System.out.print(n);
					System.out.print("\n");
				}
				n = 0;
				t1 = 0;
			}
		}
		if (t1 == 1)
		{
			System.out.print(n);
			System.out.print("\n");
		}
		return 0;
	}
}
