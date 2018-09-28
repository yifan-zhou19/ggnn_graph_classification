package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] shifou = new int[100];
		int a;
		int b;
		int[] shijian = new int[100];
		int i;
		int j = 0;
		int k;
		for (i = 0;i < 100;i++)
		{
			shijian[i] = 0;
		}
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
				a = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b = Integer.parseInt(tempVar3);
			}
			if (a >= 90 && a <= 140 && b >= 60 && b <= 90)
			{
				shifou[i] = 1;
			}
			else
			{
				shifou[i] = 0;
			}
		}
		for (i = 0;i < n;i++)
		{
			if (shifou[i] == 1)
			{
				shijian[j] += 1;
			}
			else
			{
				j++;
			}
		}
		k = j + 1;
		int e;
		for (j = 1;j < k;j++)
		{
			for (i = 0;i < k - j;i++)
			{
				if (shijian[i] < shijian[i + 1])
				{
					e = shijian[i];
					shijian[i] = shijian[i + 1];
					shijian[i + 1] = e;
				}
			}
		}
		System.out.printf("%d",shijian[0]);
		return 0;
	}
}

