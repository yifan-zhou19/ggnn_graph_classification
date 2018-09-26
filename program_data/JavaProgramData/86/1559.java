package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int i;
	  int j;
	  int n;
	  int w;
	  int sum;
	  int flag;
	  int k;
	  int x;
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
		   w = Integer.parseInt(tempVar2);
	   }
	flag = 0;
	 for (j = 0;j < w;j++)
	 {
		   String tempVar3 = ConsoleInput.scanfRead();
		   if (tempVar3 != null)
		   {
			   sum = Integer.parseInt(tempVar3);
		   }
			 if (flag != -1 && (sum + 3 * (j + 1)) > 59)
			 {
	flag = 1;
	break;
			 }
	 }
	   for (k = j + 1;k < w;k++)
	   {
		 String tempVar4 = ConsoleInput.scanfRead();
		 if (tempVar4 != null)
		 {
			 x = Integer.parseInt(tempVar4);
		 }
	   }
	 if (flag != 0 && (sum <= 60) && ((sum + 3 * j) <= 60))
	 {
	  System.out.printf("%d\n",sum);
	 }
			else
			{
		 System.out.printf("%d\n",60 - j * 3);
			}
	  }
	return 0;
	}


}

