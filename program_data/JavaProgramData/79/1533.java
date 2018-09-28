package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int[] h = new int[301];
		int i;
		int k;
		int num;
		int leave;
		int last;
		do
		{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		for (i = 0;i <= n;i++)
		{
			h[i] = 1;
		}
		num = 0;
		k = 0;
		leave = n;
		do
		{
			if (h[num] == 1)
			{
			if (k != m)
			{
				k++;
			}
			else
			{
				k = 1;
				h[num] = 0;
				leave--;
				last = num;
			}
			}
			if (num != n)
			{
				num++;
			}
			else
			{
				num = 1;
			}
		}while (leave > 0);
		if (last > 0)
		{
			System.out.printf("%d\n",last);
		}
		}while (last > 0);
		return (0);
	}
}

