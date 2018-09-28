package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		int t;
		int sum;
		int cas;
		int[] times = new int[10];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			cas = 0;
			for (j = 0;j < m;j++)
			{
				 String tempVar3 = ConsoleInput.scanfRead();
				 if (tempVar3 != null)
				 {
					 times[j] = Integer.parseInt(tempVar3);
				 }
			}
			for (j = 0;j < m;j++)
			{
				 sum = times[j] + 3 * j;
				 if (sum > 60)
				 {
					  t = 60 - 3 * j;
					  cas = 1;
					  break;
				 }
				 else
				 {
					  if (sum + 3 > 60)
					  {
							 t = times[j];
							 cas = 2;
							 break;
					  }
				 }
			}
			if (cas == 0)
			{
			t = 60 - 3 * m;
			}
			System.out.printf("%d\n",t);
		}
		return 0;
	}

}

