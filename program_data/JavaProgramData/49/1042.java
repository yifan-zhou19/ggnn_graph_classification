import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[501]);
		int len;
		int s = 0;
		a = new Scanner(System.in).nextLine();
		len = a.length();
		for (int i = 2;i < len;i++)
		{
			for (int j = 0;j <= len - i;j++)
			{
				for (int k = 0;k <= i / 2 - 1;k++)
				{
					if (a.charAt(j + k) == a.charAt(j + i - 1 - k))
					{
						s++;
					}

				}
			if (s == i / 2)
			{
					for (int m = j;m <= j + i - 1;m++)
					{
				System.out.print(a.charAt(m));
					}
				System.out.print("\n");

			}
			s = 0;
			}
		}
		return 0;
	}
}
