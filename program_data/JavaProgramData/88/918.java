import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[1000]);
		String[] p = new String[1000];
		int i;
		a = new Scanner(System.in).nextLine();
		for (i = 0;i < a.length();i++)
		{
			if (a.charAt(i) >= '0' && a.charAt(i) <= '9')
			{
				p[i] = a.charAt(i);
			}
			else
			{
				p[i] = null;
			}
		}
		for (i = 0;i < a.length();i++)
		{
			if (p[i] != null)
			{
				System.out.print(p[i]);
			}
			else if (p[i + 1] != null)
			{
				System.out.print("\n");
			}
		}
		return 0;
	}


}
