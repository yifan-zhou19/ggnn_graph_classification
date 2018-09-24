import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int len;
		int i;
		int j;
		int flag;
		String a = new String(new char[81]);
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			if (i == 1)
			{
			System.in.read();
			}
			a = new Scanner(System.in).nextLine();
			for (len = 0;a.charAt(len) != '\0';len++)
			{
				;
			}
			if (a.charAt(0) == '_' || (a.charAt(0) >= 'a' && a.charAt(0) <= 'z') || (a.charAt(0) >= 'A' && a.charAt(0) <= 'Z'))
			{
				flag = 1;
			}
			else
			{
				flag = 0;
			}
			for (j = 1;j <= len - 1;j++)
			{
				if (!((a.charAt(j) >= 'a' && a.charAt(j) <= 'z') || (a.charAt(j) >= 'A' && a.charAt(j) <= 'Z') || (a.charAt(j) >= '0' && a.charAt(j) <= '9') || a.charAt(j) == '_'))
				{
					flag = 0;
				}
				if (a.charAt(j) == ' ')
				{
					flag = 0;
				}
			}
			System.out.print(flag);
			System.out.print("\n");
		}
		return 0;
	}

}

