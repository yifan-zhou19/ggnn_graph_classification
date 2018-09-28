package <missing>;

public class GlobalMembers
{
	public static int f(int m,int n)
	{
		int i;
		int k = 0;
		for (i = 2;i <= n;i++)
		{
			k = ((m % i) + k) % i;
		}
		return k;
	}
	public static int Main()
	{
		int[] m = new int[100];
		int[] n = new int[100];
		int i = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n[i] = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m[i] = Integer.parseInt(tempVar2);
		}
		i++;
		while (n[i - 1] != 0 || m[i - 1] != 0)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				n[i] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				m[i] = Integer.parseInt(tempVar4);
			}
			i++;
		}

		for (int j = 0;j < i - 1;j++)
		{
			System.out.printf("%d\n",f(m[j], n[j]) + 1);
		}
			return 0;
	}

}

