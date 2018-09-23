package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] num = new int[100];
		int index = 0;
		int sum = 0;
		char c;
	for (;num[0] != -1;)
	{
		while (true)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				num[index++] = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(null, 1);
			if (tempVar2 != null)
			{
				c = tempVar2.charAt(0);
			}
			if (c == '\n')
			{
				break;
			}
		}
	for (int i = 0;i < index;i++)
	{
		for (int j = 0;j < index;j++)
		{
			if (num[i] == (2 * num[j]) || (2 * num[i]) == num[j])
			{
				sum++;
			}
		}
	}
	if (num[0] == -1)
	{
		return 0;
	}
	else
	{
	System.out.printf("%d\n",(sum - 1) / 2);
	}
	sum = 0;
	index = 0;
	}
	return 0;
	}
}

