package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int N;
		int i;
		int j;
		int head;
		int tail;
		int flag;
		int maxr;
		int a;
		int b;
		int[] r = new int[10002];

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}

		for (i = 0;i < 10001;i++)
		{
			r[i] = 0;
		}

		maxr = 0;
		for (i = 0;i < N;i++)
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
			if (r[a] < b)
			{
				r[a] = b;
			}
			if (maxr < b)
			{
				maxr = b;
			}
		}

		i = 1;
		while (r[i] == 0)
		{
			i++;
		}
		head = i;
		tail = r[i];

		flag = 0;
		for (i = 1;i <= maxr;i++)
		{
			if (tail < i)
			{
				break;
			}
			if (r[i] > tail)
			{
				tail = r[i];
			}
		}
		if (tail == maxr)
		{
			flag = 1;
		}
		if (flag == 0)
		{
			System.out.print("no");
		}
		if (flag == 1)
		{
			System.out.printf("%d %d\n",head,tail);
		}
		System.in.read();
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			N = Integer.parseInt(tempVar4);
		}
	}

}

