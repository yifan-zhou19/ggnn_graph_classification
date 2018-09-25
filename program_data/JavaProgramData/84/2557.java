package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int max = new int(int x,int y);
	int min = new int(int x,int y);
	 int i = 1;
	 int n;
	 int a;
	 int s;
	 int d;
	 int f;
	 int g;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 while (i <= n)
	 {
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  a = Integer.parseInt(tempVar2);
	  }
	  if (i == 1)
	  {
		  s = a;
		  d = a;
	  }
	  else
	  {
		  f = d;
		  g = s;
			s = max(s, a);
			d = min(g, a);
			d = max(d, f);
	  }
	  i++;
	 }

	  System.out.printf("%d\n%d\n",s,d);
	 return 0;
	}
	public static int max(int x,int y)
	{
	int z;
	z = x > y != 0? x:y;
	return (z);
	}
	  public static int min(int x,int y)
	  {
	 int z;
	z = x < y != 0? x:y;
	return (z);
	  }




}

