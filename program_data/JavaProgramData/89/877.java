package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[][] a = new int[10000][2];
		int i;
		int[] k = new int[2];
		int tf = 1;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (true)
		{
			k[0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			k[1] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if ((k[0] == 0) && (k[1] == 0))
			{
				break;
			}
			a[k[0]][0]++;
			a[k[1]][1]++;
		}
		for (i = 0;i < n;i++)
		{
			if ((*(*(a + i)) == 0) && (*(*(a + i) + 1) == n - 1))
			{
				System.out.print(i);
				System.out.print("\n");
				tf = 0;
			}
		}
		if (tf == 1)
		{
			System.out.print("NOT FOUND");
			System.out.print("\n");
		}
		return 0;
	}
}

