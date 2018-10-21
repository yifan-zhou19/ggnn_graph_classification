package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int qiuyu = new int(int n,int k,int m);
		int n;
		int k;
		int i;
		int m;
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
			i = qiuyu(n, k, m);
			if (i == n)
			{
				System.out.printf("%d\n",m);
				break;
			}
		}
	}
	public static int qiuyu(int n,int k,int m)
	{
		int i;
		int l;
		l = m;
		for (i = 0;i < n;i++)
		{
			if ((l % n == k) && (l / n > 0))
			{
				l = l - k - (l - k) / n;
			}
			else
			{
				break;
			}
		}
		return (i);
	}
}

