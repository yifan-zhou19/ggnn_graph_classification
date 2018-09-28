package <missing>;

public class GlobalMembers
{
	public static int reverse(int n)
	{
		int x;
		int i;
		int zz;
		zz = n % 10;
		for (i = 0;n / 10 != 0;i++)
		{
		n = n / 10;
		x = n % 10;
		zz = zz * 10 + x;
		}
		return zz;
	}
	public static int Main()
	{
		int i;
		int m;
		for (i = 0;i < 6;i++)
		{
						 String tempVar = ConsoleInput.scanfRead();
						 if (tempVar != null)
						 {
							 m = Integer.parseInt(tempVar);
						 }
						 System.out.printf("%d\n",reverse(m));
		}

		return 0;
	}

}

