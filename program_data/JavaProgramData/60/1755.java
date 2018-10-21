package <missing>;

public class GlobalMembers
{
	public static int ip(int n)
	{
	  int k;
	  int s;
	  if (n == 2)
	  {
		  return 1;
	  }
	  else if (n % 2 == 0)
	  {
		 return 0;

	  }
	  s = (int)Math.sqrt((double)n);
	  for (k = 3;k <= s;k += 2)
	  {
		  if (n % k == 0)
		  {
			return 0;
		  }

	  }
	  return 1;
	}
//C++ TO JAVA CONVERTER TODO TASK: The implementation of the following method could not be found:
	//int opp(int n);


	public static int Main()
	{
		int n;
		int i;
		int t = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 3;i < n - 1;i = i + 2)
		{
			if (ip(i) != 0 && ip(i + 2) != 0)
			{
				System.out.printf("%d %d\n",i,i + 2);
				t = 1;

			}

		}
		if (t == 0)
		{
		   System.out.print("empty");

		}
	   return 0;
	}

}

