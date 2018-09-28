package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		int b;
		int c;
		int d;
		int e;
		int f;
		int i;
		int j;
		char[][] sz = new char[1000][500];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sz[i] = tempVar2.charAt(0);
			}
			for (j = 0;j < String.valueOf(sz[i]).length();j++)
			{
				if (sz[i][j] == 'A')
				{
					System.out.print("T");
				}
				else if (sz[i][j] == 'G')
				{
					System.out.print("C");
				}
				else if (sz[i][j] == 'T')
				{
					System.out.print("A");
				}
				else if (sz[i][j] == 'C')
				{
					System.out.print("G");
				}
			}
			System.out.print("\n");
		}

		return 0;
	}

}

