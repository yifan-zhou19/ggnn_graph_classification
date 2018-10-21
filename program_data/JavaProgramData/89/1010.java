package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[30000];
		int i;
		int n;
		int j;
		int sum;
		int biao;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= 29999;i++)
		{
			if (i < n)
			{
				a[i] = 1;
			}
			else
			{
			a[i] = 0;
			}
		}
		i = 29999;
		j = 29999;
		while (i != 0 || j != 0)
		{
			a[i] = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				i = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				j = Integer.parseInt(tempVar3);
			}

		}
		sum = 0;
		for (i = 0;i < 30000;i++)
		{
			sum = sum + a[i];
		}
		biao = 0;
		if (sum = 1)
		{
			for (i = 0;i < 30000;i++)
			{
				if (a[i] == 1)
				{
					System.out.printf("%d",i);
					biao = 1;
				}
			}
		}
		if (biao == 0)
		{
			System.out.print("NOT FOUND");
		}

	}
}

