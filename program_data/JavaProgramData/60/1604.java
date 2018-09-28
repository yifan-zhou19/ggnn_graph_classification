package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int n;
		int k;
		int i;
		int j;
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		t = 0;
		for (a = 2;a <= n;a++)
		{
		k = Math.sqrt(a);
		for (i = 2;i <= k;i++)
		{
			if (a % i == 0)
			{
				break;
			}
		}
			if (a % i == 0)
			{
				continue;
			}
		if (i >= k + 1)
		{
			b = a + 2;
		}
		if (b <= n)
		{
			k = Math.sqrt(b);
		for (j = 2;j <= k;j++)
		{
		if (b % j == 0)
		{
			break;
		}
		}
		if (j >= k + 1)
		{
			System.out.printf("%d %d\n",a,b);
		t = t + 1;
		}
		}
		}
		if (t == 0)
		{
			System.out.print("empty\n");
		}
	return 0;
	}

}

