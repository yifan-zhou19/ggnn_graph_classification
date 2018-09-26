package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int a = 10;
	 int b = 10;
	 int o = 10;
	 int p = 10;
	 int sum;
	 int[][] area = new int[111][111];
	 int k = 10;
	 int i = 0;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 k = Integer.parseInt(tempVar);
	 }
	 for (i = 0;i < k;i++)
	 {
	  sum = 0;
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  a = Integer.parseInt(tempVar2);
	  }
	  String tempVar3 = ConsoleInput.scanfRead();
	  if (tempVar3 != null)
	  {
		  b = Integer.parseInt(tempVar3);
	  }
	  for (o = 0;o < a;o++)
	  {
	   for (p = 0;p < b;p++)
	   {
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			area[o][p] = Integer.parseInt(tempVar4);
		}
	   }
	  }
	  for (p = 0;p < b;p++)
	  {
		  sum += area[0][p] + area[a - 1][p]; //??????
	  }
	  for (o = 1;o < a - 1;o++)
	  {
		  sum += area[o][0] + area[o][b - 1]; //??????
	  }
	  System.out.printf("%d\n",sum);
	 }
	 return 0;
	}
}

