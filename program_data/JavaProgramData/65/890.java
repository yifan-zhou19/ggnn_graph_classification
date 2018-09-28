package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n = 0;
		int o = 0;
		int p;
		int q;
		int j;
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 m = Integer.parseInt(tempVar);
		 }
	  for (j = 0;j < m;j++)
	  {
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  p = Integer.parseInt(tempVar2);
		  }
		  String tempVar3 = ConsoleInput.scanfRead();
		  if (tempVar3 != null)
		  {
			  q = Integer.parseInt(tempVar3);
		  }
		  if ((p == 0 && q == 1) || (p == 1 && q == 2) || (q == p - 2))
		  {
			  n++;
		  }
		  else if (p > q || (q == p + 2))
		  {
			  o++;
		  }
	  }
	  if (n > o)
	  {
		  System.out.print("A");
	  }
	  if (n < o)
	  {
		  System.out.print("B");
	  }
	  if (n == o)
	  {
		  System.out.print("Tie");
	  }
	  return 0;
	}

}

