import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static char[][] b = new char[10000][501];
	public static int Main()
	{
		String a = new String(new char[501]);
		int i;
		int j;
		int k;
		int l;
		int n;
		int m;
		int o = 0;
		a = new Scanner(System.in).nextLine();
		n = a.length();
		for (i = 0; i < n - 1; i++)
		{
			for (j = i + 1; j < n; j++)
			{
				int flag = 1;
				if (a.charAt(i) == a.charAt(j))
				{
					k = i;
					l = j;
					for (; k < l; k++, l--)
					{
						if (a.charAt(k) != a.charAt(l))
						{
							flag = 0;
							break;
						}
					}
					if (flag == 1)
					{
						for (m = i; m <= j; m++)
						{
							b[o][m - i] = a.charAt(m);
						}
						o++;
					}
				}
			}
		}
		for (i = 2; i <= 500; i++)
		{
			for (j = 0; j <= o; j++)
			{
				if (String.valueOf(b[j]).length() == i)
				{
					System.out.print(b[j]);
					System.out.print("\n");
				}
			}
		}
		return 0;
	}
}
