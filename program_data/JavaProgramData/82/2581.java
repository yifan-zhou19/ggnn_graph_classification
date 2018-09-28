package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int x;
		int y;
		int h;
		int i;
		int k;
		int e;
		int max;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		h = 0;
		max = 0;
		if (n < 100)
		{
		  for (i = 1;i <= n;i++)
		  {
			 String tempVar2 = ConsoleInput.scanfRead();
			 if (tempVar2 != null)
			 {
				 x = Integer.parseInt(tempVar2);
			 }
			 String tempVar3 = ConsoleInput.scanfRead();
			 if (tempVar3 != null)
			 {
				 y = Integer.parseInt(tempVar3);
			 }
			 if (x <= 140 && x >= 90 && y >= 60 && y <= 90 && n != i)
			 {
			  h += 1;
			 }
			   else if (x > 140 || x < 90 || y < 60 || y>90 || n != i)
			   {
				  if (h > max)
				  {
				   max = h;
				  }
				  h = 0;
			   }
			   else if (n == i)
			   {
				h = h + 1;
				if (h > max)
				{
				   max = h;
				}
			   }
		  }
		  System.out.printf("%d",max);
		}
		return 0;
	}
}

