package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int p = int i;
		 int q = int i;
		int m;
		int n;
		int i;
		int t;
		int s;
		t = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = m;i <= n;i++)
		{
			if (p(i) == 0 && q(i) == 0)
			{
				t++;
			}
		}
		 s = 0;
		 for (i = m;i <= n;i++)
		 {
			if (p(i) == 0 && q(i) == 0)
			{
			   System.out.printf("%d",i);
				s++;
			 if (s != t)
			 {
				 System.out.print(",");
			 }
			}
		 }
		if (t == 0)
		{
			System.out.print("no");
		}

	   return 0;
	}

	public static int p(int i)
	{
		int j;
		for (j = 2;j < i;j++)
		{
			  if (i % j == 0)
			  {
				  return 1;
			  }
		}
		if (j == i)
		{
			return 0;
		}
	}


	public static int q(int i)
	{
		int j;
		int t;
		int n;
		int s;
	   s = i;
	   n = i % 10;
	   t = 10;
		while (0 == 0)
		{
		   if (i / t == 0)
		   {
			   break;
		   }
		  s = s / 10;
		  n = n * 10 + s % 10;
		  t = t * 10;
		}
	   if (n == i)
	   {
		   return 0;
	   }
	   else
	   {
		   return 1;
	   }
	}



}

