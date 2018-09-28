package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int a = 0;
	  int b = 0;
	  int c;
	  int d;
	  int n;
	  int i;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  for (i = 1;i <= n;i++)
	  {
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			d = Integer.parseInt(tempVar2);
		}
	if (a < d)
	{
	  c = a;
	  a = d;
	  d = c;
	}
	  if (a < b)
	  {
		  c = a;
	  a = b;
	  b = c;
	  }
	  if (b < d)
	  {
		  c = b;
	  b = d;
	  d = c;
	  }
	  }
	System.out.printf("%d\n%d\n",a,b);
	return 0;
	}

}

