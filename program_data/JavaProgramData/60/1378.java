package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		int b;
		int i;
		int j;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n < 5)
		{
		System.out.print("empty");
		}
		for (i = 3;i <= (n - 2);i++)
		{
			for (j = 2;j <= (Math.sqrt(i));j++)
			{
			if (i % j == 0)
			{
				break;
			}
			}
			if (j > Math.sqrt(i))
			{
			a = i;
			b = a + 2;
			for (k = 2;k <= (Math.sqrt(b));k++)
			{
			if (b % k == 0)
			{
				break;
			}
			}
			if (k > Math.sqrt(b))
			{
			System.out.printf("%d %d\n",a,b);
			}
			}
		}

		return 0;
	}

}

