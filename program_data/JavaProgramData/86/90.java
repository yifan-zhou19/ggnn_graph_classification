package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	 int n;
	 int i;
	 int j;
	 int[] breaks = new int[100];
	 int[][] times = new int[100][10];
	 int[] sum = new int[100];
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 for (i = 0;i < n;i++)
	 {
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  breaks[i] = Integer.parseInt(tempVar2);
	  }
	  for (j = 0;j < breaks[i];j++)
	  {
	   String tempVar3 = ConsoleInput.scanfRead();
	   if (tempVar3 != null)
	   {
		   times[i][j] = Integer.parseInt(tempVar3);
	   }
	  }
	 }
	 for (i = 0;i < n;i++)
	 {
	  if (breaks[i] == 0)
	  {
	   sum[i] = 60;
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	   goto end;
	  }
	  if ((times[i][breaks[i] - 1] + breaks[i] * 3) <= 60)
	  {
	   sum[i] = 60 - breaks[i] * 3;
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	   goto end;
	  }
	  for (j = 0;j < breaks[i];j++)
	  {
	   if ((times[i][j] + 3 * j) >= 57 && (times[i][j] + j * 3) <= 60)
	   {
		sum[i] = times[i][j];
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
		goto end;
	   }
	  }
	  for (j = 0;j < breaks[i] - 1;j++)
	  {
	   if ((times[i][j] + j * 3) <= 60 && (times[i][j + 1] + j * 3 + 3) >= 60)
	   {
		sum[i] = 60 - 3 * j - 3;
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
		goto end;
	   }
	  }
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	  end:
	  ;
	 }
	 for (i = 0;i < n;i++)
	 {
		 System.out.printf("%d\n",sum[i]);
	 }
	}


}

