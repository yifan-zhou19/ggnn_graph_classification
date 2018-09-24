package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] grapes = new int[100000]; //????
		int k;
		int[] pg = grapes;
		int n;
		int i;
		int j;

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
				pg + i = tempVar2;
			}
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			k = Integer.parseInt(tempVar3);
		}

		for (i = 0;i < n;i++) //???k????
		{
			if (k == pg[i])
			{
				if (k == pg[i + 1])
				{
					for (j = i;j < n;j++)
					{
						pg[j] = (pg + j + 2);
					}
					n -= 2;
				}
				else
				{
					for (j = i;j < n;j++)
					{
						pg[j] = (pg + j + 1);
					}
					n--;
				}
				i--;
			}
		}

		System.out.printf("%ld",pg[0]); //????
		for (i = 1;i < n;i++)
		{
			System.out.printf(" %ld",pg[i]);
		}
	}

}

