package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int[] shu = new int[100];
		int i;
		int j;
		int a = 0;
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
				shu[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 1;i < 3;i++)
		{
			for (j = 0;j < n - i;j++)
			{
				if (shu[j] > shu[j + 1])
				{
					a = shu[j];
					shu[j] = shu[j + 1];
					shu[j + 1] = a;
				}
			}
		}
		for (i = 1;i < 3;i++)
		{
			System.out.printf("%d\n",shu[n - i]);
		}
	}

}

