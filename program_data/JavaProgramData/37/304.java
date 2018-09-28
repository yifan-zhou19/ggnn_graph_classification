package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int n;
		int x;
		char[][] c = new char[100][10000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		System.in.read();
		for (i = 0;i < n;i++)
		{
			c[i] = new Scanner(System.in).nextLine();
			for (j = 0;c[i][j] != '\0';j++)
			{
				x = 0;
				for (k = 0;c[i][k] != '\0';k++)
				{
				if (c[i][j] == c[i][k])
				{
					x++;
				}
				}

			if (x == 1)
			{
				System.out.printf("%c\n",c[i][j]);
				break;
			}
			}
			if (x > 1)
			{
				System.out.print("no\n");
			}
		}
	}
}

