package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int m;
		int n;
		int b;
		int c;
		int t;
		int k;

	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		m = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		n = Integer.parseInt(tempVar2);
	}

		for (i = m,t = 0;i <= n;i++)
		{
			 c = i;
			 b = 0;
		   while (c > 0)
		   {
			   b = b * 10 + (c % 10);
		   c = c / 10;
		   }
		   if (b == i)
		   {
				 k = (int)Math.sqrt(i);
			  for (j = 2;j <= k;j = j + 1)
			  {
				  if (i % j == 0)
				  {
					  break;
				  }
			  }

				 if (j > k)
				 {
					   t = 1 + t;
					if (t == 1)
					{
						System.out.printf("%d",i);
					}
					if (t > 1)
					{
						System.out.printf(",%d",i);
					}
				 }

		   }
		}
		if (t == 0)
		{
			System.out.print("no");
		}
			System.out.print("\n");
			return 0;
	}
}

