import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m = 1;
		int i;
		int j;
		int c;
		String a = new String(new char[100]);
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a = new Scanner(System.in).nextLine();
		while (m <= n)
		{
			j = 0;
			a = new Scanner(System.in).nextLine();
			c = a.length();
			if ((a.charAt(0) >= 'a' && a.charAt(0) <= 'z') || (a.charAt(0) == '_') || (a.charAt(0) >= 'A' && a.charAt(0) <= 'Z'))
			{
				if (c == 1)
				{
					System.out.print(1);
					System.out.print("\n");
				}
			for (i = 1;i < c;i++)
			{
			if ((a.charAt(i) >= 'a' && a.charAt(i) <= 'z') || (a.charAt(i) == '_') || (a.charAt(i) >= 'A' && a.charAt(i) <= 'Z') || (a.charAt(i) >= '0' && a.charAt(i) <= '9') || a.charAt(i) == '_')
			{
				j++;
			}

			else
			{
				System.out.print(0);
				System.out.print("\n");
				break;
			}
			if (j == (c - 1))
			{
				System.out.print(1);
				System.out.print("\n");
			}
			}
			}
			else
			{
				System.out.print(0);
				System.out.print("\n");
			}

			m++;
		}
		return 0;
	}
}

