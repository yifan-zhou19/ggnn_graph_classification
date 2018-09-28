package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n;
	  int k;
	  int m;
	  int i;
	  int t;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  k = Integer.parseInt(tempVar2);
	  }
	  for (m = 1;;m++)
	  {
		  t = m;
			   for (i = 1;i <= n;i++)
			   {
					if (m - k <= 0 || m % n != k)
					{
					  i = 0;
				  break;
					}
				  else
				  {
					  m = (m - k) / n * (n - 1);
					  continue;
				  }
			   }
		  if (i == (n + 1))
		  {
			  System.out.printf("%d\n",t);
			  break;
		  }
		  else
		  {
			  m = t;
			  continue;
		  }
	  }
	  return 0;
	}

}

