package <missing>;

public class GlobalMembers
{
	public static int lgm(int num)
	{
	   if (num == 1)
	   {
	   return 0;
	   }
	   if (num % 2 == 0)
	   {
	   System.out.printf("%d/2=%d\n",num,num / 2);
	   lgm(num / 2);
	   }
	   if (num % 2 == 1)
	   {
	   System.out.printf("%d*3+1=%d\n",num,num * 3 + 1);
	   lgm(num * 3 + 1);
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
		lgm(n);
		System.out.print("End");
	}

}

