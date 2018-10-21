package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	   int n;
	   int i;
	   int j;
	   int k;
	   int h;
	   double a;
	   double b;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   for (i = 6;i <= n;i = i + 2)
	   {
		 for (j = 3;j < i - 2;j = j + 2)
		 {
			 a = Math.sqrt(j);
		   for (k = 3;k <= a;k = k + 2)
		   {
			   if (j % k == 0)
			   {
				   break;
			   }
		   }
		   if (k > a)
		   {
			h = i - j;
		   }
			b = Math.sqrt(h);
			for (k = 3;k <= b;k = k + 2)
			{
				if (h % k == 0)
				{
					break;
				}
			}
		   if (k > b)
		   {
			   break;
		   }
		 }
		 System.out.printf("%d=%d+%d\n",i,j,h);
	   }
	}
}

