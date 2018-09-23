package <missing>;

public class GlobalMembers
{
	public static int turn(int a,int b)
	{
		int i;
		int k;
		if (a == 1)
		{
			k = 1;
		}
		else if (a < b)
		{
			k = 0;
		}
		else
		{
			k = 0;
			for (i = b;i <= a;i++)
			{
				if (a % i == 0)
				{
					k = k + turn(a / i, i);
				}
			}
		}
		return k;
	}
	public static int Main()
	{
		int n;
		int i;
		int[] a = new int[1000];
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			t = turn(a[i], 2);
			System.out.printf("%d\n",t);
		}
		return 0;
	}
}

