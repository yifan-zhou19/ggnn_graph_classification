package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int m;
		int j;
		int data;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1; i <= n; i++)
		{
			int sum = 0;
			int flag = 1;
			int num = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			for (j = 1; j <= m ; j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					data = Integer.parseInt(tempVar3);
				}
				if (data + num >= 60 && flag != 0)
				{
					sum = 60 - num;
					flag = 0;
				}
				num += 3;
				if (data + num >= 60 && flag != 0)
				{
					sum = data;
					flag = 0;
				}

			}
			if (sum == 0)
			{
				sum = 60 - num;
			}
			System.out.printf("%d\n",sum);

		}
		return 0;
	}
}

