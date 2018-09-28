package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		char[][] c = new char[100][10000];
		int[] d = new int[100];
		int[][] e = new int[100][1000];
		int b = 0;
		System.in.read();
		for (int i = 0;i <= a - 1;i++)
		{
				c[i] = new Scanner(System.in).nextLine();
				d[i] = String.valueOf(c[i]).length();
				for (int j = 0;j <= d[i] - 1;j++)
				{
						e[i][j] = 0;
						for (int k = 0;k <= d[i] - 1;k++)
						{
									   if (c[i][j] == c[i][k])
									   {
															e[i][j]++;
									   }
						}
						if (e[i][j] == 1)
						{
									   b++;
									   System.out.printf("%c\n",c[i][j]);
									   break;
						}

				}
						if (b == 0)
						{
				 System.out.print("no\n");
						}
				 b = 0;
		}


		int y;
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			y = Integer.parseInt(tempVar2);
		}
		return 0;
	}

}

