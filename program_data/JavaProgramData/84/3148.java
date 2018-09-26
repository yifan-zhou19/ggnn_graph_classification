package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		int[] n = new int[100];
		int i;
		for (i = 0;i < a;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n[i] = Integer.parseInt(tempVar2);
			}
		}
		int max = n[0];
		int j;
		for (j = 1;j < a;j++)
		{
			if (n[j] > max)
			{
				max = n[j];
			}
		}
		System.out.printf("%d",max);
		int next = n[0];
		int q;
		for (q = 1;q < a;q++)
		{
			if (n[q] >= next != 0 && n[q] < max)
			{
				next = n[q];
			}
		}
		System.out.printf("\n%d\n",next);
		return 0;
	}

}

