import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[81]);
		int n;
		int i;
		int j;
		int lon;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		for (i = 1; i <= n; i++)
		{

			a = new Scanner(System.in).nextLine();
			lon = a.length();
			for (j = 0; j < lon; j++)
			{
				if (j == 0)
				{
					if (a.charAt(j) != '_' && (a.charAt(j) < 'a' || a.charAt(j) > 'z') && (a.charAt(j) < 'A' || a.charAt(j) > 'Z'))
					{
						break;
					}
				}
				else
				{
					if (a.charAt(j) != '_' && (a.charAt(j) < 'a' || a.charAt(j) > 'z') && (a.charAt(j) < 'A' || a.charAt(j) > 'Z') && (a.charAt(j) < '0' || a.charAt(j) > '9'))
					{
						break;
					}
				}
			}
			if (j == lon)
			{
				System.out.print('1');
				System.out.print("\n");
			}
			else
			{
				System.out.print('0');
				System.out.print("\n");
			}
		}
		return 0;
	}

}

