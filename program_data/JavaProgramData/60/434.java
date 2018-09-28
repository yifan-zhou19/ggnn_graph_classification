package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n;
	  int m;
	  int k;
	  int i;
	  int t;
	  int c = 0;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  for (m = 1;m <= n - 2;m = m + 2)
	  {
		k = Math.sqrt(m);
		for (i = 2;i < k + 1;i = i + 1)
		{
			if (m % i == 0)
			{
				break;
			}
		}
		if (i >= k + 1)
		{
		  t = Math.sqrt(m + 2);
		  for (i = 2;i < t + 1;i++)
		  {
			  if ((m + 2) % i == 0)
			  {
				  break;
			  }
		  }
		  if (i >= t + 1 && m != 1)
		  {
			  System.out.printf("%d %d\n",m,m + 2);
			  c++;
		  }
		}
	  }
	  if (c == 0)
	  {
		  System.out.print("empty");
	  }
	}

}

