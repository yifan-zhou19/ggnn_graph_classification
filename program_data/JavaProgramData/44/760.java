package <missing>;

public class GlobalMembers
{
	public static void reverse(int n)
	{
	 int i;
	 int b = 0;
	 if (n == 0)
	 {
	  System.out.printf("%d\n",n);
	 }
	 else
	 {
		 if (n < 0)
		 {
		 System.out.print("-");
		 }
		 n = Math.abs(n);
		 if (n % 10 == 0)
		 {
			 while (n % 10 == 0)
			 {
				 n = n / 10;
			 }
		 }
		 for (i = 1;n != 0;i++)
		 {
			 b = b * 10 + n % 10;
			 n = n / 10;
		 }
		 System.out.printf("%d\n",b);
	 }
	}
	public static int Main()
	{
		void reverse(int num);
		int n;
		int j;
		for (j = 1;j <= 6;j++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			reverse(n);
		}
		return 0;
	}
}

