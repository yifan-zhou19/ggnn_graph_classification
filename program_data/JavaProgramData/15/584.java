package <missing>;

public class GlobalMembers
{
	public static int[][] s = new int[1000][1000];
	public static int Main()
	{
	//printf("bbb\n");
		int a = 1;
		int b = 1;
		int j;
		int i;
		int n;
		int m;
		int first = 0;
		int c = 0;
		int d = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
	//printf("bbb%d\n",n);
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					s[i][j] = Integer.parseInt(tempVar2);
				}
			}
		}

		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (s[i][j] == 0)
				{
					a = i;
					b = j;
										first = 1;
										break;
				}
			}

			if (first == 1)
			{
				   break;
			}
		}
			for (j = b;j < n;j++)
			{
				c++;
				if (s[a][j] == 255)
				{
					break;
				}
			}

			for (i = a;i < n;i++)
			{
							 d++;
					   if (s[i][b] == 255)
					   {
					break;
					   }
			}

		m = (c - 3) * (d - 3);
		System.out.printf("%d",m);
		return 0;
	}


}

