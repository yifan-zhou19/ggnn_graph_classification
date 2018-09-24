package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int k;
		int flag = 0;
		int flag2 = 0;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 3;i + 2 <= n;i++)
		{
			flag = 0;
			for (j = 2;j < i;j++)
			{
				if (i % j == 0)
				{
					flag = 1;
					break;
				}
			}
			for (k = 2;k < i + 2;k++)
			{
				if ((i + 2) % k == 0)
				{
					flag = 1;
					break;
				}
			}

			if (flag == 1)
			{
				continue;
			}
			System.out.printf("%d %d\n",i,i + 2);
			flag2 = 3;
		}
		if (flag2 != 3)
		{
			System.out.print("empty\n");
		}
	}
}

