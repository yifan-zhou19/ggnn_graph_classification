package <missing>;

public class GlobalMembers
{
	public static int f(int n)
	{
		if (n == 1 || n == 2)
		{
			return 1;
		}
		else
		{
			return f(n - 1) + f(n - 2);
		}
	}
	public static void Main()
	{
		int n;
		int i;
		int[] shu = new int[100];
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
				shu[i] = Integer.parseInt(tempVar2);
			}
			System.out.printf("%d\n",f(shu[i]));
		}
	}
}

