package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] num = new int[20000];
		int[] output = new int[20000];
		int i = 0;
		int n = 0;
		int j = 0;
		int k = 0;
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
			for (j = 0;j < k;j++)
			{
				if (num[i] == output[j])
				{
					num[i] = 0;
				}
			}
			if (num[i] != 0)
			{
				output[k] = num[i];
				k = k + 1;
			}
		}
		for (i = 0;i < (k - 1);i++)
		{
			System.out.printf("%d ",output[i]);
		}
		System.out.printf("%d",output[k - 1]);
		return 0;
	}
}

