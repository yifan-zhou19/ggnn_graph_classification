package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int m;
		int n;
		int i;
		int[] a = new int[10000];
		int[] sum = new int[10000];
		int y;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (j = 1;j <= k;j++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				n = Integer.parseInt(tempVar3);
			}
		sum[j - 1] = 0;
		 for (i = 1;i <= 10000;i++)
		 {
		 String tempVar4 = ConsoleInput.scanfRead();
		 if (tempVar4 != null)
		 {
			 a[i - 1] = Integer.parseInt(tempVar4);
		 }
		 y = i <= n != 0 || i % n == 1 || i % n == 0 || i> m * n - n;
		 sum[j - 1] += y * a[i - 1];
		 if (i >= m * n)
		 {
			 break;
		 }
		 }
		}
		for (i = 1;i <= k;i++)
		{
		System.out.printf("%d\n",sum[i - 1]);
		}


	  return 0;
	}

}

