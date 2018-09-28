package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int feb = int x;
		int n;
		int i;
		int j;
		int[] a = new int[1000];
		int f;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a[i] = Integer.parseInt(tempVar2);
		}
		}
		for (j = 0;j < n;j++)
		{
		f = feb(a[j]);
		System.out.printf("%d\n",f);
		}
		System.in.read();
		System.in.read();
	}
	public static int feb(int x)
	{
		int i;
		int[] a = new int[x + 1];
		a[1] = 1;
		a[2] = 1;
		for (i = 3;i <= x;i++)
		{
		a[i] = a[i - 1] + a[i - 2];
		}
		return (a[x]);
	}
}

