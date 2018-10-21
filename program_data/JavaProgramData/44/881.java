package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int reverse = int n;
		int X;
		int R;
		int i;
		for (i = 0;i <= 5;i++)
		{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			X = Integer.parseInt(tempVar);
		}
		R = reverse(X);
		System.out.printf("%d\n",R);
		}
	}

	 public static int reverse(int n)
	 {
	   int r = 0;
	   int q;
	   int N;
	   if (n > 0)
	   {
			  while (n > 0)
			  {
		   q = n % 10;
		   r = r * 10 + q;
		   n = n / 10;
			  }
		return (r);
	   }
	   if (n < 0)
	   {
			  while (n < 0)
			  {
		   N = 0 - n;
		   q = N % 10;
		   r = r * 10 + q;
		   N = N / 10;
		   n = 0 - N;
			  }
	   return (-r);
	   }
		if (n == 0)
		{
		return (n);
		}
	 }


}

