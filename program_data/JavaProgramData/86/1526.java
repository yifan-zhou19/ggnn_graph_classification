package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct sutdent
	//	{
	//		int faulttimes,fault[100],total,timespace[200];
	//	}
	//	data[100];
		for (i = 0;i < 100;i++)
		{
			data[i].faulttimes = 0;
			for (j = 0;j < 100;j++)
			{
				data[i].fault[j] = 0;
			}
			data[i].total = 60;
			for (j = 1;j < 200;j++)
			{
				data[i].timespace[j] = 1;
			}
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
				data[i].faulttimes = tempVar2;
			}
			if (data[i].faulttimes == 0)
			{
				continue;
			}
			else
			{
				for (j = 0;j < data[i].faulttimes;j++)
				{
					String tempVar3 = ConsoleInput.scanfRead();
					if (tempVar3 != null)
					{
						data[i].fault[j] = tempVar3;
					}
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			if (data[i].faulttimes == 0)
			{
				continue;
			}
			else
			{
				for (j = 0;j < data[i].faulttimes;j++)
				{
					data[i].timespace[data[i].fault[j] + 1 + 3 * j] = 0;
					data[i].timespace[data[i].fault[j] + 2 + 3 * j] = 0;
					data[i].timespace[data[i].fault[j] + 3 + 3 * j] = 0;
				}
				for (k = 1;k <= 60;k++)
				{
					if (data[i].timespace[k] == 0)
					{
						data[i].total--;
					}
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%d\n",data[i].total);
		}

		return 0;
	}
}

