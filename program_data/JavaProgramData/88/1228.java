import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int len;
		int i;
		String c = new String(new char[31]);
		c = new Scanner(System.in).nextLine();
		len = c.length();

		for (i = 0;i < len;i++)
		{
			if (c.charAt(i) >= '0' && c.charAt(i) <= '9' && c.charAt(i + 1) >= '0' && c.charAt(i + 1) <= '9')
			{
				System.out.print(c.charAt(i));
			}
			if (c.charAt(i) >= '0' && c.charAt(i) <= '9' && (c.charAt(i + 1) < '0' || c.charAt(i + 1)>'9' || i == len - 1))
			{
				System.out.print(c.charAt(i));
				System.out.print("\n");
			}
		}
		return 0;
	}
}
