import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int n;
		String a = new String(new char[501]);
		a = new Scanner(System.in).nextLine();
		n = a.length();
		for (i = 2;i <= n;i++)
		{
			for (j = 0;j <= n - i;j++)
			{
				for (k = 0;k <= i / 2;k++)
				{
					if (a.charAt(j + k) != a.charAt(j + i - 1 - k))
					{
						break;
					}
				}
				if (k == i / 2 + 1)
				{
					for (k = j;k <= j + i - 1;k++)
					{
						System.out.print(a.charAt(k));
					}
					System.out.print("\n");
				}
			}
		}
		return 0;
	}
}
