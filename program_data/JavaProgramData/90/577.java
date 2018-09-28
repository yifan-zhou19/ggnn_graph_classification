package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int put = new int(int m,int n);
		int i;
		int t;
		int m;
		int n;
		int[] d = new int[10];
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
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				n = Integer.parseInt(tempVar3);
			}
			d[i] = put(m, n);
		}
		for (i = 0;i < t;i++)
		{
			System.out.printf("%d\n",d[i]);

		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			i = Integer.parseInt(tempVar4);
		}
			return 0;
	}
	public static int put(int m,int n)
	{

	int k = 0;
		if (m <= 1 || n <= 1)
		{
			k = 1;
		}
		else
		{
			if (m >= n)
			{
				k = put(m - n, n);
			}

				k += put(m, n - 1);

		}
		return k;

	}

}

