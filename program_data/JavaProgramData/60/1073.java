package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int flag;
		int count;
		int n;
		int i;
		int j;
		int[] k = new int[100000];
		int flagg;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		for (i = 0;i < n;i++)
		{
		k[i] = 0;
		}

		i = 2;
		count = 0;
		flag = 0;
		while (i <= n)
		{
			for (j = 2;j <= i - 1;j++)
			{
				if (i % j == 0)
				{
					flag = 1;
					break;
				}
				if (i % j != 0)
				{
					flag = 0;
				}
			}
			if (0 == flag)
			{
				k[count] = i;
				count++;
			}
			i++;
		}
		flagg = 0;
		for (i = 0;i <= count;i++)
		{
			if (k[i] == k[i + 1] - 2)
			{
				System.out.printf("%d %d\n",k[i],k[i + 1]);
				flagg = 1;
			}
		}
		if (flagg == 0)
		{
				System.out.print("empty\n");
		}
	}


}

