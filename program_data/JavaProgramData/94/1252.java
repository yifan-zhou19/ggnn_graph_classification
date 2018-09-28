package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		void maopao(int n,int a[]);
		int[] shuzu1 = new int[500];
		int[] shuzu2 = new int[500];
		int n;
		int i;
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
				(shuzu1[i]) = Integer.parseInt(tempVar2);
			}
		}
		for (i = j = 0;i < n;i++)
		{
			if (shuzu1[i] % 2 == 1)
			{
				shuzu2[j] = shuzu1[i];
				j++;
			}
		}
		maopao(j, shuzu2);
		for (i = 0;i < j - 1;i++)
		{
			System.out.printf("%d,",shuzu2[i]);
		}
		System.out.printf("%d\n",shuzu2[j - 1]);
		return 0;
	}

	public static void maopao(int n, int[] a)
	{
		int i;
		int j;
		int temp;
		for (i = 0;i < n - 1;i++)
		{
			for (j = 0;j < n - 1 - i;j++)
			{
				if (a[j] > a[j + 1])
				{
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
	}
}

