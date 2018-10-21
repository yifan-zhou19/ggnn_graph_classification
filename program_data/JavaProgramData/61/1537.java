package <missing>;

public class GlobalMembers
{
	public static int F(int a)
	{
		int result;
		int i;
		int[] st = new int[20];
		st[0] = 0;
		st[1] = 1;
		for (i = 2;i <= a;i++)
		{
			st[i] = st[i - 1] + st[i - 2];
		}
		result = st[a];
		return result;
	}
	public static int Main()
	{
		int n;
		int a;
		int i;
		int[] sz = new int[20];
		int result;
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
				a = Integer.parseInt(tempVar2);
			}

			result = F(a);
			System.out.printf("%d\n",result);
		}
		return 0;
	}
}

