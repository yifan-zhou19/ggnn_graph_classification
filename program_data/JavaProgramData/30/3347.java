package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int sum;
		int a;
		int n;
		sum = 0;
		a = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
		   sum += i * i;
		   if (i % 7 == 0 || (i - 7) % 10 == 0 || (i >= 70 && i <= 79))
		   {
		   a += i * i;
		   }
		}
			  System.out.printf("%d",sum - a);
		return 0;
	}
}

