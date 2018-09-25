import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[] a = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		int i = 0;
		a = new Scanner(System.in).nextLine();
		for (i = 0;a[i] != 0;i++)
		{
		if (a[i] >= '0' && a[i] <= '9')
		{
								System.out.print(a[i]);
								if (a[i + 1] < '0' || a[i + 1]>'9')
								{
									System.out.print("\n");
								}
		}
		}
		System.in.read();
		System.in.read();
		return 0;
	}

}
