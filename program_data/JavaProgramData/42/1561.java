package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] sz = new int[100000];
		int k;
		int i;
		int j;
		int num;
		num = 0;
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
				sz[i] = Integer.parseInt(tempVar2);
			}
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			k = Integer.parseInt(tempVar3);
		}
		for (i = 0;i < n;i++)
		{
						 if (sz[i] == k)
						 {
									  for (j = i;j < n - 1;j++)
									  {
													   sz[j] = sz[j + 1];
									  }
									  num++;
									  i--;
									  n--;

						 }
		}
		for (i = 0;i < n - 1;i++)
		{
			System.out.printf("%d ",sz[i]);
		}
		System.out.printf("%d",sz[n - 1]);


		return 0;
	}

}

