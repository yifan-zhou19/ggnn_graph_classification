package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int[] m = new int[1000];
		int[] n = new int[1000];
		int i;
		int a;
		int b;
		int x;
		int sum;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		sum = 0;
		for (i = 0;i < k;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				n[i] = Integer.parseInt(tempVar3);
			}
			for (a = 0;a < m[i];a++)
			{
				for (b = 0;b < n[i];b++)
				{
					String tempVar4 = ConsoleInput.scanfRead();
					if (tempVar4 != null)
					{
						x = Integer.parseInt(tempVar4);
					}
					if (a == 0 || b == 0 || a == m[i] - 1 || b == n[i] - 1)
					{
						sum += x;
					}
				}
			}
			System.out.printf("%d\n",sum);
			sum = 0;
		}
		return 0;
	}

}

