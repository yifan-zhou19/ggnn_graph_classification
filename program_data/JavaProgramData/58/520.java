import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int n1;
		String str = new String(new char[200]);
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		for (i = 1; i <= n; i++)
		{
			j = 1;
			str = new Scanner(System.in).nextLine();
			if (!((str.charAt(0) == '_') || ((str.charAt(0) >= 'a') && (str.charAt(0) <= 'z')) || ((str.charAt(0) >= 'A') && (str.charAt(0) <= 'Z'))))
			{
				System.out.print(0);
				System.out.print("\n");
				continue;
			}
			for (j = 1; str.charAt(j) != 0; j++)
			{
				if (((str.charAt(j) >= 'a') && (str.charAt(j) <= 'z')) || ((str.charAt(j) >= '0') && (str.charAt(j) <= '9')) || (str.charAt(j) == '_') || ((str.charAt(j) >= 'A') && (str.charAt(j) <= 'Z')))
				{
					continue;
				}
				else
				{
					break;
				}
			}
			if (str.charAt(j) == 0)
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

