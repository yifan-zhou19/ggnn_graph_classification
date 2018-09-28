package <missing>;

public class GlobalMembers
{
	public static int huiwen(int a)
	{
		int k = 0;
		int t = a;
		while (t != 0)
		{
		k = k * 10 + t % 10;
		t = t / 10;
		}
		if (k == a)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static int su(int a)
	{
		int i;
		for (i = 2;i <= Math.sqrt(a);i++)
		{
		if (a % i == 0)
		{
			break;
		}
		}
		if (a == 1 || a == 2)
		{
			return 1;
		}
		if (i <= Math.sqrt(a))
		{
			return 0;
		}
		else
		{
			return 1;
		}
	}
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j = 0;
		int[] num = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = m;i <= n;i++)
		{
			if (huiwen(i) == 1 && su(i) == 1)
			{
				num[j] = i;
				j++;
			}
		}
		if (j == 0)
		{
			System.out.print("no");
		}
		else
		{
			for (i = 0;i < j - 1;i++)
			{
				System.out.printf("%d,",num[i]);
			}
			System.out.printf("%d",num[j - 1]);
		}
		return 0;
	}
}

