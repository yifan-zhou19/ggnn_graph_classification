package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[100000];
		int[] b = new int[100000];
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i < 100000;i++)
		{
			if (i == 1)
			{
				b[i] = 1;
			}
			if (i == 2)
			{
				b[i] = 1;
			}
			if (i > 2)
			{
				b[i] = b[i - 2] + b[i - 1];
			}
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			j = a[i];
			System.out.printf("%d\n",b[j]);

		}



		return 0;







	}

}

