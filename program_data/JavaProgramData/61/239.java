package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[20];
	public static int f(int i)
	{
		if (i == 1 || i == 2)
		{
		   a[i] = 1;
		   return 1;
		}
		else
		{
			a[i] = f(i - 1) + f(i - 2);
			return (f(i - 1) + f(i - 2));
		}
	}
	public static int Main()
	{
		int n;
		int i;
		int b;
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
				b = Integer.parseInt(tempVar2);
			}
			System.out.printf("%d\n",f(b));
		}
		System.in.read();
		System.in.read();
	}
}

