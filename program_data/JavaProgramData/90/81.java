package <missing>;

public class GlobalMembers
{
	public static int putapple(int n,int m)
	{
		if (m < n)
		{
			n = m;
		}
		if (n == 1)
		{
			return 1;
		}
		if (m == 0)
		{
			return 1;
		}
		return putapple(n - 1, m) + putapple(n, m - n);
	}

	public static void Main()
	{
		int m;
		int n;
		int k;
		int[] out = new int[20];
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 0;i < k;i++)
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
			out[i] = putapple(n, m);
		}
		for (j = 0;j < k;j++)
		{
			System.out.printf("%d\n",out[j]);
		}
	}
}

