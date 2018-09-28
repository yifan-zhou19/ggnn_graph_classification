package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int m;
		int n;
		int i;
		int j;
		int[] p = new int[100];
		int t;
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
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				p[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = n - 1;i >= 0;i--)
		{
		   p[i + m] = p[i];
		}
		for (j = n - 1 + m;j >= n;j--)
		{
			p[j - n] = p[j];
		}
		System.out.printf("%d",p[0]);
		for (t = 1;t < n;t++)
		{
			System.out.printf(" %d",p[t]);
		}
	}

}

