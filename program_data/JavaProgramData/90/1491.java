package <missing>;

public class GlobalMembers
{
	public static int ways(int a,int b)
	{
		int p;
		if (b == 1 || a == 0 || a == 1)
		{
			return 1;
		}
		else
		{
			if (a < b)
			{
				p = ways(a, a);
			}
			else
			{
			p = ways(a, b - 1) + ways(a - b, b);
			}
		}
		return p;
	}

	public static void Main()
	{
		int[] n = new int[20];
		int[] m = new int[20];
		int t;
		int i;
		int[] k = new int[20];
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
				n[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				m[i] = Integer.parseInt(tempVar3);
			}
			k[i] = ways(n[i], m[i]);
		}
		for (i = 0;i < t;i++)
		{
			System.out.printf("%d\n",k[i]);
		}
	}
}

