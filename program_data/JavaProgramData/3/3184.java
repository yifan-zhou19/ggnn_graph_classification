package <missing>;

public class GlobalMembers
{
	public static int f(int x, int[] a, int y)
	{
		int i;
		int j;
		int k;
		for (i = 0;i < y;i++)
		{
			if (x == a[i])
			{
				return i;
			}
			if (i >= y - 1)
			{
				return -1;
			}
		}
	}
	public static int Main()
	{
		int i;
		int x;
		int y;
		int n;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		int[] a = new int[n];
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			x = f(a[i], a, n);
			y = f(k - a[i], a, n);
			if (x != y && x != -1 && y != -1)
			{
				System.out.print("yes\n");
				break;
			}
			if (i >= n - 1)
			{
				System.out.print("no\n");
			}
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(a);
		return 0;
	}
}

