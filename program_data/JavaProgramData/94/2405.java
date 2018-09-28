package <missing>;

public class GlobalMembers
{
	public static final int MAXN = 600;

	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] num = new int[MAXN];
		int temp;
		int i;
		int j;
		int index = 0;
		for (i = 0; i < n; ++i)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				temp = Integer.parseInt(tempVar2);
			}
			if (temp % 2 == 1)
			{
			   num[index++] = temp;
			}
		}
		for (i = 0; i < index; ++i)
		{
			for (j = index - 1; j > 0; --j)
			{
				if (num[j] < num[j - 1])
				{
							temp = num[j - 1];
							num[j - 1] = num[j];
							num[j] = temp;
				}
			}
		}
		System.out.printf("%d", num[0]);
		for (i = 1; i < index; ++i)
		{
			System.out.printf(",%d", num[i]);
		}
	}

}

