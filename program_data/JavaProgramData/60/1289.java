package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int k;
	 double m;
	 double p;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	if (n >= 5)
	{
		for (k = 3;k <= n - 2;k++)
		{
		  m = Math.sqrt(k);
	   for (i = 2;i <= m;i++)
	   {
		 if (k % i == 0)
		 {
			 break;
		 }
	   }
	   if (i <= m)
	   {
		   continue;
	   }
	   p = Math.sqrt(k + 2);
	   for (i = 2;i <= p;i++)
	   {
		  if ((k + 2) % i == 0)
		  {
			  break;
		  }
	   }
	   if (i <= p)
	   {
		   continue;
	   }
	   else
	   {
		   System.out.printf("%d %d\n",k,(k + 2));
	   }
		}
	}
	   else
	   {
		   System.out.print("empty");
	   }

	  return 0;
	}
}

