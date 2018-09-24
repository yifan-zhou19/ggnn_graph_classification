package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] h = new char[w][w];
		int n;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= n;i++)
		{
			h[i] = new Scanner(System.in).nextLine();
		}
		for (i = 1;i <= n;i++)
		{
			j = String.valueOf(h[i]).length();
			if (h[i][j - 2] == 'e' && h[i][j - 1] == 'r')
			{
				h[i][j - 2] = '\0';
			}
			if (h[i][j - 2] == 'l' && h[i][j - 1] == 'y')
			{
				h[i][j - 2] = '\0';
			}
			if (h[i][j - 3] == 'i' && h[i][j - 2] == 'n' && h[i][j - 1] == 'g')
			{
				h[i][j - 3] = '\0';
			}

		}
		for (i = 1;i <= n;i++)
		{
			System.out.println(h[i]);
		}
		return 0;
	}

}

