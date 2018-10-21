import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int len;
		int[] flag = new int[1000];
		int i;
		int j;
		int k;
		int a;
		for (a = 0; a < 1000; a++)
		{
			flag[a] = 1;
		}
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		String str = new String(new char[81]);
		for (i = 1; i <= n; i++)
		{
			str = new Scanner(System.in).nextLine();
			len = str.length();
			for (j = 0; j < len; j++)
			{
				if (str.charAt(0) == '_' || (str.charAt(0) - 'a' < 26 && str.charAt(0) - 'a' >= 0) || (str.charAt(0) - 'A' < 26 && str.charAt(0) - 'A' >= 0))
				{
					if (str.charAt(j) == '_' || (str.charAt(j) - 'a' < 26 && str.charAt(j) - 'a' >= 0) || (str.charAt(j) - 'A' < 26 && str.charAt(j) - 'A' >= 0) || (str.charAt(j) - '0' <= 9 && str.charAt(j) - '0' >= 0))
					{
					}
					else
					{
						flag[i] = 0;
						break;
					}
				}
				else
				{
					flag[i] = 0;
					break;
				}
			}
		}
		for (i = 1; i <= n; i++)
		{
			System.out.print(flag[i]);
			System.out.print("\n");
		}
		return 0;
	}
}

