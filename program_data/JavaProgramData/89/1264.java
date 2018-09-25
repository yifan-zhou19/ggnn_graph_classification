package <missing>;

public class GlobalMembers
{
	public static int[][] a = new int[10010][10010];
	public static int Main()
	{
		int n;
		int i;
		int j;
		int flag = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		i = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		j = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (i > 0 || j > 0)
		{
			a[i][j] = 1;
			i = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			j = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (int i = 0;i < n;i++)
		{
			double s = 0;
			double t = 0;
			for (int j = 0;j < n;j++)
			{
				s += a[i][j];
				t += a[j][i];
			}
			if (s == 0 && t == n - 1)
			{
				System.out.print(i);
				System.out.print("\n");
				flag = 1;
				break;
			}
		}
		if (flag == 0)
		{
			System.out.print("NO FOUND");
			System.out.print("\n");
		}
		return 0;
	}
}

