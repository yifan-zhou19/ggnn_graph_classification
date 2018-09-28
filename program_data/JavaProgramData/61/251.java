package <missing>;

public class GlobalMembers
{
	public static int f(int x)
	{
		int s;
		if (x == 1 || x == 2)
		{
			s = 1;
		}
		else
		{
			s = f(x - 1) + f(x - 2);
		}
		return s;
	}
	public static int Main()
	{
		int n;
		int i;
		int[] a = new int[25];
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
			if (a[i] == 1 || a[i] == 2)
			{
				System.out.print("1\n");
			}
			else
			{
				System.out.printf("%d\n",f(a[i]));
			}
		}
	}

}

