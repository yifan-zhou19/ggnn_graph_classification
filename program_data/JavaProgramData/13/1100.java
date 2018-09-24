package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int p;
		int q;
		int m;
		int[] a = new int[20000];
		int[] b = new int[20000];


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

		b[0] = 0;




		for (j = 1;j < n;j++)
		{
			b[j] = 0;
			for (k = 0;k < j;k++)
			{
				if (a[j] == a[k])
				{
					b[j]++;
				}
			}

		}

		System.out.printf("%d",a[0]);

		for (p = 1;p < n;p++)
		{
			if (b[p] == 0)
			{
				System.out.printf(" %d",a[p]);
			}
		}




		return 0;
	}


}

