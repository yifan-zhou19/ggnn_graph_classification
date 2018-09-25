package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] array = new int[10000];
		int i;
		int n;
		int ai;
		int bi;
		int head;
		int tail;
		int sum = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < 10000;i++)
		{
			array[i] = 0;
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				ai = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				bi = Integer.parseInt(tempVar3);
			}
			array[ai]++;
			array[bi]--;
		}
		ai = 0;
		bi = 0;
		while (array[ai] == 0)
		{
			ai++;
		}
		sum = sum + array[ai];
		head = ai;
		ai++;
		while (sum > 0)
		{
			sum += array[ai];
			ai++;
		}
		tail = ai - 1;
		for (i = ai;i < 10000;i++)
		{
			if (array[i] > 0)
			{
				System.out.print("no");
				bi = 1;
				break;
			}
		}
		if (bi == 0)
		{
			System.out.printf("%d %d",head,tail);
		}
		return 0;
	}
}

