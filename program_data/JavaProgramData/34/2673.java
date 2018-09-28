package <missing>;

public class GlobalMembers
{
	public static void jishu(int n)
	{
		int s;
	s = n * 3 + 1;
	System.out.printf("%d*3+1=%d\n",n,s);
	}
	public static void oushu(int n)
	{
		int s;
	s = n / 2;
	System.out.printf("%d/2=%d\n",n,s);
	}
	public static int panduan(int n)
	{
		if (n == 1)
		{
			return 5;
		}
	if (n % 2 == 1)
	{
		return 1;
	}
	if (n % 2 == 0)
	{
		return 0;
	}
	}

	public static int Main()
	{
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
	if (n != 1)
	{
		 for (i = 1;n != 1;i++)
		 {
		 if (panduan(n) == 0)
		 {
			 oushu(n);
			 n = n / 2;
		 }
		 if (panduan(n) == 1)
		 {
			 jishu(n);
			 n = n * 3 + 1;
		 }
			if (panduan(n == 5) != 0)
			{
				break;
			}
		 }

	}
	 System.out.print("End");

	}
}

