package <missing>;

public class GlobalMembers
{
	public static int sushu(int n)
	{
		int i;
		if (n == 3 || n == 5 || n == 7)
		{
			return 0;
		}
		else
		{
			for (i = 3;i <= Math.sqrt(n);i++)
			{
			if (n % i == 0)
			{
			  break;
			}
			}
		 if (i > Math.sqrt(n))
		 {
			   return 0;
		 }
		 else
		 {
			   return 1;
		 }
		}
	}
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		 int i;
		 int j;
		 for (i = 6;i <= n;i = i + 2)
		 {

			 for (j = 3;j <= i / 2;j = j + 2)
			 {
				   if (sushu(j) == 0 && sushu(i - j) == 0)
				   {
						 System.out.printf("%d=%d+%d\n",i,j,i - j);
						 break;
				   }
			 }
		 }

	}
}

