import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[200]);
		a = new Scanner(System.in).nextLine();
		int t = a.length();
		for (int i = 0;i < t;i++)
		{
				if (*(a.Substring(i)) != ' ')
				{
			System.out.print((a.Substring(i)));
				}
			if (*(a.Substring(i)) == ' ' && *(a.Substring(i) + 1) != ' ')
			{
						System.out.print(' ');
			}
			if (*(a.Substring(i)) == ' ')
			{
				continue;
			}

		}
		return 0;
	}

}
