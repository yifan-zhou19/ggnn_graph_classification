import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		final String str = "";
		str = new Scanner(System.in).nextLine();
		int i;
		int j;
		int k;
		int n = 0;
		for (n = 0;str.charAt(n) != '\0';n++)
		{
			;
		}

		for (i = 1;i < n;i++)
		{
		for (j = 0;j < n - i;j++)
		{
			for (k = i;k > 0;k--)
			{
				if (str.charAt(j + i - k) != str.charAt(j + k))
				{
				break;
				}
			}
			if (k == 0)
			{
				for (k = j;k <= j + i;k++)
				{
					System.out.print(str.charAt(k));
				}
				System.out.print("\n");
			}
		}
		}
		return 0;
	}

}
