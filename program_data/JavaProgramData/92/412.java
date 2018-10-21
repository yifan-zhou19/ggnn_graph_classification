package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int n;
	 int[] t = new int[1000];
	 int[] q = new int[1000];
	 int i;
	 int j;
	 int win = 0;
	 int ping = 0;
	 int x = 0;
	 int num = 0;
	 n = 1;
	 while (n != 0)
	 {
	 int[] tian = new int[1000];
	 int[] qi = new int[1000];
	  win = 0;
	  ping = 0;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  if (n == 0)
	  {
	  break;
	  }
	  for (i = 0;i < n;i++)
	  {
	   String tempVar2 = ConsoleInput.scanfRead();
	   if (tempVar2 != null)
	   {
		   t[i] = Integer.parseInt(tempVar2);
	   }
	  }
	  for (i = 0;i < n;i++)
	  {
	   String tempVar3 = ConsoleInput.scanfRead();
	   if (tempVar3 != null)
	   {
		   q[i] = Integer.parseInt(tempVar3);
	   }
	  }
	  for (j = 0;j < n;j++)
	  {
		  for (i = 1 + j;i < n;i++)
		  {
		   if (t[j] >= t[i])
		   {
			num = t[i];
			 t[i] = t[j];
			t[j] = num;
		   }
		  }
	  }
	  for (j = 0;j < n;j++)
	  {
		  for (i = 1 + j;i < n;i++)
		  {
		   if (q[j] >= q[i])
		   {
			  num = q[i];
			  q[i] = q[j];
			  q[j] = num;
		   }
		  }
	  }
	  for (i = 0;i < n;i++)
	  {
	   for (j = n - 1;j >= 0;j--)
	   {
		if (tian[i] == 0 && qi[j] == 0)
		{
		if (t[i] > q[j])
		{
		 tian[i] = 1;
		 qi[j] = 1;
		 win++;
		 break;
		}
		}
	   }
	  }
	  for (i = 0;i < n;i++)
	  {
	   if (tian[i] == 0)
	   {
	   for (j = 0;j < n;j++)
	   {
		if (qi[j] == 0)
		{
		 if (t[i] == q[j])
		 {
		  ping++;
		  break;
		 }
		}
	   }
	   }
	  }
	  System.out.printf("%d\n",400 * win + 200 * ping - 200 * n);
	 }
	 return 0;
	}

}

