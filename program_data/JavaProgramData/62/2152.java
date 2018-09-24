import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[101]);
		String p;
		int i;
		str = new Scanner(System.in).nextLine();
		for (i = 0;i < str.length();i++)
		{
			if (str.charAt(i) != ' ')
			{
				p = str.charAt(i);
				System.out.print(p);
				continue;
			}
			if (str.charAt(i) == ' ')
			{
				if (str.charAt(i - 1) != ' ')
				{
					p = str.charAt(i);
					System.out.print(p);
					continue;
				}
			}
		}
		System.out.print("\n");
		return 0;
	}

}
