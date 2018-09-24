package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		 int n;
		 int i;
		 int p;
		 int prime = int x;
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 n = Integer.parseInt(tempVar);
		 }
		 for (i = 6;i <= n;i += 2)
		 {
			 for (p = 3;p <= i / 2;p += 2)
			 {
			 if (prime(p) != 0 && prime(i - p) != 0)
			 {
			   System.out.printf("%d=%d+%d\n",i,p,i - p);
			   break;
			 }
			 }
		 }
	}

	public static int prime(int n)
	{
		int i;
		int t = 1;
		for (i = 2;i <= Math.sqrt(n);i++)
		{
			if (n % i == 0)
			{
		  t = 0;
		  break;
			}
		}
		return (t);
	}

}

