package <missing>;

public class GlobalMembers
{
	 public static void Main()
	 {
		  int f = int k;
		 int n;
		 int i;
		 int t;
			 String tempVar = ConsoleInput.scanfRead();
			 if (tempVar != null)
			 {
				 n = Integer.parseInt(tempVar);
			 }
		   for (t = 6;t <= n;t = t + 2)
		   {
			   for (i = 3;i <= t / 2;i = i + 2)
			   {
				   if (f(t - i) == 1 && f(i) == 1)
				   {
					   System.out.printf("%d=%d+%d\n",t,i,t - i);
					   break;
				   }
			   }
		   }

	 }
	 public static int f(int k)
	 {
		 int i;
		 if (k == 3 || k == 7 || k == 5)
		 {
			 return (1);
		 }

		 for (i = 3;i <= Math.sqrt(k);i = i + 2)
		 {
			if (k % i == 0)
			{
				return (0);
			}
		 }

			 return (1);

	 }

}

