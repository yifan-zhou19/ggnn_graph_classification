import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int l;
		int p;
		int k;
		String ch = new String(new char[100]);
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		for (k = 1;k <= n;k++)
		{
			p = 1;
			ch = new Scanner(System.in).nextLine();
			l = ch.length();
			if (ch.charAt(0) == '_' || ch.charAt(0) >= 'a' && ch.charAt(0) <= 'z' || ch.charAt(0) >= 'A' && ch.charAt(0) <= 'Z')
			{
				for (i = 1;i <= l - 1;i++)
				{
					if (ch.charAt(i) < '0' || ch.charAt(i)>'9' && ch.charAt(i) < 'A' || ch.charAt(i)>'Z' && ch.charAt(i) < 'a' && ch.charAt(i) != '_' || ch.charAt(i)>'z')
					{
						p = 0;
					}
				}
			}
			else
			{
				p = 0;
			}
			System.out.print(p);
			System.out.print("\n");
		}

		return 0;
	}



}

