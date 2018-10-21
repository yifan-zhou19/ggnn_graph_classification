package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] a = new int[100];
		int i;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			int[] b = new int[100];
			b[0] = 1;
			b[1] = 1;
			int j;
			for (j = 2;j < 100;j++)
			{
				b[j] = b[j - 1] + b[j - 2];
			}
			System.out.printf("%d\n",b[a[i] - 1]);
		}
		return 0;
	}


}

