import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static char[] s = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};

	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		s = new Scanner(System.in).nextLine();
		for (int i = 0; i < n; i++)
		{
			s = new Scanner(System.in).nextLine();
			int len = s.length();
			int j = 1;
			if (!(s[0] == '_' || (s[0] >= 'A' && s[0] <= 'Z') || (s[0] >= 'a' && s[0] <= 'z')))
			{
				System.out.print(0);
				System.out.print("\n");
				continue;
			}
			for (j = 1; j < len; j++)
			{
				if (!(s[j] == '_' || (s[j] >= 'A' && s[j] <= 'Z') || (s[j] >= 'a' && s[j] <= 'z') || (s[j] >= '0' && s[j] <= '9')))
				{
					System.out.print(0);
					System.out.print("\n");
					break;
				}
			}
			if (j == len)
			{
				System.out.print(1);
				System.out.print("\n");
			}
		}
		return 0;
	}
}

