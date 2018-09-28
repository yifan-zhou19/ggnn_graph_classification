package <missing>;

public class GlobalMembers
{
	public static int[][] a = new int[9001][9001];
	public static int Main()
	{
		int n;
		int p;
		int q;
		int flag = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (p = 0;p < n;p++)
		{
			a[p][p] = 1;
		}
		while ((p = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0 && (q = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			if (p != 0 || q != 0)
			{
				a[p][q] = 1;
			}
			else
			{
				break;
			}
		}
		for (p = 0;p < n;p++)
		{
			int count = 0;
			for (q = 0;q < n;q++)
			{
				if ((p == q) || (p != q && a[q][p] == 1 && a[p][q] == 0))
				{
					count++;
				}
			}
			if (count == n)
			{
				System.out.print(p);
				System.out.print("\n");
				flag = 1;
			}
		}
		if (flag == 0)
		{
			System.out.print("NOT FOUND");
			System.out.print("\n");
		}
		return 0;
	}


}

