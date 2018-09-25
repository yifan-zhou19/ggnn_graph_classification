package <missing>;

public class GlobalMembers
{
	public static int f(int M,int N)
	{
		int sum1;
		int sum2;
		int sum;
		if (M < 0)
		{
			return 0;
		}
		if (M == 0)
		{
			return 1;
		}
		else
		{
		   if (N == 1)
		   {
			   return 1;
		   }
		   else
		   {
			 sum1 = f(M, N - 1);
			 if (M == 1)
			 {
				 return 1;
			 }
			 else
			 {
				sum2 = f(M - N, N);
			 }
		   }
		}
		sum = sum1 + sum2;
		return sum;
	}
	public static int Main()
	{
	   int n;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   int[] a = new int[21];
	   int[] b = new int[21];
	   for (int i = 0;i < n;i++)
	   {
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  a[i] = Integer.parseInt(tempVar2);
		  }
		  String tempVar3 = ConsoleInput.scanfRead(" ");
		  if (tempVar3 != null)
		  {
			  b[i] = Integer.parseInt(tempVar3);
		  }
	   }
	   for (int j = 0;j < n;j++)
	   {
		  System.out.printf("%d\n",f(a[j], b[j]));
	   }
	   System.in.read();
	   System.in.read();
	   System.in.read();
	}


}

