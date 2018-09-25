package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] gao = new int[100];
		int[] di = new int[100];
		int xiaoshi = 0;
		int max = 0;
		int i;
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
				gao[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				di[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (gao[i] >= 90 && gao[i] <= 140 && di[i] >= 60 && di[i] <= 90)
			{
				xiaoshi++;
				if (gao[i + 1] >= 90 && gao[i + 1] <= 140 && di[i + 1] >= 60 && di[i + 1] <= 90)
				{
					continue;
				}
				else
				{
					if (xiaoshi > max)
					{
						max = xiaoshi;
					}
					xiaoshi = 0;
				}
			}
		}
		System.out.printf("%d",max);
		return 0;
	}
}

