package <missing>;

public class GlobalMembers
{
	public static int su(int m)
	{
		int i;
		int k;
		k = Math.sqrt(m);
		for (i = 2;i <= k;i++)
		{
			if (m % i == 0)
			{
				break;
			}
		}
		if (i > k)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static void Main()
	{
		int n;
		int i;
		int j;
		int k = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 5;i <= n;i++)
		{
			if (su(i) == 1 && su(i - 2) == 1)
			{
				System.out.printf("%d %d\n",i - 2,i);
				k++;
			}
		}
		if (k == 0)
		{
			System.out.print("empty\n");
		}
	}


}

