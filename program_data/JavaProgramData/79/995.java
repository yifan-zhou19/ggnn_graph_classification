package <missing>;

public class GlobalMembers
{
	public static void f(int n,int m)
	{
		int i;
		int x = 0;
		for (i = 2;i <= n;i++)
		{
			x = (x + m) % i;
		}
		System.out.printf("%d\n",x + 1);
	}
	public static void Main()
	{
		int[] n = new int[999];
		int[] m = new int[999];
		int k = 0;
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
		while (n[i] != 0 && m[i] != 0)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				n[i + 1] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				m[i + 1] = Integer.parseInt(tempVar4);
			}
			i++;
		}
		k = i;
		for (i = 0;i < k;i++)
		{
			f(n[i], m[i]);
		}
	}

}

