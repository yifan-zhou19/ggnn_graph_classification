package <missing>;

public class GlobalMembers
{
	public static int depart(int x,int y)
	{
		int i;
		int total;
		int t;
		for (total = 1;;total++)
		{
			t = total;
			for (i = 0;;i++)
			{
				if ((t % x == y) && (t / x > 0))
				{
					t = t / x * (x - 1);
				}
				else
				{
					break;
				}
				if (i == x - 1)
				{
					return total;
				}
			}
		}
	}

	public static void Main()
	{
		int n;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		int sum;
		sum = depart(n, k);
		System.out.printf("%d",sum);
	}
}

