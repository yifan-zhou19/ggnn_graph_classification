package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n;
	  int i;
	  int j;
	  int i1;
	  int j1;
	  int i2;
	  int j2;
	  int x;
	  int p = 1;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  for (i = 1;i <= n;i++)
	  {
		for (j = 1;j <= n;j++)
		{
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  x = Integer.parseInt(tempVar2);
		  }
		  if (p != 0)
		  {
			  if (x == 0)
			  {
			  i1 = i;
			  j1 = j;
			  p = 0;
			  };
		  }
		  if (p == 0)
		  {
			  if (x == 0)
			  {
			  i2 = i;
			  j2 = j;
			  };
		  }
		};
	  }
	  System.out.printf("%d\n",(i2 - i1 - 1) * (j2 - j1 - 1));
	  return 0;
	}


}

