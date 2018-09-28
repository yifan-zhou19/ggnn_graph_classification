package <missing>;

public class GlobalMembers
{
	public static int p(int n)
	{
		int i;
		int flag = 0;
		for (i = 2;i <= Math.sqrt(n);i++)
		{
			if (n % i == 0)
			{
				flag = 1;
				break;
			}
		}
		return flag;
	}
	public static int rever(int n)
	{
		int i = 0;
		int[] a = new int[30];
		int m;
		int flag = 0;
		while (n > 9)
		{
			a[i] = n % 10;
			n = (n - a[i]) / 10;
			i++;
		}
		a[i] = n;
		m = i + 1;
		for (i = 0;i < m / 2;i++)
		{
			if (a[i] != a[m - 1 - i])
			{
				flag = 1;
				break;
			}
		}
		return flag;
	}
	public static void Main()
	{
		int n1;
		int n2;
		int i;
		int j = 0;
		int[] m = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n1 = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n2 = Integer.parseInt(tempVar2);
		}
		for (i = n1;i <= n2;i++)
		{
			if (p(i) == 0 && rever(i) == 0)
			{
				m[j++] = i;
			}
		}
		if (j == 0)
		{
			System.out.print("no\n");
		}
		else
		{
		for (i = 0;i < j - 1;i++)
		{
			System.out.printf("%d,",m[i]);
		}
		System.out.printf("%d\n",m[i]);
		}
	}

}

