import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int max(int a, int b)
	{
		if (a < b)
		{
			return b;
		}
		else
		{
			return a;
		}
	}
	public static int Main()
	{
		String a = new String(new char[500]);
		char[][] b = new char[250][500];
		char p;
		int n;
		int m;
		int i;
		int j;
		int k;
		int[] l = new int[250];
		int s;
		int t = 0;
		a = new Scanner(System.in).nextLine();
		n = a.length();
		for (i = 0;i < n - 1;i++)
		{
			for (j = 0;i >= j != 0 && a.charAt(i - j) == a.charAt(i + 1 + j);j++)
			{
				for (k = i - j;k <= i + j + 1;k++)
				{
					b[t][k - i + j] = a.charAt(k);
				}
				l[t] = 2 * (j + 1);
				t++;
			}
		}
		for (i = 0;i < n - 2;i++)
		{
			for (j = 0;i >= j != 0 && a.charAt(i - j) == a.charAt(i + 2 + j);j++)
			{
				for (k = i - j;k <= i + j + 2;k++)
				{
					b[t][k - i + j] = a.charAt(k);
				}
				l[t] = 2 * (j + 1) + 1;
				t++;
			}
		}
		m = t;
		for (i = 0;i < m - 1;i++)
		{
			for (j = 0;j < m - 1;j++)
			{
				if (l[j] > l[j + 1])
				{
					for (k = 0;k < max(l[j], l[j + 1]);k++)
					{
						p = b[j][k];
						b[j][k] = b[j + 1][k];
						b[j + 1][k] = p;
					}
					s = l[j];
					l[j] = l[j + 1];
					l[j + 1] = s;
				}
			}
		}
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < l[i];j++)
			{
				System.out.print(b[i][j]);
			}
			System.out.print("\n");
		}
		return 0;
	}
}
