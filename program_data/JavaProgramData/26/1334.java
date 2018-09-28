import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String m = new String(new char[102]);
		m = new Scanner(System.in).nextLine();
		int len = m.length();
		for (int i = 0;i < len;i++)
		{
			if (m.charAt(i) == ' ')
			{
				if (m.charAt(i - 1) != ' ')
				{
					System.out.print(m.charAt(i));
				}
			}
			else
			{
				System.out.print(m.charAt(i));
			}
		}
		System.out.print("\n");
		return 0;
	}
}
