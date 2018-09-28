package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int f = new int(int m,int n);
		int m;
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
			m = Integer.parseInt(tempVar2);
		}
		while (m != 0 && n != 0)
		{
		k = f(m, n);
		System.out.printf("%d\n",k);
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			n = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			m = Integer.parseInt(tempVar4);
		}
		}

	}


	public static int f(int m,int n)
	{
		int k;
		if (n == 1)
		{
			k = 1;
		}
		else
		{
			k = f(m, n - 1);
			k = (k + m % n) % n;
			if (k == 0)
			{
				k += n;
			}
		}
		return k;
	}
}

