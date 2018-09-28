package <missing>;

public class GlobalMembers
{
	public static int fy(int x)
	{
		int z = 1;
		int i;
		int t;
		int m = 0;
		 t = x;
		while (t > 0)
		{
			   m = m * 10 + t % 10;
		   t = t / 10;
		}
		if (m != x)
		{
			z = 0;
		}
	   else
	   {
		   for (i = 2;i <= Math.sqrt(x);i++)
		   {
			   if (x % i == 0)
			   {
				 z = 0;
			  break;
			   }
		   }
	   }
		return z;
	}
	public static void Main(String[] args)
	{
	  int k;
	  int j;
	  int l;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  k = Integer.parseInt(tempVar);
	  }
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  j = Integer.parseInt(tempVar2);
	  }
	  for (l = k;l <= j;l++)
	  {
			 if (fy(l) == 1)
			 {
					 System.out.printf("%d",l);
				   break;
			 }
	  }
		if (l > j)
		{
			System.out.print("no");
		}
		else
		{
				  for (l = l + 1;l <= j;l++)
				  {
					  if (fy(l) == 1)
					  {
					  System.out.printf(",%d",l);
					  }
				  }
		}
	}


}

