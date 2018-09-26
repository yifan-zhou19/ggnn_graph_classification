package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int result = 1;
		int n;
		int i;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[][] m = new int[10000][2]; //m[i][0]??m??????m[i][1]????m???
		int a;
		int b;
		for (i = 0;i < 10000;i++)
		{
			m[i][0] = m[i][1] = 0;
		}
		while ((a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0 && (b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			if (a == 0 && b == 0)
			{
				break;
			}
			m[a][0]++;
			m[b][1]++;
		}
		for (i = 0;i < n;i++)
		{
			if (m[i][0] == 0 && m[i][1] == n - 1)
			{
				result = 0;
				System.out.print(i);
				System.out.print("\n");
			}
		}
		if (result != 0)
		{
			System.out.print("NOT FOUND");
			System.out.print("\n");
		}
		return 0;
	}


}

