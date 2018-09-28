package <missing>;

public class GlobalMembers
{
	public static int yk(int a, int b)
	{
		int result1;
		if (b > 1)
		{
			result1 = yk(a, b - 1) + qm(a - b, b);
			return result1;
		}

		if (b == 1)
		{
			return 1;
		}
		if (b <= 0)
		{
		return 0;
		}
	}
	public static int qm(int a, int b)
	{
		int result2;
		if (a > 1)
		{
			result2 = qm(a - b, b) + yk(a, b - 1);
			return result2;
		}
		if (a == 1 || a == 0)
		{
			return 1;
		}
		if (a < 0)
		{
			return 0;
		}

	}
	public static int Main()
	{
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		int[] m = new int[100];
		int[] n = new int[100];
		int i;
		int[] result = new int[100];
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
			result[i] = yk(m[i], n[i] - 1) + qm(m[i] - n[i], n[i]);
		}
		for (i = 0;i < t;i++)
		{
			System.out.printf("%d\n",result[i]);
		}
		return 0;
	}












}

