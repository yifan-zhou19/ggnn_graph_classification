package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m;
		int n;
		int i;
		int j;
		int k = 0;
		int x;
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
		if (m == 2)
		{
			k = 1;
			System.out.print("2");
		}
	   if (m % 2 == 0)
	   {
		   m = m + 1;
	   }
		for (i = m;i <= n;i += 2)
		{
			for (j = 3;j <= Math.sqrt(i);j = j + 2)
			{
				if (i % j == 0)
				{
					break;
				}
			}
			if (j > Math.sqrt(i))
			{
				if (i < 10)
				{
					x = i;
				}
				else if (i < 100)
				{
					x = i % 10 * 10 + i / 10;
				}
				else if (i < 1000)
				{
					x = i / 100 + i % 100 / 10 * 10 + i % 10 * 100;
				}
				else if (i < 10000)
				{
					x = i / 1000 + i % 1000 / 100 * 10 + i % 100 / 10 * 100 + i % 10 * 1000;
				}
				else
				{
					x = i / 10000 + i % 10000 / 1000 * 10 + i % 1000 / 100 * 100 + i % 100 / 10 * 1000 + i % 10 * 10000;
				}
				if (x == i)
				{
					if (k == 0)
					{
						System.out.printf("%d",i);
					}
					else
					{
						System.out.printf(",%d",i);
					}
					k++;
				}
			}
		}
		if (k == 0)
		{
			System.out.print("no\n");
		}
	}




}

