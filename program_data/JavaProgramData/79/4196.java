package <missing>;

public class GlobalMembers
{
	// ???.cpp : ??????????????
	//


	public static int yuesefu(int m, int n)
	{
		int leave = 1;
		for (int i = 2;i <= n;i++)
		{
			int j = ((m - 1) % i + leave-1) % (i - 1) + 1;
			if (j >= (m - 1) % i + 1)
			{
			  leave = j + 1;
			}
			else
			{
			leave = j;
			}
		}
		return leave;

	}
	public static int Main()
	{
		int[] monkeys = new int[300];
		int[] tmp = new int[300];
		for (int i = 0;i < 300;i++)
		{
			tmp[i] = monkeys[i] = i;
		}
		int key;
		int num;
		int i = 0;
		while (true)
		{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			num = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			key = Integer.parseInt(tempVar2);
		}
		if (key == 0)
		{
			break;
		}
		int final = yuesefu(key, num);
		if (i++ != 0)
		{
			System.out.print("\n");
		}
		System.out.printf("%d",final);

		}
		return 0;
	}

}

