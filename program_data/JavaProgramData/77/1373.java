import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static char[] a = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
	public static int[][] x = new int[110][2];
	public static int i;
	public static int j;
	public static int l;
	public static int k = 0;
	public static int f()
	{
		for (i = 0;i < l - 1;i++)
		{
				for (j = 1;i + j < l;j++)
				{
					if (a[i] == a[0] && a[i + j] == ' ')
					{
						continue;
					}
					if (a[i] == a[0] && a[i + j] == a[0])
					{
						break;
					}
					if (a[i] == a[0] && a[i + j] == a[l - 1])
					{
						x[k][0] = i;
						x[k][1] = i + j;
						k++;
						a[i + j] = ' ';
						a[i] = ' ';
					}
				}
		}
		if (k != l / 2)
		{
			f();
		}
		if (k == l / 2)
		{
			return 0;
		}
	}
	public static int Main()
	{
		a = new Scanner(System.in).nextLine();
		l = a.length();
		f();
		for (i = 0;i < l / 2 - 1;i++)
		{
			for (j = 0;j < l / 2 - 1 - i;j++)
			{
				if (x[j][1] > x[j + 1][1])
				{
					k = x[j][1];
					x[j][1] = x[j + 1][1];
					x[j + 1][1] = k;
					k = x[j][0];
					x[j][0] = x[j + 1][0];
					x[j + 1][0] = k;
				}
			}
		}
		for (i = 0;i < l / 2;i++)
		{
			System.out.print(x[i][0]);
			System.out.print(" ");
			System.out.print(x[i][1]);
			System.out.print("\n");
		}
		return 0;
	}
}
