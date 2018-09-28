import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		char[] b = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		int m;
		int n;
		int i;
		int k = 0;
		a = new Scanner(System.in).nextLine();
		if (a.charAt(1) == '\0')
		{
			System.out.print(0);
			System.out.print("\n");
			System.out.print(a.charAt(0));
		}
		else
		{
			n = (a.charAt(0) - 48) * 10 + (a.charAt(1) - 48);
			if (n < 13)
			{
				k = 1;
			}
			b[0] = n / 13 + 48;
			m = n % 13;
			for (i = 2; a.charAt(i) != '\0'; i++)
			{
				n = m * 10 + (a.charAt(i) - 48);
				if (n >= 13)
				{
					b[i - 1] = n / 13 + 48;
					m = n % 13;
				}
				else
				{
					b[i - 1] = 48;
					m = n;
				}
			}
			if (b[1] != 0)
			{
				System.out.print(b + k);
				System.out.print("\n");
				System.out.print(m);
			}
			else
			{
				System.out.print(b[0]);
				System.out.print("\n");
				System.out.print(m);
			}
		}
		return 0;
	}
}
