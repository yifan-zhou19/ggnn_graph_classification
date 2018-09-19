package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] tu = new int[100][100];
		int i;
		int n;
		int k;
		int count = 0;
		int m = 0;
		int first = 0;
		int l = 0;
		int h = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			for (k = 0;k < n;k++)
			{
				tu[i][k] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				if (tu[i][k] == 0 && first == 0)
				{
					l++;
				}
			}
			if (l > 0)
			{
				first = 1;
			}
		}
		for (i = 0;i < n;i++)
		{
			for (k = 0;k < n;k++)
			{
				if (tu[i][k] == 0)
				{
					count++;
				}
			}
		}
		h = (count - 2 * l) / 2;
		m = (l - 2) * h;
		System.out.print(m);
		System.out.print("\n");
		return 0;
	}
}

