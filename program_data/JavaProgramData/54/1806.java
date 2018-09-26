package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int f1 = new int(int m,int n,int k);
		int n;
		int m;
		int i;
		int j;
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
		for (m = 1;;m++)
		{
			j = f1(m, n, k);
			if (j == 1)
			{
				System.out.printf("%d",m);
				break;
			}
		}

	}

	public static int f1(int m,int n,int k)
	{
		int j;
		int r;
		int a;
		int b;
		int jihao = 0;
		int i;
		for (i = 0;i < n;i++)
		{
			a = m % n;
			if (a != k)
			{
				jihao = 1;
				break;
			}
			m = m / n;
			m = m * (n - 1);
		}
		if (m < n - 1)
		{
			jihao = 1;
		}
		if (jihao == 1)
		{
			return 0;
		}
		else
		{
			return 1;
		}

	}
}

