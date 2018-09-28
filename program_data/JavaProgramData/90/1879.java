package <missing>;

public class GlobalMembers
{
	public static int apple(int a,int b)
	{
		int k = 0;
		if (a == 0 || b == 1)
		{
			k = 1;
		}
		else if (a < b)
		{
			k = apple(a, a);
		}
		else
		{
			k = apple(a, b - 1) + apple(a - b, b);
		}
		return (k);
	}
	public static int Main()
	{
		int t;
		int[] m = new int[2000];
		int[] n = new int[2000];
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		for (i = 0;i < t;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				n[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < t;i++)
		{
			System.out.printf("%d\n",apple(m[i], n[i]));
		}
		return 0;
	}
}

