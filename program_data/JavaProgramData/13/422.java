package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[20010];

	public static void Main()
	{
		int n;
		int i;
		int tmp;
		int k;
		int ii = 0;
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
				tmp = Integer.parseInt(tempVar2);
			}
			int j;
			int flag = 0;
			for (j = 0;j < i;j++)
			{
				if (a[j] == tmp)
				{
					flag = 1;
				}
			}
			if (flag == 0)
			{
				a[ii] = tmp;
				ii++;
				//printf("%d\n",tmp);
			}

		}
		for (k = 0;k < ii - 1;k++)
		{
			System.out.printf("%d ",a[k]);
		}
		System.out.printf("%d",a[ii - 1]);

	}

}

