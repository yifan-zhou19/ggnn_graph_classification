package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int i;
	   int j;
	   int h;
	   int m;
	   int n;
	   int s;
		  s = 0;
		  h = 0;
	   int[] x = new int[10000];
	   int[] y = new int[100];
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
		if (n == 5)
		{
			 System.out.print("3 5");
		  return 0;
		}
	   for (i = 2;i <= n;i++)
	   {
		   s = 0;
		   for (j = 1;j <= i;j++)
		   {
			   if (i % j == 0)
			   {
				 s++;
			   }
		   }
		if (s == 2)
		{
			 x[h] = i;
			h++;
		}
	   }
		   s = 0;
	   for (i = 0;i < h;i++)
	   {
		  if (x[i + 1] - x[i] == 2)
		  {
			   System.out.printf("%d %d\n",x[i],x[i + 1]);
			s++;
		  }

	   }
		if (s == 0)
		{
			System.out.print("empty");
		}
		return 0;

	}
}

