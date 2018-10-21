package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		int b;
		int[] r = new int[10001];
		int i;
		for (i = 0;i <= 10000;i++)
		{
			r[i] = 0;
		}
		int head;
		int tail;
		int max = 0;
		char d = 'y';
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
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
			if (b > r[a])
			{
				r[a] = b;
			}
		}
		for (i = 0;i <= 10000;i++)
		{
			if (r[i] != 0)
			{
				head = i;
				tail = r[i];
				break;
			}
		}
		for (i = 0;i <= 10000;i++)
		{
			if (r[i] > max)
			{
				max = r[i];
			}
		}

		for (i = head;i <= max;i++)
		{
			if (r[i] != 0)
			{
				if (i > tail)
				{
					d = 'n';
					break;
				}
					if (tail < r[i])
					{
						tail = r[i];
					}
			}
		}
		if (d == 'y')
		{
			System.out.printf("%d %d",head,tail);
		}
		if (d == 'n')
		{
			System.out.print("no");
		}
		return 0;
	}

}

