package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a;
		int n;
		int i;
		int f = int x;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		a = new int[n];
		for (i = 0;i < n;i++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a[i] = Integer.parseInt(tempVar2);
		}
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%d\n",f(a[i]));
		}

	}
	 public static int f(int x)
	 {
			if (x == 1 || x == 2)
			{
			return (1);
			}
			else
			{
			return (f(x - 1) + f(x - 2));
			}
	 }

}

