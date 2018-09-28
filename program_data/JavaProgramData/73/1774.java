package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[5][5];
		int i;
		int j;
		int k = 0;
		int p = 0;
		int[][] h = new int[5][3];
		int[][] l = new int[5][3];
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					a[i][j] = Integer.parseInt(tempVar);
				}
			}
		}

		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				if (a[i][j] > k)
				{
					k = a[i][j],h[i][0] = i,h[i][1] = j;
				}
			}
		h[i][2] = k, k = 0;
		}


		//	for(i=0;i<5;i++){printf("%d %d %d\n",h[i][0],h[i][1],h[i][2]);}

	k = 100000;
		for (j = 0;j < 5;j++)
		{
			for (i = 0;i < 5;i++)
			{
				if (a[i][j] < k)
				{
					k = a[i][j],l[j][0] = i,l[j][1] = j;
				}
			}
			l[j][2] = k,k = 100000;
		}

	//	for(i=0;i<5;i++){printf("%d %d %d\n",l[i][0],l[i][1],l[i][2]);}

		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				if (h[i][2] == l[j][2] && h[i][0] == l[j][0] && h[i][1] == l[j][1])
				{
					System.out.printf("%d %d %d\n",h[i][0] + 1,h[i][1] + 1,h[i][2]),p++;
				}
			}
		}
		if (p == 0)
		{
			System.out.print("not found");
		}

	}
}

