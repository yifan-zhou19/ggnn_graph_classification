package <missing>;

public class GlobalMembers
{
	public static int sushu(int m)
	{
		int p;
		int q = 1;
		for (p = 3;p <= Math.sqrt(m);p++)
		{
			if (m % p == 0)
			{
			   q = 0;
			   break;
			}
		}
		return q;
	}
	public static int Main()
	{
		int n;
		int y = 0;
		int i;
		int a;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n < 5)
		{
			System.out.print("empty");
		}
		else
		{
			   System.out.print("3 5\n");
			   for (i = 7;i <= n;i = i + 2)
			   {
				   if (sushu(i) == 1 && sushu(i - 2) == 1)
				   {
					   System.out.printf("%d %d\n",i - 2,i);
				   }
			   }
		}
		return 0;
	}
}

