import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[501]);
		int i;
		int j;
		int t;
		s = new Scanner(System.in).nextLine();
		int l = s.length();
		for (i = 2;i <= l ;i++)
		{
			for (j = 0;j <= l - i;j++)
			{
				for (t = j;t <= j + i / 2 - 1 ;t++)
				{
					if (s.charAt(t) != s.charAt(2 * j + i - 1 - t))
					{
						break;
					}
				}
				if (t == j + i / 2)
				{
					for (int k = j;k <= j + i - 1;k++)
					{
						System.out.print(s.charAt(k));
					}
					System.out.print("\n");
				}
			}
		}

		return 0;
	}

}
