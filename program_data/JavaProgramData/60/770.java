package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int a;
		int b;
		int k;
		int c = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 3;i <= (n - 2);i += 2)
		{
			a = Math.sqrt(i);
			b = Math.sqrt(i + 2);
			for (j = 2;j <= a;j++)
			{
				if (i % j == 0)
				{
					break;
				}
			}
			for (k = 2;k <= b;k++)
			{
				if ((i + 2) % k == 0)
				{
					break;
				}
			}
			if (j == (a + 1) && k == (b + 1))
			{
				c++;
				System.out.printf("%d %d\n",i,i + 2);
			}
		}
		if (c == 0 || (n <= 1 && n <= 4))
		{
			System.out.print("empty");
		}
		return 0;
	}











}

