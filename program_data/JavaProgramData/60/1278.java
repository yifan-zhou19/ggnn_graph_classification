package <missing>;

public class GlobalMembers
{
	public static int[] prime = new int[1000001];
	public static int tot = 0;
	public static int Main()
	{
		int j;
		int n;
		int t = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 2; i <= n; i++)
		{
			for (j = 0; j < tot; j++)
			{
				 if (i % prime[j] == 0)
				 {
					 break;
				 }
			}
			if (j == tot)
			{
				 if (tot > 0 && prime[tot - 1] + 2 == i)
				 {
					 System.out.printf("%d %d\n", prime[tot - 1], i);
					 t = 1;
				 }
				 prime[tot++] = i;
			}
		}
		 if (t == 0)
		 {
			 System.out.print("empty");
		 }
		 return 0;
	}

}

