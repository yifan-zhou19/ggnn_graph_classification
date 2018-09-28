import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int k;
		int len;
		int f;

		String c = new String(new char[99]);

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();

		for (i = 1 ; i <= n ; i++)
		{
			c = new Scanner(System.in).nextLine();

			len = c.length();

			f = 0;

			if ((c.charAt(0) < 'A' || (c.charAt(0) > 'Z' && c.charAt(0) < 'a') || c.charAt(0) > 'z') && c.charAt(0) != '_')
			{
				System.out.print(0);
				System.out.print("\n");
				continue;
			}

			f = 1;

			for (k = 1 ; k < len ; k++)
			{
				if ((c.charAt(k) >= 'A' && c.charAt(k) <= 'Z') || (c.charAt(k) >= 'a' && c.charAt(k) <= 'z') || c.charAt(k) == '_' || (c.charAt(k) >= '0' && c.charAt(k) <= '9'))
				{
					f++;
				}
				else
				{
					f = 0;
				}
			}

			if (f == len)
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

		return 0;
	}







}

