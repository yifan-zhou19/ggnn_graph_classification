package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int w;
		int k;
		int[] a = new int[310];
		int[] b = new int[310];
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
				a[i] = Integer.parseInt(tempVar2);
			}
		}

		k = 1;
		for (i = 0;i < n;i++)
		{
			w = 1;
			if (i == 0)
			{
				b[0] = a[0]; //????????
			}
			else if (i != 0)
			{
				for (j = 0;j < i;j++)
				{
					if (a[j] == a[i])
					{
					w = 0; //??????????????????w?0
					}
				}
				if (w != 0) //???????????????????
				{
					b[k] = a[i];
					k++;
				}
			}
		}
		n = k - 1;
		for (i = 0;i < n;i++)
		{
		System.out.printf("%d,",b[i]);
		}
		System.out.printf("%d",b[n]);
	}


}

