package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int n;
	 int i;
	 int j;
	 int pd = int x;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 for (i = 6;i <= n;i += 2)
	 {
	   for (j = 3;j <= 0.5 * i;j = j + 2)
	   {
		if (pd(j) != 0 && pd(i - j) != 0)
		{
		 System.out.printf("%d=%d+%d\n",i,j,i - j);
		 break;
		}

	   }
	 }
	}
	public static int pd(int x)
	{
	 int i;
	 float y;
	 y = x;
	 for (i = 3;i <= (int)Math.sqrt(y);i += 2)
	 {
	   if (x % i == 0)
	   {
		   return 0;
	   }
	 }
	 return 1;
	}
}

