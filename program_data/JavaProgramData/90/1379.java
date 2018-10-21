package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int M;
		int N;
		int i;
		int[] a = new int[21];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
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
		   int f = new int(int a,int b);
		   a[i] = f(M, N);
		}
		 for (i = 1;i <= n;i++)
		 {
		 System.out.printf("%d\n",a[i]);
		 }
					return 0;
	}


		   public static int f(int a,int b)
		   {
			 int c;
			 if ((b == 1) || (a == 1))
			 {
			 c = 1;
			 }
			 else
			 {
			 if (a < b)
			 {
			 c = f(a, b - 1);
			 }
			 if (a == b)
			 {
			 c = f(a, b - 1) + 1;
			 }
			 if (a > b)
			 {
			  c = f(a, b - 1) + f(a - b, b);
			 }
			 }
			 return (c);
		   }

}

