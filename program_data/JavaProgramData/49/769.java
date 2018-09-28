import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String c = new String(new char[500]);
		int i;
		int j;
		int k;
		int len;
		int flag;
		c = new Scanner(System.in).nextLine();
		len = c.length();
		for (i = 2; i <= len; i++)
		{
			for (j = 0; j <= len - i; j++)
			{
				flag = 1;
				for (k = 0; k < (i + 1) / 2; k++)
				{
					if (c.charAt(j + k) != c.charAt(j + i - 1 - k))
					{
						flag = 0;
						break;
					}
				}
				if (flag != 0)
				{
					for (k = 0; k < i; k++)
					{
						System.out.print(c.charAt(j + k));
					}
					System.out.print("\n");
				}
			}
		}
		return 0;
	}
}
