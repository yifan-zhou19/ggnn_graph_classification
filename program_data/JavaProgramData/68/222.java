package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int k;
		int j;
		int m;
		int a;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 6;i <= n;i += 2)
		{
			for (j = 3;j < i;j++)
			{
			   for (k = 2;k <= Math.sqrt(j);k++)
			   {
				   if (j % k == 0)
				   {
				   break;
				   }
			   }
				   if (k > Math.sqrt(j))
				   {
						m = i - j;
				   }
				 for (a = 2;a <= Math.sqrt(m);a++)
				 {
					if (m % a == 0)
					{
					break;
					}
				 }
				   if (a > Math.sqrt(m))
				   {
					  System.out.printf("%d=%d+%d\n",i,j,m);
					break;
				   }
			}
		}
		return 0;
	}
}

