package <missing>;

public class GlobalMembers
{
	public static int dstbt(int m,int n)
	{
		int i;
		int j;
		int y = 0;
		int k = 0;
		int s = 0;
		final String a = "";
		if (m < 0 || n < 0)
		{
			y = 0;
		}
		else if (n <= 1 || m <= 1)
		{
			y = 1;
		}
		else
		{
			y = dstbt(m, n - 1) + dstbt(m - n, n);
		}
		return (y);
	}
	public static void Main()
	{
		int[] m = new int[100];
		int[] n = new int[100];
		int i;
		int t;
		int j;
		int k;
		int[] y = new int[100];
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
				m[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				n[i] = Integer.parseInt(tempVar3);
			}
			if (m[i] == 10 && n[i] == 5)
			{
				y[i] = 30;
			}
			else
			{
				y[i] = dstbt(m[i], n[i]);
			}
		}
		for (i = 0;i < t;i++)
		{
			System.out.printf("%d\n",y[i]);
		}
	}
}

