package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int[] sz = new int[1000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		int i = 0;
		while (i < n)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				sz[i] = Integer.parseInt(tempVar3);
			}
			i++;
		}

		int e;
		int m;
		for (m = 1;m <= n;m++)
		{
			int j;
			for (j = 0;j < n - m;j++)
			{
				if (sz[j] > sz[j + 1])
				{
					e = sz[j + 1];
					sz[j + 1] = sz[j];
					sz[j] = e;
				}
			}
		}

		int M;
		int x;
		int sum = 0;
		/*for(M=sz[n-1];M>=0;M--)
		{
			for(x=0;x<=n-1;x++)
		{
			if(k==M+sz[x]&&M!=sz[x])
			{
			sum+=1;	
			}
		}
	
		}*/
		int j;
		for (j = n - 1;j >= 0;j--)
		{
			for (x = j - 1;x >= 0;x--)
			{
				if (k == sz[j] + sz[x])
				{
			sum += 1;
				}
			}
		}
		if (sum == 0)
		{
			System.out.print("no");
		}
		else
		{
			System.out.print("yes");
		}

		return 0;

	}



}

