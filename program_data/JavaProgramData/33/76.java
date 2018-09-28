package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int[] len = new int[N];
		char[][] sz = new char[N][N];
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
			len[i] = String.valueOf(sz[i]).length();
		}
			for (i = 0;i < n;i++)
			{
				for (j = 0;j < len[i];j++)
				{
					if (sz[i][j] == 'A')
					{
						System.out.print("T");

					}
					else if (sz[i][j] == 'G')
					{
						System.out.print("C");

					}
					else if (sz[i][j] == 'C')
					{
						System.out.print("G");


					}
					else if (sz[i][j] == 'T')
					{
						System.out.print("A");

					}
				}
				System.out.print("\n");
			}

			return 0;
	}









}

