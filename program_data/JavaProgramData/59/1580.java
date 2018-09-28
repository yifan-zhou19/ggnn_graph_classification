import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int j;
		int k;
		int l;
		int i;
		k = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		char[][] aa = new char[n + 1][n + 1];
		for (i = 0;i < n + 1;i++)
		{
			aa[i] = new Scanner(System.in).nextLine();
		}
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (l = 0;l < m - 1;l++)
		{
				for (i = 1;i < n + 1;i++)
				{
					for (j = 0;j < n;j++)
					{
					if (aa[i][j] == '@')
					{
						if (l == 0)
						{
							k = k + 1;
						}
						if ((j > 0) && (aa[i][j - 1] == '.'))
						{
							aa[i][j - 1] = '!';
						}
						if ((j < n - 1) && (aa[i][j + 1] == '.'))
						{
							aa[i][j + 1] = '!';
						}
						if ((i > 0) && (aa[i - 1][j] == '.'))
						{
							aa[i - 1][j] = '!';
						}
						if ((i < n) && (aa[i + 1][j] == '.'))
						{
							aa[i + 1][j] = '!';
						}
					}
					}
				}
		   for (i = 1;i < n + 1;i++)
		   {
			 for (j = 0;j < n;j++)
			 {
				if (aa[i][j] == '!')
				{
					aa[i][j] = '@';
					k = k + 1;
				}
			 }
		   }
		}
		System.out.print(k);
		return 0;
	}

}

