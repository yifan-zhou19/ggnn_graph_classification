package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		int temp;
		int count = 0;
		int num;
		int sig;
		int t;
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
		for (t = m;t <= n;t++)
		{
			i = t;
		if (i / 10 == 0)
		{
			num = 1;
		}
		else if (i / 100 == 0)
		{
			num = 2;
		}
		else if (i / 1000 == 0)
		{
			num = 3;
		}
		else if (i / 10000 == 0)
		{
			num = 4;
		}
		else
		{
			num = 5;
		}
		for (j = 1,temp = 0;j <= num;j++)
		{
		temp = temp * 10 + i % 10;
		i = i / 10;
		}
		if (t == temp)
		{
			sig = 0;
			for (j = 2;j < t;j++)
			{
			if (t == j * (t / j))
			{
				sig = 1;
			}
			}
			if (sig == 0)
			{
				count = 1;
				System.out.printf("%d",t);
			}
		}
		if (count == 1)
		{
			break;
		}
		}
		if (count == 0)
		{
			System.out.print("no\n");
		}
		else
		{
		for (t = t + 1;t <= n;t++)
		{
			i = t;
		if (i / 10 == 0)
		{
			num = 1;
		}
		else if (i / 100 == 0)
		{
			num = 2;
		}
		else if (i / 1000 == 0)
		{
			num = 3;
		}
		else if (i / 10000 == 0)
		{
			num = 4;
		}
		else
		{
			num = 5;
		}
		for (j = 1,temp = 0;j <= num;j++)
		{
		temp = temp * 10 + i % 10;
		i = i / 10;
		}
		if (t == temp)
		{
			sig = 0;
			for (j = 2;j < t;j++)
			{
			if (t == j * (t / j))
			{
				sig = 1;
			}
			}
			if (sig == 0)
			{
				count = 1;
				System.out.printf(",%d",t);
			}
		}
		}
		}
	}
}

