package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		char[][] u = new char[1000][260];
		char[][] v = new char[1000][260];
		String c = new String(new char[1000]);
		int[] w = new int[1000];
		c = new Scanner(System.in).nextLine();
		for (int i = 0;i <= n - 1;i++)
		{
			u[i] = new Scanner(System.in).nextLine();
			w[i] = String.valueOf(u[i]).length();
		}
		for (int i = 0;i <= n - 1;i++)
		{
			for (int j = 0;j <= w[i] - 1;j++)
			{
				if (u[i][j] == 'A')
				{
					v[i][j] = 'T';
				}
					if (u[i][j] == 'T')
					{
					v[i][j] = 'A';
					}
					if (u[i][j] == 'C')
					{
					v[i][j] = 'G';
					}
					if (u[i][j] == 'G')
					{
					v[i][j] = 'C';
					}
			}
					System.out.printf("%s\n",v[i]);
		}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
				return 0;
	}
}

