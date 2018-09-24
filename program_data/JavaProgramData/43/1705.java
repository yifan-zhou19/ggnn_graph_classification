package <missing>;

public class GlobalMembers
{
	public static int su(int p)
	{
	 int i;
	 int j;
	 int w;
	 w = 1;
	 for (i = 2;i < p;i++)
	 {
	  if (p % i == 0)
	  {
		  w = 0;
	  }
	 }
	  if (w == 1)
	  {
		  return (1);
	  }
	   else
	   {
		   return (0);
	   }
	}
	public static int Main()
	{
	int m;
	int i;
	int j;
	int k;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		m = Integer.parseInt(tempVar);
	}
	for (i = 3;i < m / 2 + 1;i++)
	{
	 if ((su(i) == 1) && (su(m - i) == 1))
	 {
		 System.out.printf("%d %d\n",i,m - i);
	 }
	}
	}
}

