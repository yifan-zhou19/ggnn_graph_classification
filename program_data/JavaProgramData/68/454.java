package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int a;
		int b;
		int i;
		int k;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 6;i <= n;i = i + 2)
		{
			  for (a = 3;a <= (int)(i / 2);a++)

			  {
				  b = i - a;
				  for (k = 2;k <= Math.sqrt(a);k++)
				  {
					if (a % k == 0)
					{
						break;
					}
				  }
				  for (m = 2;m <= Math.sqrt(b);m++)
				  {
					if (b % m == 0)
					{
						break;
					}
				  }
				  if (k > Math.sqrt(a) && m > Math.sqrt(b))
				  {
					System.out.printf("%ld=%ld+%ld\n",i,a,b);
					break;
				  }
			  }


		}
	}

}

