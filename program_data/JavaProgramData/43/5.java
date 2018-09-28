package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int a;
		int b;
		int j;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (a = 3;a < m;a = a + 2)
		{
		  for (b = 3;b < m;b = b + 2)
		  {
				if (a + b == m && a <= b)
				{
				for (i = 2;i * i <= a;i++)
				{
				 if (a % i == 0)
				 {
					 break;
				 }
				}
				for (j = 2;j * j <= b;j++)
				{
				 if (b % j == 0)
				 {
					 break;
				 }
				}
				if (i * i > a && j * j > b)
				{
					System.out.printf("%d %d\n",a,b);
				}
				}
		  }
		}
	}
}

