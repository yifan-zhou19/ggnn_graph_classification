package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int i;
	 int j;
	 int n;
	 int c1 = 1;
	 int c2 = 1;
	 int k;
	 int b;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 n = n / 2 * 2;
	 for (i = 6;i <= n;i += 2)
	 {
	  for (j = 3;j <= i / 2;j += 2)
	  {
	   c1 = 1;
	   c2 = 1;
	   b = Math.sqrt(j);
	   for (k = 3;k <= b;k += 2)
	   {
	   if (j % k == 0)
	   {
		   c1 = 0;
	   }
	   }
	   b = Math.sqrt(i - j);
	   for (k = 3;k <= b;k += 2)
	   {
	   if ((i - j) % k == 0)
	   {
		   c2 = 0;
	   }
	   }
	  if (c1 != 0 && c2 != 0)
	  {
		System.out.printf("%d=%d+%d\n",i,j,i - j);
		break;
	  }
	  }
	 }
	}

}

