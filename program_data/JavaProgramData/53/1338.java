package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[300];
		int[] b = new int[300];
		int n;
		int i;
		int j;
		int k = 1;
		int x;
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
		b[0] = a[0];
		for (i = 1;i < n;i++)
		{
			x = 0;
			for (j = 0;j < k;j++)
			{
				if (a[i] == b[j])
				{
	//				printf("%d %d\n",i,j);
					x = 1;
					break;
				}
			}
			if (x == 0)
			{
				b[k] = a[i];
				k++;
			}
	//		printf("%d\n",k);
		}
		for (i = 0;i < k - 1;i++)
		{
			System.out.printf("%d,",b[i]);
		}
		System.out.printf("%d\n",b[k - 1]);
		return 0;
	}





}

