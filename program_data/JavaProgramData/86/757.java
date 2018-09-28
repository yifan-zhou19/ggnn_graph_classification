package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i = 0;
		int j = 0;
		int total = 0;
		int n = 0;
		int m = 0;
		int temp = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		for (i = 0; i < n ; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			total = 60;
			for (j = 0;j < m ; j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					temp = Integer.parseInt(tempVar3);
				}
				if (temp > total)
				{
				break;
				}
				if (temp + 3 >= total)
				{
					total = temp;
					break;
				}
				else
				{
					total -= 3;
				}
			}
			System.out.printf("%d\n",total);
			while ((System.in.read()) != '\n')
			{
			continue;
			}
		}

		return 0;
	}
}

