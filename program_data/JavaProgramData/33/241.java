package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] zfc = new char[N][N];
		int n;
		int[] cd = new int[N];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				zfc[i] = tempVar2.charAt(0);
			}
			cd[i] = String.valueOf(zfc[i]).length();
		}
		int j;
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < cd[i];j++)
			{
			switch (zfc[i][j])
			{
					case'A':
						System.out.printf("%c",'T');
						break;
					case'T':
						System.out.printf("%c",'A');
						break;
					case'C':
						 System.out.printf("%c",'G');
						break;
					case'G':
						System.out.printf("%c",'C');
						break;
			}
				if (j == cd[i] - 1)
				{
					System.out.print("\n");
					break;
				}
			}
		}
		return 0;
	}

}

