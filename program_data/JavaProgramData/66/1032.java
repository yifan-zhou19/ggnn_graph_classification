package <missing>;

public class GlobalMembers
{
	public static String[] s = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
	public static int[] c = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

	public static int leap(int n)
	{
	  return n % 400 == 0 || (n % 4 == 0 && n % 100);
	}

	public static int Main()
	{
	  int y;
	  int m;
	  int d;
	  int k;
	  int i;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  y = Integer.parseInt(tempVar);
	  }
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  m = Integer.parseInt(tempVar2);
	  }
	  String tempVar3 = ConsoleInput.scanfRead();
	  if (tempVar3 != null)
	  {
		  d = Integer.parseInt(tempVar3);
	  }
	  if (!(y %= 400))
	  {
		  y = 400;
	  }
	  k = 0;
	  for (i = 1; i < y; ++i)
	  {
		  k = (k + 365 + leap(i)) % 7;
	  }
	  for (i = 1; i < m; ++i)
	  {
		k = (k + c[i] + (i == 2 ? leap(y) : 0)) % 7;
	  }
	  System.out.printf("%s.\n", s[(k + d) % 7]);
	  return 0;
	}

}

