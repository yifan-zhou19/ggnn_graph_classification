package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int[] histgram = new int[101];
		int i;
		int x;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0; i < 101; i++)
		{
			histgram[i] = 0;
		}

		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			x = Integer.parseInt(tempVar2);
		}
		histgram[x]++;
		System.out.printf("%d",x);

		for (i = 0; i < n - 1; i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				x = Integer.parseInt(tempVar3);
			}
			if (histgram[x] == 0)
			{
				System.out.printf(" %d",x);
			}
			histgram[x]++;
		}

	}
}

