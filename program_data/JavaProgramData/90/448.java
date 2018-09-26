package <missing>;

public class GlobalMembers
{
	public static int apple(int m,int n)
	{
		if (m < n)
		{
			n = m;
		}
		if ((m == 1) || (m == 0) || (n == 1))
		{
			return 1;
		}
		else
		{
			return apple(m, n - 1) + apple(m - n, n);
		}
	}

	public static void Main()
	{
		int i;
		int t;
		int[] m = new int[20];
		int[] n = new int[20];
		int[] answer = new int[20];

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
			answer[i] = apple(m[i], n[i]);
		}

		for (i = 0;i < t;i++)
		{
			System.out.printf("%d\n",answer[i]);
		}

	}
}

