package <missing>;

public class GlobalMembers
{
	public static int fenjie(int x, int p)
	{
		int f = 0;
		if (x == 1)
		{
		 return 1;
		}
		else
		{
			 for (int i = p;i <= x;i++)
			 {
		   if (x % i == 0)
		   {
			f = f + fenjie(x / i, i);
		   }
			 }
		}
		return f;
	}
	public static int N;
	public static int Main()
	{
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			 String tempVar2 = ConsoleInput.scanfRead();
			 if (tempVar2 != null)
			 {
				 N = Integer.parseInt(tempVar2);
			 }
		  System.out.printf("%d\n",fenjie(N, 2));
		}
		return 0;
	}
}

