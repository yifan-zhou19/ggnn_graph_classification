package <missing>;

public class GlobalMembers
{
	public static int abs(int p)
	{
	  if (p > 0)
	  {
		  return p;
	  }
	  else
	  {
		  return (-p);
	  }
	}
	public static int Main()
	{
	  int first;
	  int last;
	  int i;
	  int j;
	  int n;
	  int a;
	  int check = 0;
	  int sc;
	  int sr;
	  int ec;
	  int er;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  for (i = 0;i < n * n;i++)
	  {
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = Integer.parseInt(tempVar2);
		}
		if ((a == 0) && (check == 0))
		{
			first = i;
			check = 1;
		}
		if (a == 0)
		{
			last = i;
		}
	  }
	  sc = (first / n);
	  sr = (first % n);
	  ec = (last / n);
	  er = (last % n);
	  System.out.printf("%d",(abs(sc - ec) - 1) * (abs(sr - er) - 1));
	  return 0;
	}
}

