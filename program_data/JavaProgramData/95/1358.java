import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		for (int i = 0 ; ;i++)
		{
			if (a.charAt(i) != '\0')
			{
				int m = (int)a.charAt(i);
				int n = (int)b.charAt(i);
				if (m >= 97)
				{
					m -= 32;
				}
				if (n >= 97)
				{
					n -= 32;
				}
				if (m == n)
				{
				continue;
				}
				else
				{
					if (m > n)
					{
						System.out.print(">");
						return 0;
					}
					else
					{
						System.out.print("<");
						return 0;
					}
				}
			}
			else
			{
				break;
			}

		}
		System.out.print("=");
		return 0;
	}
}
