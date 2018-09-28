package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int m;
	int a;
	int b;
	int i;
	int t;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		m = Integer.parseInt(tempVar);
	}
	 for (a = 2;a <= m / 2;a++)
	 {
	  t = 0;
	  for (i = 2;i < a - 1;i++)
	  {
	   if (a % i == 0)
	   {
		   t = 1;
	   }
	  }
	 if (t == 0)
	 {
	 b = m - a;
	 t = 0;
	for (i = 2;i < b - 1;i++)
	{
	   if (b % i == 0)
	   {
		   t = 1;
	   }
	}
	if (b == 1)
	{
		t = 1;
	}
	if (t == 0)
	{
		System.out.printf("%d %d\n",a,b);
	}
	 }
	 }
	}
}

