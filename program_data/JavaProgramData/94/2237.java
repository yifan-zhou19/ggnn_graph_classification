package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		int b;
		int j;
		int r;
		int i;
		int[] sz = new int[500];
		a = 0;
		int[] num = new int[500];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead(" ");
			if (tempVar2 != null)
			{
				sz[i] = Integer.parseInt(tempVar2);
			}
			if (sz[i] % 2 != 0)
			{
				num[a] = sz[i];
				a++;
			}
		}
		for (j = a;j > 0;j--)
		{
			for (r = 0;r < j;r++)
			{
				if (num[r] > num[r + 1])
				{
					int tmp;
					tmp = num[r + 1];
					num[r + 1] = num[r];
					num[r] = tmp;
				}
			}
		}
		System.out.printf("%d",num[1]);
			for (int i = 2;i < a + 1;i++)
			{
				System.out.printf(",%d",num[i]);
			}
		return 0;
	}
}

