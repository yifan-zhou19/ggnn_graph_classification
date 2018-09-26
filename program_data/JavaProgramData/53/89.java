package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int j;
		int[] num = new int[301];
		int p;
		int i;
		int n;
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
		for (i = 0;i < n;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				if (num[i] == num[j])
				{
					for (p = 0;p < n - j - 1;p++)
					{
						num[j + p] = num[j + p + 1];
					}
					n--;
					j--;
				}
			}
		}
		System.out.printf("%d",num[0]);
		for (i = 1;i < n;i++)
		{
			System.out.printf(",%d",num[i]);
		}
	}
}

