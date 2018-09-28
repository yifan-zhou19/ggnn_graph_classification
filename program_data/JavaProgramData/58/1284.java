import java.util.*;

package <missing>;

public class GlobalMembers
{
	/*???*/
	public static int Main()
	{
		String str = new String(new char[100]);
		int n;
		int flag;
		int i;
		int j;
		int len;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		for (i = 0;i < n;i++)
		{
			flag = 0;
			str = new Scanner(System.in).nextLine();
			len = str.length();
			if (str.charAt(0) == '_')
			{
				flag = 1;
			}
			else
			{
				if (str.charAt(0) <= 'Z' && str.charAt(0) >= 'A')
				{
					flag = 1;
				}
				else
				{
					if (str.charAt(0) <= 'z' && str.charAt(0) >= 'a')
					{
						flag = 1;
					}
				}
			}
			if (flag == 0)
			{
				System.out.print(flag);
				System.out.print("\n");
				continue;
			}
			for (j = 1;j < len;j++)
			{
				flag = 0;
				if (str.charAt(j) <= 'Z' && str.charAt(j) >= 'A' || str.charAt(j) <= 'z' && str.charAt(j) >= 'a' || str.charAt(j) <= '9' && str.charAt(j) >= '0' || str.charAt(j) == '_')
				{
					flag = 1;
				}
				if (flag == 0)
				{
					break;
				}
			}
			System.out.print(flag);
			System.out.print("\n");
		}
		return 0;
	}

}

