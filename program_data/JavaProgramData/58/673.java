import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		String a = new String(new char[90]);
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		for (i = 0;i < n;i++)
		{
			j = 0;
			a = new Scanner(System.in).nextLine();
			if (a.charAt(0) == '_' || (a.charAt(0) - 'A' >= 0 && a.charAt(0) - 'Z' <= 0) || (a.charAt(0) - 'a' >= 0 && a.charAt(0) - 'z' <= 0))
			{
				if (a.length() == 1)
				{
					System.out.print(1);
					System.out.print("\n");
				}
				else
				{
					for (j = 1;j < a.length();j++)
					{
					if (a.charAt(j) == '_' || (a.charAt(j) - 'A' >= 0 && a.charAt(j) - 'Z' <= 0) || (a.charAt(j) - 'a' >= 0 && a.charAt(j) - 'z' <= 0) || (a.charAt(j) - '0' >= 0 && a.charAt(j) - '9' <= 0))
					{
						continue;
					}
					else
					{
						break;
					}
					}
				}
			}
					if (j == a.length() && a.length() != 1)
					{
						System.out.print(1);
						System.out.print("\n");
					}
					if (j != a.length() && a.length() != 1)
					{
						System.out.print(0);
						System.out.print("\n");
					}
		}
		return 0;
	}
}

