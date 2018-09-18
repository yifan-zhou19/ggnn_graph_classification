import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String sen = new String(new char[101]);
		int[] g = new int[100];
		int[] left = new int[100];
		int m;
		int n;
		int i;
		int k;
		int sum;
		while (sen = new Scanner(System.in).nextLine())
		{
			n = sen.length();
			k = 0;
			sum = 0;
			for (i = 0; i < n; i++)
			{
				if (sen.charAt(i) == '(')
				{
					g[i] = 1;
					sum++;
					left[k] = i;
					k++;
				}
				else
				{
					if (sen.charAt(i) == ')')
					{
						if (sum > 0)
						{
							sum--;
							k--;
							g[left[k]] = 0;
							g[i] = 0;
						}
						else
						{
							g[i] = -1;
						}
					}
					else
					{
						g[i] = 0;
					}
				}

			}
			for (i = n - 1; g[i] == 0; i--)
			{
			}
			n = i;
			for (i = 0; g[i] == 0; i++)
			{
			}
			m = i;
			System.out.print(sen);
			System.out.print("\n");
			for (i = m; i <= n; i++)
			{
				if (g[i] == 1)
				{
					System.out.print('$');
				}
				else
				{
					if (g[i] == -1)
					{
						System.out.print('?');
					}
					else
					{
						System.out.print(' ');
					}
				}
			}
			System.out.print("\n");
		}
		return 0;
	}

}
