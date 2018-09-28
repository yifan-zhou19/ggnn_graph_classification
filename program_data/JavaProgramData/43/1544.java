package <missing>;

public class GlobalMembers
{
	public static int f(int x)
	{
		int c = 0;
		int i;
	  for (i = 1;i <= (Math.sqrt(x) + 1);i++)
	  {
		  if (x % i == 0)
		  {
			  c++;
		  }
	  }
		if (c == 1)
		{
	  return 1;
		}
	  else
	  {
		  return 0;
	  }



	}
	public static int Main()
	{
		int m;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   m = Integer.parseInt(tempVar);
	   }
	   int c = 3;
	   for (;c <= m / 2;c = c + 2)
	   {
		   int d;
		 d = m - c;
		 if (f(d) == 1 && f(c) == 1)
		 {
			 System.out.printf("%d %d\n",c,d);
		 }

	   }
		System.in.read();
		System.in.read();
	}

}

