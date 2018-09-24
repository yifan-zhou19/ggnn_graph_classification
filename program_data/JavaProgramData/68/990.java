package <missing>;

public class GlobalMembers
{
	public static int prime(int n)
	{
	 int i;
	 for (i = 2;i <= (int)Math.sqrt(n); i++)
	 {
		 if (n % i == 0)
		 {
		   return 0;
		 }
	 }
	 return 1;
	}
	public static void Main(String[] args)
	{
	 int i;
	 int j;
	 int n;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 for (i = 6;i <= n;i += 2)
	 {
		for (j = 3;j < i;j++)
		{
		 if (prime(j) != 0 && prime(i - j) != 0)
		 {
			System.out.printf("%d=%d+%d\n",i,j,i - j);
		  break;
		 }
		}
	 }
	}
}

