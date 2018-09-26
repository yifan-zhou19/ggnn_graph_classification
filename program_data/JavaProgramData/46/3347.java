package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int[][] a = new int[1000][1000];
		int i;
		int j;
		int s;
		int q = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < m;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		int flag = 0;
		for (i = 0;;i++)
		{
			for (j = q;j < m - q;j++)
			{
				flag++;
				System.out.print("\n");
				System.out.print(a[i][j]);
			}
			if (flag == n * m)
			{
				break;
			}
			j--;
			for (s = i + 1;s < n - q;s++)
			{
				flag++;
				System.out.print("\n");
				System.out.print(a[s][j]);
			}
			if (flag == n * m)
			{
				break;
			}
			s--;
			for (j = j - 1;j >= q;j--)
			{
				flag++;
				System.out.print("\n");
				System.out.print(a[s][j]);
			}
			if (flag == n * m)
			{
				break;
			}
			j++;
			for (s = s - 1;s > q;s--)
			{
				flag++;
				System.out.print("\n");
				System.out.print(a[s][j]);
			}
			if (flag == n * m)
			{
				break;
			}
			q++;
		}
		return 0;
	}

}

