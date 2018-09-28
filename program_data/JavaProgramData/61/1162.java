package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int[] a = new int[21];
		int[] b = new int[21];
		int j;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			b[1] = 1;
			b[2] = 1;
			for (j = 3;j <= a[i];j++)
			{
			 b[j] = b[j - 1] + b[j - 2];
			}
			System.out.printf("%d\n",b[a[i]]);
		}
	}

}

