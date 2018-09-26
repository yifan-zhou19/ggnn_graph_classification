package <missing>;

public class GlobalMembers
{
	public static int[] n = new int[100];
	public static void Main()
	{
		int x;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		int i;
		for (i = 0;i <= x - 1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n[i] = Integer.parseInt(tempVar2);
			}
		}
		void m(int a,int n[100]);
		m(x, n);
		System.out.printf("%d\n",n[0]);
		System.out.printf("%d\n",n[1]);
	}
	public static void m(int a, int[] n)
	{
		int j;
		for (j = 0;j <= a - 2;j++)
		{
			int k;
			for (k = 0;k <= a - 2 - j;k++)
			{
				if (n[k] < n[k + 1])
				{
					int l;
					l = n[k];
					n[k] = n[k + 1];
					n[k + 1] = l;
				}
			}
		}
	}
}

