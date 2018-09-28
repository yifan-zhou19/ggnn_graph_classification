package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int d = int x;
	  int n;
	  int i;
	  int a;
	  int b;
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
		  for (i = 3;i < (n - 1);i += 2)
		  {
	  a = d(i);
	  b = d(i + 2);

	  if (a == 0 && b == 0)
	  {
	  System.out.printf("%d %d\n",i,i + 2);
	  }

		  }
	  }

	}

	   public static int d(int x)
	   {
		int t;

		for (t = 2;t < x;t++)
		{
		if (x % t == 0)
		{
			return 1;
			break;
		}
		}
		if (t >= x)
		{
			return 0;
		}
	   }
}

