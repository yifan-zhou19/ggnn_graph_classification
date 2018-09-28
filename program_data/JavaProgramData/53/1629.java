package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] num = new int[100];
		int n = 0;
		int i = 0;
		int j = 0;
		int k = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (i < n)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				num[i] = Integer.parseInt(tempVar2);
			}
			i++;
		}
		for (i = 0;i < n;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				if (num[i] == num[j] && num[i] != -1)
				{
					num[j] = -1;
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			if (num[i] == -1)
			{
				continue;
			}
			else
			{
			if (i == 0)
			{
			System.out.printf("%d",num[i]);
			}
			else
			{
				System.out.printf(",%d",num[i]);
			}
			}
		}
		return 0;
	}

}

