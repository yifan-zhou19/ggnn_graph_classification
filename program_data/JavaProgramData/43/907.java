package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int n;
	   int i;
	   int j;
	   int p;
	   int q;
	   int flag = 0;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   for (i = 3;i <= n / 2;i += 2)
	   {
			for (p = 3;p < i / 2;p += 2)
			{
				if (i % p == 0)
				{
					flag = 1;
				}

			}
			for (p = 3;p < (n - i) / 2;p += 2)
			{
				if ((n - i) % p == 0)
				{
					flag = 1;
				}

			}



					if (flag == 0)
					{
						System.out.printf("%d %d\n",i,n - i);

					}
					flag = 0;


		flag = 0;
	   }
	   return 0;
	}
}

