import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		final int ma = 200;
		final int mx = 50;
		int i;
		int n;
		int k;
		int j;
		int[] len1 = new int[ma];
		int[] len2 = new int[ma];
		int[][] zs1 = new int[mx][ma];
		int[][] zs2 = new int[mx][ma];
		int[][] ans = new int[mx][ma];
		char[][] num1 = {0};
		char[][] num2 = {0};
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (k = 0;k < n;k++)
		{
			System.in.read();
			num1[k] = new Scanner(System.in).nextLine();
			num2[k] = new Scanner(System.in).nextLine();
			len1[k] = String.valueOf(num1[k]).length();
			len2[k] = String.valueOf(num2[k]).length();
		}
		for (k = 0;k < n;k++)
		{
			j = 0;
			for (i = len1[k] - 1;i >= 0;i--)
			{
				zs1[k][j++] = num1[k][i] - '0';
			}
			j = 0;
			for (i = len2[k] - 1;i >= 0;i--)
			{
				zs2[k][j++] = num2[k][i] - '0';
			}
			for (i = 0;i < len1[k];i++)
			{
				if (i < len2[k])
				{
					if (zs1[k][i] < zs2[k][i])
					{
						zs1[k][i] = zs1[k][i] + 10;
						zs1[k][i + 1] = zs1[k][i + 1] - 1;
						ans[k][i] = zs1[k][i] - zs2[k][i];
					}
					else
					{
						ans[k][i] = zs1[k][i] - zs2[k][i];
					}
				}
				else
				{
					ans[k][i] = zs1[k][i] - zs2[k][i];
				}
			}
		}
			for (k = 0;k < n;k++)
			{
				if (ans[k][len1[k]] == 0)
				{
					len1[k] = len1[k] - 1;
				}
				for (i = len1[k];i >= 0;i--)
				{
					System.out.print(ans[k][i]);
				}
				System.out.print("\n");
			}
			return 0;
	}
}

