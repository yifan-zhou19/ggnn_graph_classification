import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		for (i = 1; i <= n; i++)
		{
			String str = new String(new char[81]);
			int j;
			int len;
			str = new Scanner(System.in).nextLine();
			len = str.length();
			if (str.charAt(0) == '_' || (str.charAt(0) >= 'a' && str.charAt(0) <= 'z') || (str.charAt(0) >= 'A' && str.charAt(0) <= 'Z'))
			{
				for (j = 1; j < len; j++)
				{
					if ((str.charAt(j) == '_') || (str.charAt(j) >= 'a' && str.charAt(j) <= 'z') || (str.charAt(j) >= 'A' && str.charAt(j) <= 'Z') || (str.charAt(j) >= '0' && str.charAt(j) <= '9'))
					{
						continue;
					}
					else
					{
						break;
					}
				}
				if (j == len)
				{
					System.out.print(1);
					System.out.print("\n");
				}
				else
				{
					System.out.print(0);
					System.out.print("\n");
				}

			}
			else
			{
				System.out.print(0);
				System.out.print("\n");
			}
		}

		return 0;
	}

}

