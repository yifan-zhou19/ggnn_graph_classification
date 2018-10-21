package <missing>;

public class GlobalMembers
{
	public static int[] group = new int[1000];
	public static void Main(String[] args)
	{
		int n;
		int i;
		int m;
		int k;
		int j;
		int a = 0;
		int b = 0;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = m;i <= n;i++)
		{
			int num = 0;
			if (i % 2 == 0)
			{
				a = 1;
			}
			else
			{
				for (j = 3;j < i;j++)
				{
					if (i % j == 0)
					{
						a = 1;
						break;
					}
				}
			}
			if (a == 0)
			{
				k = i;
				while (k > 0)
				{
					num = num * 10 + k % 10;
					k = k / 10;
				}
				if (i == num)
				{
					group[b] = i;
					b++;
				}
			}
			a = 0;
		}
		if (group[0] != 0)
		{
			System.out.printf("%d",group[0]);
			for (i = 1;i < j,group[i] != 0;i++)
			{
				System.out.printf(",%d",group[i]);

			}
		}
		else
		{
			System.out.print("no");
		}
	}

}

