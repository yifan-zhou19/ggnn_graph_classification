package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int m;
		  int n;
		  int i;
		  int j;
		  int k;
		  int l;
		  int sum;
		  int t;
		   String tempVar = ConsoleInput.scanfRead();
		   if (tempVar != null)
		   {
			   m = Integer.parseInt(tempVar);
		   }
		   for (i = 1;i <= m;i++)
		   {
			   String tempVar2 = ConsoleInput.scanfRead();
			   if (tempVar2 != null)
			   {
				   n = Integer.parseInt(tempVar2);
			   }
			   sum = 60;
			   t = 0;
		   for (j = 1;j <= n;j++)
		   {
			   String tempVar3 = ConsoleInput.scanfRead();
			   if (tempVar3 != null)
			   {
				   l = Integer.parseInt(tempVar3);
			   }
			   if (sum > l)
			   {
			   if (sum - l < 3)
			   {
				   sum = l;
			   }
				else
				{
					sum = sum - 3;
				}
			   }
		   }
		   System.out.printf("%d\n",sum);
		   }

	}

}

