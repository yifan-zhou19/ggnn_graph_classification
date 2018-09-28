package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int a;
		int[] num = new int[300];
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
				num[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n - 1;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				if (num[i] == num[j])
				{
					num[j] = 10000;
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			if (num[i] != 10000)
			{
				System.out.printf("%d",num[i]);
			}
			a = i;
			break;
		}
		for (j = a + 1;j < n;j++)
		{
			if (num[j] != 10000)
			{
				System.out.printf(",%d",num[j]);
			}
		}
	}

}

