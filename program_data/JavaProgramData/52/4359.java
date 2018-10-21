package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		void move(int x,int y[]);
		int i;
		int m;
		int n;
		int[] a = new int[100];
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
		for (i = 1;i <= n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i - 1] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 1;i <= m;i++)
		{
			move(n, a);
		}
		System.out.printf("%d",a[0]);
		for (i = 2;i <= n;i++)
		{
			System.out.printf(" %d",a[i - 1]);
		}
	}

	public static void move(int x, int[] y)
	{
		int i;
		int t;
		t = y[x - 1];
		for (i = 1;i <= x - 1;i++)
		{
			y[x - i] = y[x - 1 - i];
		}
		y[0] = t;

	}
}

