package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[11];
		int[] b = new int[11];
		int[] c = new int[11];
		int p = 0; //??
		int q = 0;
		int r = 0;
		int i;
		int j;
		int M;
		int N;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			M = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			N = Integer.parseInt(tempVar2);
		}

		while (M > 0)
		{
			a[p] = M;
			if (M % 2 == 0)
			{
				M = M / 2;
			}
			else
			{
				M = (M - 1) / 2;
			}
			p = p + 1;
		}

		while (N > 0)
		{
			b[q] = N;
			if (N % 2 == 0)
			{
				N = N / 2;
			}
			else
			{
				N = (N - 1) / 2;
			}
			q = q + 1;
		}


		for (i = 0;i < p;i++)
		{
			for (j = 0;j < q;j++)
			{
				if (a[i] == b[j])
				{
					c[r] = a[i];
					r++;
				}
			}
		}

		System.out.printf("%d",c[0]);
		//printf("%d",n);
		//for(i=0;i<q;i++)
		//	printf("%d ",b[i]);


		return 0;
	}
}

