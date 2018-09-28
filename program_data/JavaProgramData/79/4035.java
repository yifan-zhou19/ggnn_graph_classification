package <missing>;

public class GlobalMembers
{
	public static int monkey(int n1, int m1)
	{
		int[] res = new int[301];
		int k;
		res[0] = 0;
		res[1] = 0;
		for (k = 2;k <= n1;k++)
		{
		res[k] = (res[k - 1] + m1) % k;
		}
		return res[n1] + 1;
	}
	public static int Main()
	{
		int[] m = new int[301];
		int[] n = new int[301];
		int j;
		int i = 0;
		while (true)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n[i] = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m[i] = Integer.parseInt(tempVar2);
			}
			if (m[i] == 0 && n[i] == 0)
			{
				break;
			}
			i++;
		}
		for (j = 0;j < i;j++)
		{
			System.out.printf("%d\n",monkey(n[j], m[j]));
		}
		return 0;
	}

}

