package <missing>;

public class GlobalMembers
{
	public static final int[] num = {1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000};
	public static int Main()
	{
		int a;
		int b;
		int l1;
		int l2;
		int flag;
		int t;
		int[] res = new int[1000];

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = Integer.parseInt(tempVar2);
		}
		res[0] = 0;
		for (l1 = a;l1 <= b;l1++)
		{
				flag = l1 - 1;
				for (l2 = 2;l2 <= (int)Math.sqrt(l1);l2++)
				{
					if (l1 % l2 == 0)
					{
							flag = 0;
							break;
					}
				}
				if (flag == 0)
				{
					continue;
				}
				t = (int)Math.log10(l1) + 1;
				for (l2 = 1;l2 <= t / 2;l2++)
				{
					if (l1 % num[l2] / num[l2 - 1] != l1 % num[t - l2 + 1] / num[t - l2 + 1 - 1])
					{
							flag = 0;
							break;
					}
				}
				if (flag == 0)
				{
					continue;
				}
				res[0]++;
				res[res[0]] = l1;
		}

		for (l1 = 1;l1 <= res[0] - 1;l1++)
		{
			System.out.printf("%d,",res[l1]);
		}
		if (res[0] == 0)
		{
			System.out.print("no\n");
		}
		else
		{
			System.out.printf("%d\n",res[res[0]]);
		}

		return 0;
	}

}

