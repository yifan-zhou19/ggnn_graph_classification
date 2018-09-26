package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int i;
	public static int j;
	public static int k;
	public static int f;

	public static int Main()
	{
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  for (i = 6; i <= n; i += 2)
	  {
		System.out.printf("%d=", i);
		for (j = 3; j <= i; j += 2)
		{
		  f = 0;
		  for (k = 3; k * k <= j; k += 2)
		  {
			if (j % k == 0)
			{
			f = 1;
			break;
			}
		  }
		  if (f != 0)
		  {
			  continue;
		  }
		  for (k = 3; k * k <= i - j; k += 2)
		  {
			if ((i - j) % k == 0)
			{
			f = 1;
			break;
			}
		  }
		  if (f == 0)
		  {
			System.out.printf("%d+%d\n", j, i - j);
			break;
		  }
		}
	  }
	  return 0;
	}


}

