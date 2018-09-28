package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] zfc = new char[1000][256];
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
			zfc[i] = new Scanner(System.in).nextLine();
			j = 0;
			while (zfc[i][j] != '\0')
			{
				if (zfc[i][j] == 'A')
				{
					System.out.print("T");
				}
				if (zfc[i][j] == 'T')
				{
					System.out.print("A");
				}
				if (zfc[i][j] == 'C')
				{
					System.out.print("G");
				}
				if (zfc[i][j] == 'G')
				{
					System.out.print("C");
				}
				j = j + 1;
			}
			System.out.print("\n");
		}
		return 0;
	}
}

