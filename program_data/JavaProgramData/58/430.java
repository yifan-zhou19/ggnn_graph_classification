import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int j;
		int k;
		int l;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		int i = 0;
		for (i = 0;i < n;i++)
		{
			k = 0;
			String a = new String(new char[100]);
			a = new Scanner(System.in).nextLine();
			l = a.length();
			if (!((a.charAt(0) == '_') || (a.charAt(0) <= 'z' && a.charAt(0) >= 'a') || (a.charAt(0) <= 'Z' && a.charAt(0) >= 'A')))
			{
				System.out.print(0);
				System.out.print("\n");
				continue;
			}
			if (l == 1 && ((a.charAt(0) <= 'z' && a.charAt(0) >= 'a') || (a.charAt(0) <= 'Z' && a.charAt(0) >= 'A') || a.charAt(0) == '_'))
			{
				System.out.print(1);
				System.out.print("\n");
				continue;
			}
			for (j = 1;j < l;j++)
			{
				if (!((a.charAt(j) == '_') || (a.charAt(j) <= 'z' && a.charAt(j) >= 'a') || (a.charAt(j) <= 'Z' && a.charAt(j) >= 'A') || (a.charAt(j) >= '0' && a.charAt(j) <= '9')))
				{
					System.out.print(0);
					System.out.print("\n");
					break;
				}
				else
				{
					k++;
				}
			}
			if (k == l - 1)
			{
				System.out.print(1);
				System.out.print("\n");
			}
		}
	}
}

