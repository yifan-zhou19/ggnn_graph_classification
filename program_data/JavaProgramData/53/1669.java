package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i = 0;
		int j = 0;
		int flag = 0;
		int[] str = new int[300];
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
				str[i] = Integer.parseInt(tempVar2);
			}
		}
		i = 1;
		System.out.printf("%d",str[0]);
		for (i = 1;i < n;i++)
		{
			j = 0;
			flag = 0;
			for (j = 0;j < i;j++)
			{
				if (str[i] == str[j])
				{
				flag = 1;
				}

			}
			if (flag == 0)
			{
				System.out.printf(",%d",str[i]);
			}

		}
		return 0;
	}
}

