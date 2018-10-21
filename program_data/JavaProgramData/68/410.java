package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int k1;
		int k2;
		int a1;
		int a2;
		int n;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	  for (i = 6;i <= n;i += 2)
	  {
		  int a = i;
	   for (j = 3;j <= a;j += 2)
	   {
		   a1 = j,a2 = a - j;
		   {
			 for (k1 = 3;k1 <= Math.sqrt(a1);k1 += 2)
			 {
			 if (a1 % k1 == 0)
			 {
				 break;
			 }
			 }
		  for (k2 = 3;k2 <= Math.sqrt(a2);k2 += 2)
		  {
			  if (a2 % k2 == 0)
			  {
				  break;
			  }
		  }
		  if (k1 > Math.sqrt(a1) && k2 > Math.sqrt(a2))
		  {
			  System.out.printf("%d=%d+%d\n",a,a1,a2);
		  break;
		  }
		   }
	   }
	  }
	}
}

