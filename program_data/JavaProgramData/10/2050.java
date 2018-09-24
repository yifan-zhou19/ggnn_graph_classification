package <missing>;

public class GlobalMembers
{
	public static int N;
		public static int[] a = {2100000000, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
	public static void Main()
	{

		int f = int x;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= N;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}

		 System.out.printf("%d",f(0) - 1);
	}
	public static int f(int x)
	{
		int i;
		int p;
		int y = 0;
		for (i = x + 1;i <= N;i++)
		{
			if (a[i] <= a[x])
			{
				p = f(i);
				y = (y >= p != 0?y:p);
			}
		}
		return (y + 1);
	}

}

