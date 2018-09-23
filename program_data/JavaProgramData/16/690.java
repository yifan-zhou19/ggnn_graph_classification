package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			i = (n % 10) * 10 + (n - n % 10) / 10;
			j = (n % 10) * 100 + (n % 100 - n % 10) + (n - n % 100) / 100;
			k = (n % 10) * 1000 + (n % 100 - n % 10) * 10 + (n % 1000 - n % 100) / 10 + (n - n % 1000) / 1000;
			if (n % 10 == n)
			{
				System.out.printf("%d",n);
			}
			else if (n % 100 == n)
			{
				System.out.printf("%02d",i);
			}
			else if (n % 1000 == n)
			{
				System.out.printf("%03d",j);
			}
			else
			{
				System.out.printf("%04d",k);
			}
			return 0;
	}

}

