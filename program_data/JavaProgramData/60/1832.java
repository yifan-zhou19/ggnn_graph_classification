package <missing>;

public class GlobalMembers
{
	public static int sushu(int x)
	{
		int m;
		int i;
		int e;
		m = Math.sqrt(x);
		e = (int)(m);
		for (i = 3;i <= e;i++)
		{
			if (x % i == 0)
			{
			   return 0;
			}
		}
		return 1;
	}
	public static int Main()
	{
		  int n;
		  int i;
		  int a;
		  int q;
		  int w;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  if (n < 5)
		  {
		  System.out.print("empty");
		  }
		  for (i = 3;i <= n - 2;i = i + 2)
		  {
							 a = i + 2;
							 q = sushu(i);
							 w = sushu(a);
							 if ((q != 0) && (w != 0))
							 {
							 System.out.printf("%d %d\n",i,a);
							 }

		  }
	}

}

