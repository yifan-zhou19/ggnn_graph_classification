package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 1; i <= m; i++)
		{
			 int n;
			 int j;
			 int[] num = new int[100];
			 int k;
			 String tempVar2 = ConsoleInput.scanfRead();
			 if (tempVar2 != null)
			 {
				 n = Integer.parseInt(tempVar2);
			 }
			 if (n == 0)
			 {
				   System.out.print("60\n");
			 }
			 else
			 {
				   for (j = 1; j <= n; j++)
				   {
						String tempVar3 = ConsoleInput.scanfRead();
						if (tempVar3 != null)
						{
							num[j] = Integer.parseInt(tempVar3);
						}
				   }
				   for (j = 1;j <= n;j++)
				   {
				   if ((num[j] + 3 * (j - 1)) >= 60)
				   {
								 k = 60 - 3 * (j - 1);
							  break;
				   }
				   else if ((num[j] + 3 * j) >= 60)
				   {
								  k = num[j];
							  break;
				   }
						else
						{
							  k = 60 - 3 * j;
						}

				   }
				  System.out.printf("%d\n", k);
			 }
		}
		return 0;
	}


}

