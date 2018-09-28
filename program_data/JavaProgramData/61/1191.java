package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m = 25;
		int i;
		int j;
		int[] a = new int[30];
		int[] b = new int[30];
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

		b[0] = 1;
		b[1] = 1;
		b[2] = 2;
		for (j = 3;j < m;j++)
		{
			b[j] = b[j - 1] + b[j - 2];
		}

		   for (i = 0;i < n;i++)
		   {
		   System.out.printf("%d\n",b[a[i] - 1]);
		   }

		   return 0;
	}
}

