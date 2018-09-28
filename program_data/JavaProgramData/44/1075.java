package <missing>;

public class GlobalMembers
{
	public static int reverse(int num)
	{
		int a;
		int b = 0;
		int i;
		if (num == 0)
		{
		b = 0;
		}
		for (i = 0;num != 0;i++)
		{
				   a = num % 10;
				   num = num / 10;
				   b = a + b * 10;
		}
		return b;
	}
	public static int Main()
	{
					   int n;
					   int i;
					   int j;
					   int k;
					   for (k = 0;k < 6;k++)
					   {
									   String tempVar = ConsoleInput.scanfRead();
									   if (tempVar != null)
									   {
										   n = Integer.parseInt(tempVar);
									   }
									   System.out.printf("%d\n",reverse(n));
					   }
		  System.in.read();
		  System.in.read();
		  System.in.read();
	}

}

