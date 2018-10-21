package <missing>;

public class GlobalMembers
{
	public static final int N = 30;

	public static int[] a = new int[N];
	public static int[] len = new int[N];

	public static int Main()
	{
		int k;
		int i;
		int j;
		int max;
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
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		len[0] = 1;
		for (i = 1;i < k;i++)
		{
			max = 1;
			for (j = 0;j < i;j++)
			{
				if (a[j] > a[i] && max < len[j])
				{
					max = len[j];
				}
			}
			len[i] = max + 1;
		}
		max = -1;
		for (i = 0;i < k;i++)
		{
			if (max < len[i])
			{
				max = len[i];
			}
		}
		System.out.printf("%d\n",max);
		return 0;
	}
}

