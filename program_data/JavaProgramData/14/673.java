package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[100001][5];
		int i;
		int j;
		int n;
		int k = 3;
		int max = 0;
		int t = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1 ;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i][1] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i][2] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				a[i][3] = Integer.parseInt(tempVar4);
			}
		 a[i][4] = a[i][2] + a[i][3];
		}
		 while (k-- != 0)
		 {
		 for (i = 1;i <= n ;i++)
		 {
			if (a[i][4] > max)
			{
				max = a[i][4], t = i;
			}
		 }
		   System.out.printf("%d %d\n",t,a[t][4]);
		   a[t][4] = 0;
		   max = 0;
		 }
	}

}

