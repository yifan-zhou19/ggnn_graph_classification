package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int k;
		int[] f = new int[301];
		int n;
		int m;
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
		while (n * m != 0)
		{
			f[1] = 0;
			for (i = 2;i <= n;i++)
			{
				k = m % i;
				f[i] = (f[i - 1] + k) % i;
			}
			System.out.printf("%d\n",f[n] + 1);
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
}

