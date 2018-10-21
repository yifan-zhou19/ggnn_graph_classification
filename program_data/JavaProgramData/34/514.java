package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 1;i < 100;i++)
		{
				if (n == 1)
				{
					System.out.print("End");
					break;
				}
				else
				{
				if (n % 2 == 1)
				{
					m = n * 3 + 1;
					System.out.printf("%d*3+1=%d\n",n,m);
					n = m;
					m = 0;
				}
				if (n % 2 == 0)
				{
					m = n / 2;
					System.out.printf("%d/2=%d\n",n,m);
					n = m;
					m = 0;
				}
				}
		}

	}

}

