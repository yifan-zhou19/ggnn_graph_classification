package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int[] money = new int[10];
	   int[] sum = new int[10];
	   int k;
	   int i;
	   int j;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   k = Integer.parseInt(tempVar);
	   }
	   money[1] = 100;
	   money[2] = 50;
	   money[3] = 20;
	   money[4] = 10;
	   money[5] = 5;
	   money[6] = 1;
	   for (i = 1;i <= 6;i++)
	   {
		sum[i] = 0;
	   }
	   for (i = 1;i <= 6;i++)
	   {
		  while (k >= money[i])
		  {
			 k = k - money[i];
			 sum[i]++;
		  }
		   System.out.printf("%d\n",sum[i]);
	   }
		return 0;
	}
}

