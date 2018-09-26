package <missing>;

public class GlobalMembers
{
	public static int wu(int n)
	{
		if ((n % 7 == 0) || (n % 10 == 7) || (n / 10 == 7))
		{
			return 0;
		}
		else
		{
			return 1;
		}
	}
	public static int Main()
	{
		int i;
		int n;
		int sum = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
		   if (wu(i) != 0)
		   {
			   sum += i * i;
		   }
		}
		System.out.printf("%d\n",sum);
	}

}

