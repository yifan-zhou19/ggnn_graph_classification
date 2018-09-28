package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		char[][] a = new char[1000][256];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = tempVar2.charAt(0);
			}
			for (int j = 0;a[i][j] != '\0';j++)
			{
				if (a[i][j] == 'A')
				{
					System.out.print("T");
				}
				if (a[i][j] == 'T')
				{
					System.out.print("A");
				}
				if (a[i][j] == 'G')
				{
					System.out.print("C");
				}
				if (a[i][j] == 'C')
				{
					System.out.print("G");
				}
			}
			System.out.print("\n");
		}
		return 0;
	}
}

