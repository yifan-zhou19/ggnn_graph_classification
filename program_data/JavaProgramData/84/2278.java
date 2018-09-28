package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
		int[] j = new int[n];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				j[i] = Integer.parseInt(tempVar2);
			}
		}
		int M1;
		int M2;
		M1 = 0;
		M2 = 0;
		for (i = 0;i < n;i++)
		{
			if (j[i] >= M1)
			{
				M1 = j[i];
			}
			else
			{
				M1 = M1;
			}
		}
		for (i = 0;i < n;i++)
		{
			if (j[i] >= M2 != 0 && j[i] < M1)
			{
				M2 = j[i];
			}
			else
			{
				M2 = M2;
			}
		}
		System.out.printf("%d\n%d\n",M1,M2);


		return 0;
	}


}

