package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i = 0;
		int j = 0;
		int f = 0;
		int[] re = new int[100000];
		int flag = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			f = 0;
			for (j = 1;j <= i / 2;j++)
			{
				if (i % j != 0)
				{
					f++;
				}
			}
				if (f == i / 2 - 1)
				{
					re[i - 1] = i;
				}

		}
		for (i = 1;i <= n;i = i + 2)
		{
			if ((re[i - 1] != 0) && (re[i + 1] != 0))
			{
				System.out.printf("%d %d\n",re[i - 1],re[i + 1]);
			}
			else
			{
				flag++;
			}
		}
		if (flag >= (n + 1) / 2)
		{
			System.out.print("empty\n");
		}

	}

}

