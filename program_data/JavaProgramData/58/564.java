import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int flag = 0;
		int j;
		String a = new String(new char[81]);
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		for (i = 1;i <= n;i++)
		{
			flag = 0;
			a = new Scanner(System.in).nextLine();
			for (j = 1;a.charAt(j) != '\0';j++)
			{
				if ((a.charAt(j) < '0' || (a.charAt(j)>'9' && a.charAt(j) < 'A') || (a.charAt(j)>'Z' && a.charAt(j) < 'a') || (a.charAt(j)>'z')) && a.charAt(j) != '_')
				{
				flag = 1;
				break;
				}
			}
			if (flag == 0)
			{
				if ((a.charAt(0) >= 'a' && a.charAt(0) <= 'z') || (a.charAt(0) >= 'A' && a.charAt(0) <= 'Z') || (a.charAt(0) == '_'))
				{
					System.out.print("1");
					System.out.print("\n");
				}
				else
				{
					System.out.print("0");
					System.out.print("\n");
				}
			}
			else
			{
				System.out.print("0");
				System.out.print("\n");
			}
		}
		return 0;
	}

}

