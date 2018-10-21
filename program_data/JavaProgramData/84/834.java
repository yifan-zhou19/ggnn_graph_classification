package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int N;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}
	int[] zs = new int[N];

		int i;
		int j;
		for (i = 0;i < N;i++)

		{
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 j = Integer.parseInt(tempVar2);
		 }
			  zs[i] = j;
		}
		int m;
		for (m = 0;m < N - 1;m++)
		{
			if (zs[m] > zs[m + 1])
			{
						 int l;
			   l = zs[m];
			   zs[m] = zs[m + 1];
			   zs[m + 1] = l;
			}

		}
		System.out.printf("%d\n",zs[N - 1]);
		  int n;
			 for (n = 0;n < N - 2;n++)
			 {
			if (zs[n] > zs[n + 1])
			{
						 int e;
			   e = zs[n];
			   zs[n] = zs[n + 1];
			   zs[n + 1] = e;
			}

			 }
		System.out.printf("%d",zs[N - 2]);

		return 0;
	}


}

