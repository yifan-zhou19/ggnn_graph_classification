package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int num;
	   int i;
	   int j;
	   int[] data = new int[30];
	   int[] dp = new int[30];
	   int max;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
	   memset(dp,0,(Integer.SIZE / Byte.SIZE));
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   num = Integer.parseInt(tempVar);
	   }
	   for (i = 0;i < num;i++)
	   {
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				data[i] = Integer.parseInt(tempVar2);
			}
	   }
	   dp[0] = 1;
	   for (i = 1;i < num;i++)
	   {
		   max = 1;
			for (j = 0;j < i;j++)
			{
				if ((data[i] <= data[j]) && (dp[j] + 1> max))
				{
				  max = dp[j] + 1;
				}
			}
			dp[i] = max;
	   }
	   for (i = 0;i < num;i++)
	   {
		   if (dp[i] > max)
		   {
			   max = dp[i];
		   }
	   }
	   System.out.printf("%d\n",max);
	   return 0;
	}
}

