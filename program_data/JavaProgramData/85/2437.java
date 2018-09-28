import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int flag = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		String a = new String(new char[30]);
		for (int i = 1;i <= n;i++)
		{
			a = new Scanner(System.in).nextLine();
			if (a.charAt(0) == '_' || (a.charAt(0) >= 'a' && a.charAt(0) <= 'z') || (a.charAt(0) >= 'A' && a.charAt(0) <= 'Z'))
			{
				for (int j = 1;a.charAt(j) != '\0';j++)
				{
					if (a.charAt(j) == '_' || (a.charAt(j) >= 'a' && a.charAt(j) <= 'z') || (a.charAt(j) >= 'A' && a.charAt(j) <= 'Z') || (a.charAt(j) >= '0' && a.charAt(j) <= '9'))
					{
						continue;
					}
					else
					{
						System.out.print("no");
						System.out.print("\n");
						flag++;
						break;
					}
				}
				if (flag == 0)
				{
					System.out.print("yes");
					System.out.print("\n");
				}
			}
			else
			{
				System.out.print("no");
				System.out.print("\n");
			}
			flag = 0;
		}
		return 0;
	}
}

