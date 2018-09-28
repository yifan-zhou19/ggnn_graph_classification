package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] num = new int[20002];
		int a;
		int b;
		int max = 0;
		int min = 10000;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b = Integer.parseInt(tempVar3);
			}
			if (min > a)
			{
				min = a;
			}
			if (max < b)
			{
				max = b;
			}
			for (j = 2 * a;j <= 2 * b;j++)
			{
				num[j] = 1;
			}
		}
		int total = 1;
		for (i = 2 * min;i <= 2 * max;i++)
		{
			total = total * num[i];
		}
		if (total == 0)
		{
			System.out.print("no\n");
		}
		else
		{
			System.out.printf("%d %d\n",min,max);
		}
		return 0;
	}
}

