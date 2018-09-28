package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int i;
	  int n;
	  int sum;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  sum = 0;
	  for (i = 1; i <= n; i++)
	  {
	  if (i % 7 == 0 || (i % 10 != 0) && (i % 10) % 7 == 0 || (i >= 11) && (int)(i / 10) % 7 == 0)
	  {
		 continue;
	  }
	  else
	  {
		  sum += i * i;
	  }
	  }
	System.out.printf("%d", sum);
	return 0;
	}
}

