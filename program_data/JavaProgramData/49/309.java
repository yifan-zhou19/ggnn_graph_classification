import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[501]);
		int k;
		a = new Scanner(System.in).nextLine();
		for (int i = 1;i <= a.length();i++)
		{
			for (int j = 0;j <= (a.length() - i);j++)
			{
				for (k = 0;k <= i / 2;k++)
				{
					if (a.charAt(j + k) != a.charAt(j + i - k))
					{
						break;
					}
				}
				if (k == (i / 2 + 1))
				{
					for (int l = j;l <= j + i;l++)
					{
						System.out.print(a.charAt(l));
					}
					System.out.print("\n");
				}
			}
		}
		return 0;
	}

}
