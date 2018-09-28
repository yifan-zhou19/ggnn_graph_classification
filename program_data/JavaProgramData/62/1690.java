import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[201]);
		a = new Scanner(System.in).nextLine();
		int len;
		int f = 0;
		len = a.length();
		for (int i = 0;i < len;i++)
		{
			if (a.charAt(i) != ' ')
			{
				f = 1;
				System.out.print(a.charAt(i));
			}
			else
			{
				if (f == 1)
				{
					System.out.print(' ');
					f = 0;
				}
			}
		}
		return 0;
	}
}
