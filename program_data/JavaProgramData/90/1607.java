package <missing>;

public class GlobalMembers
{
	public static int method(int m, int n)
	{
		if (n == 1)
		{
		   return 1;
		}
		else if (m < 0)
		{
				return 0;
		}
			 else if (m == 0)
			 {
					 return 1;
			 }
				  else
				  {
					 return method(m, n - 1) + method(m - n, n);
				  }
	}
	public static int Main()
	{
		  int t;
		  int M;
		  int N;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  t = Integer.parseInt(tempVar);
		  }
		  for (int i = 0;i < t;i++)
		  {
				  String tempVar2 = ConsoleInput.scanfRead();
				  if (tempVar2 != null)
				  {
					  M = Integer.parseInt(tempVar2);
				  }
				  String tempVar3 = ConsoleInput.scanfRead(" ");
				  if (tempVar3 != null)
				  {
					  N = Integer.parseInt(tempVar3);
				  }
				  System.out.printf("%d\n",method(M, N));
		  }

	}
}

