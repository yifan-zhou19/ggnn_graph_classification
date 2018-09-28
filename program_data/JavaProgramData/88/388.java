import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		char[] c = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		c = new Scanner(System.in).nextLine();
		for (i = 0;i < 31;i++)
		{
			if (c[i] >= '0' && c[i] <= '9')
			{
				System.out.print(c[i]);
			}
		else if (c[i - 1] >= '0' && c[i - 1] <= '9')
		{
			System.out.print("\n");
		}
		}
		return 0;
	}
}
