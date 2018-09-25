package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int l;
		int a;
		int b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] num = new int[20000];
		int[] res = new int[20000];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				num[i] = Integer.parseInt(tempVar2);
			}
		}
		b = 0;
		k = 0;
		for (i = 0;i < n;i++)
		{
			a = num[i];
			for (j = 0;j <= i;j++)
			{
				if (i == j)
				{
					b = a;
					continue;
				}
				if (a != num[j])
				{
					b = a;
				}
				else
				{
					b = 0;
					break;
				}
			}

			if (b != 0)
			{
				k++;
				res[k] = b;
			}
		}
		for (l = 1;l <= k;l++)
		{
			if (l != k)
			{
				System.out.printf("%d ",res[l]);
			}
			else
			{
				System.out.printf("%d",res[l]);
			}
		}
		return 0;
	}

}

