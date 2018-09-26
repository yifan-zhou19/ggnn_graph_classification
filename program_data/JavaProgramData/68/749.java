package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int k = 6;
		int p;
		int q;
		int i;
		int j;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	loop:
	while (k <= n)
	{
		  for (p = 3;p <= k / 2;p = p + 2)
		  {
		  for (i = 3;i <= (int)Math.sqrt(p);i = i + 2)
		  {
		  if (p % i == 0)
		  {
			  break;
		  }
		  }
		  if (i > (int)Math.sqrt(p))
		  {
			  q = k - p;
		   for (j = 3;j <= (int)Math.sqrt(q);j = j + 2)
		   {
		   if (q % j == 0)
		   {
			   break;
		   }
		   }
		   if (j > (int)Math.sqrt(q))
		   {
			   System.out.printf("%d=%d+%d\n",k,p,q);
			   k = k + 2;
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
			   goto loop;
		   }
		  }
		  }

	  k = k + 2;
	}
	}

}

