package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int a;
	int b;
	int n;
	int p;
	int q;
	int i;
	int j;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (a = 3;a <= n / 2;a = a + 2)
	{
		 for (i = 3;i <= Math.sqrt(a);i = i + 2)
		 {
			  p = a % i;
			if (p == 0)
			{
				break;
			}
		 }
		if (p != 0)
		{
			b = n - a;
			  if (b != 1)
			  {
			 for (j = 3;j <= Math.sqrt(b);j = j + 2)
			 {
			  q = b % j;
		   if (q == 0)
		   {
			   break;
		   }
			 }
		  if (q != 0)
		  {
		   System.out.printf("%d %d\n",a,b);
		  }
			  }
		}
	}
	 return 0;
	}

}

