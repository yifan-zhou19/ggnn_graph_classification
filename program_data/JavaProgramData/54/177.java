package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	  int n;
	  int k;
	  int i;
	  int y;
	  int v;
	  int t;
	  int s;
	  int q;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  String tempVar2 = ConsoleInput.scanfRead(" ");
	  if (tempVar2 != null)
	  {
		  k = Integer.parseInt(tempVar2);
	  }
	  for (i = 1;;i++)
	  {
		   t = i * n + k;
		 for (v = 1,y = 1;v <= n - 1;)
		 {
			q = t * n % (n - 1);
		  if (q != 0)
		  {
			   y = 0;
			   break;
		  }
		  else
		  {
			  v = v + 1;
			   s = t * n / (n - 1);
			   t = s + k;
		  }
		 }
		   if (y == 1)
		   {
			   System.out.printf("%d",t);
			   break;
		   }
	  }
	}

}

