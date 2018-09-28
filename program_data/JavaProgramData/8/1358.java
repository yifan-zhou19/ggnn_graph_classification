package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int input = new int(int a,int b);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		input(m, n);
	}

	public static int input(int a,int b)
	{
		int[] c = new int[1000];
		int[] d = new int[1000];
		for (int i = 0;i < a;i++)
		{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			c[i] = Integer.parseInt(tempVar);
		}
		}
		for (int j = 0;j < b;j++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			d[j] = Integer.parseInt(tempVar2);
		}
		}
		int sort = new int(int e[],int s);
		sort(c, a);
		System.out.print(" ");
		sort(d, b);
	}
	public static int sort(int[] e, int s)
	{
		int temp;
		for (int r = 0;r < s - 1;r++)
		{
			for (int q = r + 1;q < s;q++)
			{
				if (e[r] > e[q])
				{
				temp = e[r];
				e[r] = e[q];
				e[q] = temp;
				}
			}
		}
		for (int p = 0;p < s - 1;p++)
		{
			System.out.printf("%d ",e[p]);
		}
			System.out.printf("%d",e[s - 1]);

	}
}

