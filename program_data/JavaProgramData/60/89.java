package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int k1 = 1;
		int k2 = 1;
		int t1 = 0;
		int t2 = 0;
		int n;
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
			for (i = 3;i < n;i++)
			{
				for (j = 2;j <= Math.sqrt(i);j++)
				{
					if (i % j == 0)
					{
						k1 = 0;
						break;
					}
				}
				if (k1 == 1)
				{
					t1 = i;
					t2 = t1 + 2;
				for (j = 2;j <= Math.sqrt(t2);j++)
				{
					if (t2 % j == 0)
					{
						k2 = 0;
						break;
					}
				}
				if (k2 == 1)
				{
					System.out.printf("%d %d\n",t1,t2);
				}
				}
				k1 = 1;
				k2 = 1;
			}
			if (t2 == 0)
			{
				System.out.print("empty");
			}
		}
	}


}

