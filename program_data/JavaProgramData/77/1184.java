import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[110]);
		int[] t = new int[110];
		int i = 0;
		int j = 0;
		int[] b = new int[60];
		int[] g = new int[60];
		int n = 0;
		int d = 1;
		int k = 0;
		for (i = 0;i < 110;i++)
		{
			t[i] = 0;
		}
		a = new Scanner(System.in).nextLine();
		for (i = 0;a.charAt(i) != '\0';)
		{
			i++;
		}
		n = i;
		for (d = 1;d <= n - 1;d = d + 2)
		{
			for (i = 0;i < n - d;i++)
			{
			if (a.charAt(i) != a.charAt(0) || t[i] == 1 || t[i + d] == 1)
			{
				continue;
			}
		else
		{
		if (a.charAt(i) != a.charAt(i + d))
		{
			b[k] = i;
			g[k] = i + d;
			t[i] = 1;
			t[i + d] = 1;
			k++;
		}
		}
			}
		}
		for (i = 0;i < k - 1;i++)
		{
			for (j = 0;j < k - 1 - i;j++)
			{
				int tem;
				if (g[j] > g[j + 1])
				{
				tem = g[j];
				g[j] = g[j + 1];
				g[j + 1] = tem;
				tem = b[j];
				b[j] = b[j + 1];
				b[j + 1] = tem;
				}
			}
		}
		for (i = 0;i < k;i++)
		{
			System.out.print(b[i]);
			System.out.print(" ");
			System.out.print(g[i]);
			System.out.print("\n");
		}
		return 0;
	}
}
