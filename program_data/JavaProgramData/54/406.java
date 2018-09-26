package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n;
	  int k;
	  int m;
	  int s;
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
	  for (m = s = 1; ; s = ++m)
	  {
		for (i = 0; i < n; ++i)
		{
		  if (s % (n - 1) != 0)
		  {
			s = 0;
			break;
		  }
		  else
		  {
			  s = s / (n - 1) * n + k;
		  }
		}
		  if (s != 0)
		  {
			  break;
		  }
	  }
	  System.out.printf("%d\n", s);
	  return 0;
	}
}

