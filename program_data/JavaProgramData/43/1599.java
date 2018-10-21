package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		 int i;
		 int j;
		 int m;
		 int n;
		 int prime = int n;
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 m = Integer.parseInt(tempVar);
		 }
		 for (i = 3;i <= m / 2;i++)
		 {
			 if (prime(i) != 0 && prime(m - i) != 0)
			 {
			   System.out.printf("%d %d\n",i,m - i);
			 }
		 }
	}

		 public static int prime(int n)
		 {
			 int k;
			 int i;
			 k = Math.sqrt(n);
			 for (i = 2;i <= k;i++)
			 {
				 if (n % i == 0)
				 {
					 break;
				 }
			 }
			 return (i > k)?1:0;
		 }

}

