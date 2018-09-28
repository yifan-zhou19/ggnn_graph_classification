package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	 int x;
	 int i;
	 int j;
	 int m;
	 int f;
	 int k;


	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 x = Integer.parseInt(tempVar);
	 }
	 for (k = 6;k <= x;k = k + 2)
	 {
	 if ((k % 2 == 0) && (x >= 6))
	 {
	  for (i = 3;i <= k / 2;i += 2)
	  {
	   f = 1;
	   for (j = 2;j <= Math.sqrt(i);j++)
	   {
		if (i % j == 0)
		{
		 f = 0;
		 break;
		}
	   }
	   if (f == 1)
	   {
		m = k - i;
	   }
	   for (j = 2;j <= Math.sqrt(m);j++)
	   {
			if (m % j == 0)
			{
		  f = 0;
		  break;
			}
	   }
		if (f == 1)
		{
		 System.out.printf("%d=%d+%d\n",k,i,m);
		 break;
		}
	  }
	 }
	 }

	 System.in.read();
	}
}

