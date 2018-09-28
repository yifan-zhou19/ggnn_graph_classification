import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int q;
		String p = null;
		String str = new String(new char[100]);
		str = new Scanner(System.in).nextLine();
		p = str;
		for (i = 0;p.charAt(i);i++)
		{
			if (p.charAt(i) <= '9' && p.charAt(i) >= '0' && p.charAt(i - 1) != '-')
			{
				System.out.print(p.charAt(i));

			if (p.charAt(i + 1) > '9' || p.charAt(i + 1) < '0')
			{
			System.out.print("\n");
			}
			}
		}
		q = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		return 0;
	}
}

