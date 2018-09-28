import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static char[][] info = new char[1000][1000];
	public static int Main()
	{
		int k = 0;
		while (true)
		{
			info[k] = new Scanner(System.in).nextLine();
			if (info[k++][0] == 'e')
			{
				break;
			}
		}
		k -= 2;
		for (;k >= 0;k--)
		{
			System.out.print(info[k]);
			System.out.print("\n");
		}
		return 0;
	}
}
