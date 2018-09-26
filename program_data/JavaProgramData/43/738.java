package <missing>;

public class GlobalMembers
{
	public static int ss(int x)
	{
	  double m;
	  int i;
	  int f = 0;
	  m = Math.sqrt(x);
	  if (x % 2 == 0)
	  {
		  return 0;
	  }
	  for (i = 3;i <= m;i++)
	  {
		  if (x % i == 0)
		  {
			 f = 1;
			 break;
		  }
	  }
	  if (f == 1)
	  {
		  return 0;
	  }
	  else
	  {
		  return 1;
	  }
	}
	public static int Main()
	{
	  int n;
	  int l;
	  int f;
	  int m;
	  double k;
	  int i;
	  int j;
	  int p;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  p = Integer.parseInt(tempVar);
	  }
		l = p / 2;
		for (i = 3;i <= l;i += 2)
		{
		   if (ss(i) != 0 && ss(p - i) != 0)
		   {
		   System.out.printf("%d %d\n",i,p - i);
		   }
		}
		return 0;
	}

}

