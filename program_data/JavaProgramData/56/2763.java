package <missing>;

public class GlobalMembers
{
	 public static int m = 0;
	 public static int k = 0;
	 public static int j = 0;
	public static void Main()
	{
		int n;
		int v = int a;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		System.out.printf("%d",v(n));
	}
	  public static int v(int a)
	  {

		  if (a != 0)
		  {
		  m = a % 10;
		  k = a / 10;
		  j = j * 10 + m;

		  v(k);
		  }

		  return (j);
	  }


}

