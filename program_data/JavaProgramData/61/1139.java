package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int[] a = new int[1000];
		int[] b = new int[21];

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
		b[1] = 1;
		b[2] = 1;
		for (j = 3;j <= 20;j++)
		{
			b[j] = b[j - 1] + b[j - 2];
		}


		for (i = 0;i < n;i++)
		{
			System.out.printf("%d\n",b[a[i]]);
		}
		return 0;
	}



}

