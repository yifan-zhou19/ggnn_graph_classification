package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int k;
		int i;
		int j;
		int[] h = new int[25];
		int[] n = {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		int num;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 0;i < k;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				h[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = k - 2;i >= 0;i--)
		{
			for (j = i + 1;j < k;j++)
			{
				if (h[i] >= h[j] != 0 && n[i] < n[j] + 1)
				{
					n[i] = n[j] + 1;
				}
			}
		}
		num = n[0];
		for (i = 0;i < k;i++)
		{
			if (num < n[i])
			{
				num = n[i];
			}
		}
		System.out.printf("%d",num + 1);

	}

}

