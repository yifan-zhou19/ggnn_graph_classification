package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		int b;
		int c;
		int d;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n >= 5)
		{
		   for (a = 3;a <= n - 2;a += 2)
		   {
			  c = 2;
			  while (a % c != 0)
			  {
				 c = c + 1;
			  }
			  if (c >= a)
			  {
				 d = 2;
				 b = a + 2;
				 while (b % d != 0)
				 {
					d = d + 1;
				 }
				 if (d >= b)
				 {
					System.out.printf("%d %d\n",a,b);
				 }
			  }
		   }
		}
		else
		{
		 System.out.print("empty");
		}
	}

}

