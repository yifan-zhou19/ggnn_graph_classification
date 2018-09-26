package <missing>;

public class GlobalMembers
{
	public static int sushu(int N)
	{
		if (N == 2 || N == 3)
		{
			return 1;
		}
		else
		{
		int d = 1;
		int i;
		for (i = 2;i <= Math.sqrt(N);i++)
		{
			 d = N % i;
			 if (d == 0)
			 {
				 return 0;
				 break;
			 }
		}
		 if (d != 0)
		 {
			 return 1;
		 }
		}
	}
	public static void Main()
	{
		int a;
		int b;
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned int n,t,i;
		int n;
		int t;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (t = 6;t <= n;t = t + 2)
		{
		   for (i = 2;i <= t / 2;i++)
		   {
			   a = sushu(i);
			   b = sushu(t - i);
			   if (a == 1 && b == 1)
			   {
				   System.out.printf("%d=%d+%d\n",t,i,t - i);
				   break;
			   }
		   }
		}
	}
}

