package <missing>;

public class GlobalMembers
{
	public static int n = 0;
	public static int k1 = 0;
	public static int k2 = 0;
	public static int flag = 0;
	public static int[] sum1 = new int[100000];
	public static int[] sum2 = new int[100000];
	public static int Main()
	{
		//freopen("zozo.in","r",stdin);
		//freopen("zozo.out","w",stdout);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		//if (n==0) {printf("NOT FOUND\n"); return 0; }
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			k1 = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			k2 = Integer.parseInt(tempVar3);
		}
		while (!(k1 == 0 && k2 == 0))
		{
		 sum1[k1 + 1]++;
		 sum2[k2 + 1]++;
		 String tempVar4 = ConsoleInput.scanfRead();
		 if (tempVar4 != null)
		 {
			 k1 = Integer.parseInt(tempVar4);
		 }
		 String tempVar5 = ConsoleInput.scanfRead();
		 if (tempVar5 != null)
		 {
			 k2 = Integer.parseInt(tempVar5);
		 }
		}
		flag = 0;
		for (int i = 1; i <= n; i++)
		{
			if (sum1[i] == 0)
			{
			  if (sum2[i] == n - 1)
			  {
				flag = 1;
				System.out.printf("%d\n",i - 1);
				break;
			  }
			}
		}
		if (flag == 0)
		{
			System.out.print("NOT FOUND\n");
		}
		return 0;
	}

}

