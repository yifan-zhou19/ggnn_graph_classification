package <missing>;

public class GlobalMembers
{
	  public static int p(int a)
	  {
		int k = 2;
		  for (k = 2;k < a;k++)
		  {
		if ((a % k) != 0)
		{
		if (k == (a - 1))
		{
		  return 1;
		}
		  else
		  {
			  continue;
		  }
		}
		  else
		  {
			  return 0;
		  }
		  }
	  }
	public static int Main()
	{
		int a;
		int n;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  if (n < 5)
		  {
		  System.out.print("empty");
		  }
		  else
		  {
		  for (a = 2;a <= (n - 2);a++)
		  {
		if ((p(a) == 1) && (p(a + 2) == 1))
		{
		  System.out.printf("%d %d\n",a,a + 2);
		}
		  }
		  };
	}
}

