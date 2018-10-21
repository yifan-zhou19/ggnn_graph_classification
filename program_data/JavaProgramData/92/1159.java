package <missing>;

public class GlobalMembers
{
	public static int[] speed = new int[1024];
	public static int[] ano = new int[1024];

	public static int fight(int myId, int anoId)
	{
		if (speed[myId] < ano[anoId])
		{
			return -1;
		}
		else if (speed[myId] == ano[anoId])
		{
			return 0;
		}
		else
		{
			return 1;
		}
	}

	public static int Main()
	{
		int n;
		while (scanf("%d", n) == 1 && n != 0)
		{
			int sum = 0;
			for (int i = 0; i < n; ++i)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					speed + i = tempVar;
				}
			}
			for (int i = 0; i < n; ++i)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					ano + i = tempVar2;
				}
			}
			sort(speed, speed + n);
			sort(ano, ano + n);
			int myLow = 0;
			int myHigh = n - 1;
			int anoLow = 0;
			int anoHigh = n - 1;
			while (myLow <= myHigh)
			{
				if (speed[myLow] > ano[anoLow])
				{
					sum += fight(myLow, anoLow);
					++myLow, ++anoLow;
				}
				else if (speed[myLow] < ano[anoLow])
				{
					sum += fight(myLow, anoHigh);
					++myLow, --anoHigh;
				}
				else if (speed[myHigh] > ano[anoHigh])
				{
					sum += fight(myHigh, anoHigh);
					--myHigh, --anoHigh;
				}
				else if (speed[myHigh] <= ano[anoHigh])
				{
					sum += fight(myLow, anoHigh);
					++myLow, --anoHigh;
				}
			}
			System.out.printf("%d\n", sum * 200);
		}
	}
}

