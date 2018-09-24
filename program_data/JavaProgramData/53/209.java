package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] mm = new int[301];
		int i;
		int n;
		int j;
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
				mm[i] = Integer.parseInt(tempVar2);
			}
		}

		for (i = 0;i < n;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				if (mm[j] == mm[i])
				{
					mm[j] = 0;
				}
			}
		}

		for (i = 0;i < n;i++)
		{
			if (mm[i] != 0 && i == 0)
			{
			System.out.printf("%d", mm[i]);
			}
			else if (mm[i] != 0 && i > 0)
			{
			System.out.printf(",%d", mm[i]);
			}
			else
			{
				;
			}
		}
	}

}

