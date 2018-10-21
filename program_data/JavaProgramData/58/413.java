import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[81]);
		int n;
		int i;
		int len;
		int judge;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		while (n-- != 0)
		{
			a = new Scanner(System.in).nextLine();
			len = a.length();
			if (a.charAt(0) == '_' || (a.charAt(0) >= 'a' && a.charAt(0) <= 'z') || (a.charAt(0) >= 'A' && a.charAt(0) <= 'Z'))
			{
				judge = 1;
				for (i = 1;i <= len - 1;i++)
				{
					if (a.charAt(i) == '_' || (a.charAt(i) >= 'a' && a.charAt(i) <= 'z') || (a.charAt(i) >= 'A' && a.charAt(i) <= 'Z') || (a.charAt(i) <= '9' && a.charAt(i) >= '0'))
					{
						judge = 1;
					}
					else
					{
						judge = 0;
						break;
					}
				}
			}
			else
			{
				judge = 0;
			}
			System.out.print(judge);
			System.out.print("\n");
		}
		return 0;
	}
}

