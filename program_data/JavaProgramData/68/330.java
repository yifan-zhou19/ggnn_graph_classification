package <missing>;

public class GlobalMembers
{
	public static int prime(int x)
	{
		int b = 1;
		if (x == 3 || x == 5 || x == 7)
		{
			return b;
		}
		else
		{
			for (int i = 3;i <= Math.sqrt(x);i += 2)
			{
				if (x % i == 0)
				{
					  b = 0;
					  return b;
					  break;
				}
			}
		}
		return b;
	}
	public static int Main()
	{
		int o;
		int n;
		int a;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 6;i <= n;i += 2)
		{
			int s = i / 2;
				for (a = 3;a < (n / 2);a += 2)
				{

								if (prime(a) + prime(i - a) == 2)
								{
											 System.out.printf("%d=%d+%d\n",i,a,i - a);
											 break;

								}

				}
		}


		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 o = Integer.parseInt(tempVar2);
		 }
		return 0;
	}


}

