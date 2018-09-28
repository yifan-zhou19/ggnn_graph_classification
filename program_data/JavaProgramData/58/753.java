import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int l;
		int s;
		int j;
		int k = 1;
		int p = 1;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		String c = new String(new char[90]);
		for (i = 0;i < n;i++)
		{
			k = 1;
			p = 1;
			c = new Scanner(System.in).nextLine();
			l = c.length();
			s = c.charAt(0);
			if (!((s >= 97 && s <= 122) || (s <= 90 && s >= 65) || c.charAt(0) == '_'))
			{
				System.out.print("0");
				System.out.print("\n");
			}
			else
			{
				for (j = 1;j < l;j++)
				{
					if (!((c.charAt(j) >= '0' && c.charAt(j) <= '9') || (c.charAt(j) >= 'a' && c.charAt(j) <= 'z') || (c.charAt(j) >= 'A' && c.charAt(j) <= 'Z') || c.charAt(j) == '_'))
					{
						System.out.print("0");
						System.out.print("\n");
						p = 0;
						break;
					}
				}
				if (p == 1)
				{
					System.out.print("1");
					System.out.print("\n");
				}
			}
		}
				return 0;
	}

}

