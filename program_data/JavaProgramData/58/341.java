import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] flag = new int[100];
		int j;
		int len;
		String c = new String(new char[81]);
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		for (i = 0 ; i < n ; i++)
		{
			c = new Scanner(System.in).nextLine();
			len = c.length();
			if (c.charAt(0) == '_' || (c.charAt(0) >= 'A' && c.charAt(0) <= 'Z') || (c.charAt(0) >= 'a' && c.charAt(0) <= 'z'))
			{
				for (j = 1 ; j < len ; j++)
				{
					if (c.charAt(j) != '_' && (c.charAt(j) < 'A' || (c.charAt(j) > 'Z' && c.charAt(j) < 'a') || c.charAt(j) > 'z') && (c.charAt(j) < '0' || c.charAt(j) > '9'))
					{
						flag[i] = 0;
						break;
					}
				}
				if (j == len)
				{
					flag[i] = 1;
				}
			}
			else
			{
				flag[i] = 0;
			}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(c, 0, (Character.SIZE / Byte.SIZE));
		}
		for (i = 0 ; i < n ; i++)
		{
			System.out.print(flag[i]);
			System.out.print("\n");
		}
		return 0;
	}

}

