package <missing>;

public class GlobalMembers
{
	public static int num;
	public static void f(int n, int btm)
	{
		 if (btm == 1)
		 {
			 return;
		 }
		 int top;
		 int i;
		 top = (int)Math.sqrt(n);
	//printf("f:n=%d i=%d top=%d\n",n,i,top);
		 if (top >= btm)
		 {
			 for (i = btm;i <= top;i++)
			 {
	//printf("f:n=%d i=%d top=%d\n",n,i,top);
				 if (n % i == 0)
				 {
					num++;
					f(n / i, i);
				 }
			 }
		 }
	}

	public static int Main()
	{
		 int i;
		 int j;
		 int k;
		 int n;
		 int order;
		 int top;

		 for (scanf("%d", order);order >= 1;order--)
		 {
			 String tempVar = ConsoleInput.scanfRead();
			 if (tempVar != null)
			 {
				 n = Integer.parseInt(tempVar);
			 }
			 num = 0;
			 top = (int)Math.sqrt(n);
			 for (i = 1;i <= top;i++)
			 {
				 if (n % i == 0)
				 {
					num++;
	//printf("n=%d i=%d top=%d\n",n,i,top);
					f(n / i, i);
				 }
			 }
			 System.out.printf("%d\n",num);
		 }
	}
}

