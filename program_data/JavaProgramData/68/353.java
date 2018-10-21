package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int n;
		int n_;
		int a;
		int b;
		int c;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	 for (k = 6;k <= n;k += 2)
	 {
		 n_ = k;
		 j = 1;
	   do
	   {
		   c = 0;
		j = j + 2;
		a = j;
		b = n_ - j;
		for (i = 3;i <= Math.sqrt(a);i = i + 2)
		{
		if (a % i == 0)
		{
			c = 1;
		}
		}
		for (i = 3;i <= Math.sqrt(b);i = i + 2)
		{
		if (b % i == 0)
		{
			c = 1;
		}
		}
	   } while (c == 1);
	 System.out.printf("%d=%d+%d\n",n_,a,b);
	 }
	}
}

