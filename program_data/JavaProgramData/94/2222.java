package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int i;
		int[] num = new int[500];
		int s = 0;
		int[] num1 = new int[500];
		int j;
		int ex;
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 0;i < k;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				num[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < k;i++)
		{
			if (num[i] % 2 == 1)
			{
				num1[s] = num[i];
				s++;
			}
		}
		for (i = 1;i < s;i++)
		{
			for (j = 0;j < s - i;j++)
			{
				if (num1[j] > num1[j + 1])
				{
					ex = num1[j];
					num1[j] = num1[j + 1];
					num1[j + 1] = ex;
				}
			}
		}
		for (t = 0;t < s;t++)
		{
			if (t != 0)
			{
				System.out.print(",");
			}
			System.out.printf("%d",num1[t]);
		}
		return 0;
	}
}

