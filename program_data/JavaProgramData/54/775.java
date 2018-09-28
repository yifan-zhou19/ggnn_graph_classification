package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int k;
	  int n;
	  int i;
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
	  for (i = n * k;;i++)
	  {
		int f = 1;
		int d = 0;
		int left = i;
		while (d < n)
		{
		  if (left % n == k && (left -= (left - k) / n + k) > 0)
		  {
			  d++;
		  }
		  else
		  {
			  f = 0;
			  break;
		  }
		}
		if (f != 0)
		{
			System.out.printf("%d",i);
			break;
		};
	  }
	  return 0;
	}
}

