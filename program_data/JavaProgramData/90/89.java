package <missing>;

public class GlobalMembers
{
	public static int dudu(int m,int n)
	{
		int f;
		if (m < n)
		{
			n = m;
		}
		if (m == 0 || n == 1)
		{
			f = 1;
		}
		else
		{
			f = dudu(m, n - 1) + dudu(m - n, n);
		}
		return (f);
	}
	public static void Main()
	{
		int m;
		int n;
		int t;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		for (i = 0;i < t;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				n = Integer.parseInt(tempVar3);
			}
			System.out.printf("%d\n",dudu(m, n));
		}
	}
}

