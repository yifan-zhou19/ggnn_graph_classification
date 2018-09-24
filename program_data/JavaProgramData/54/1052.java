package <missing>;

public class GlobalMembers
{
	public static int m(int n,int k)
	{
		int i;
		int x = 1;
		int s = n * x + k;
		for (i = 0;i < n - 1;i++)
		{
			if ((n * s) % (n - 1) == 0)
			{
				s = k + (n * s) / (n - 1);
			}
			else
			{
				i = -1;
				x++;
				s = n * x + k;
			}
		}
		return s;
	}
	public static void Main()
	{
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
			k = Integer.parseInt(tempVar2);
		}
		System.out.printf("%d",m(n, k));
	}

}

