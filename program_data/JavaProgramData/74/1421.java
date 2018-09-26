package <missing>;

public class GlobalMembers
{
	public static int su(int n)
	{
		int i;
		for (i = 2;i < n;i++)
		{
		if (n % i == 0)
		{
		break;
		}
		}
		if (i == n)
		{
		return 1;
		}
		else
		{
		return 0;
		}
	}
	public static int hui(int n,int k,int m)
	{
		if (k == 0)
		{
		if (m == n)
		{
		return 1;
		}
		else
		{
		return 0;
		}
		}
		else
		{
		return hui(n, k / 10, m * 10 + k % 10);
		}
	}
	public static int Main()
	{
		int i;
		int m;
		int n;
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
		if (su(i) != 0 && hui(i, i, 0) != 0)
		{
			System.out.printf("%d",i);
			break;
		}
		}
		if (i > n)
		{
		System.out.print("no");
		}
		else
		{
		for (i = i + 1;i <= n;i++)
		{
		if (su(i) != 0 && hui(i, i, 0) != 0)
		{
		System.out.printf(",%d",i);
		}
		}
		}
	}

}

