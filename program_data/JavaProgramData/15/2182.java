package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int i;
	 int j;
	 int n;
	 int a;
	 int t = 0;
	 int flag;
	 int line = 0;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 for (i = 1;i <= n;i++)
	 {
	  flag = 0;
	  for (j = 1;j <= n;j++)
	  {
	   String tempVar2 = ConsoleInput.scanfRead();
	   if (tempVar2 != null)
	   {
		   a = Integer.parseInt(tempVar2);
	   }
	   if (a == 0)
	   {
		   t++;
		   flag = 1;
	   }
	  }
	  if (flag == 1)
	  {
		  line++;
	  }
	 }
	 System.out.printf("%d",(line-2) * (t - line * 2) / 2);
	 return 0;
	}

}

