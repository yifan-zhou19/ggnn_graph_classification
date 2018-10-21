package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] a = new int[100];
		int[] b = new int[100];
		int[][] c = new int[100][100];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				k = Integer.parseInt(tempVar2);
			}

			for (j = 0,a[i] = 60;j < k;j++)
			{

				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					c[i][j] = Integer.parseInt(tempVar3);
				}
			b[i] = c[i][j] + 3 * j + 3;

			if (b[i] <= 60)
			{
				a[i] -= 3;
			}
			 else if (b[i] >= 63)
			 {
				a[i] = a[i];
			 }
			else
			{
				a[i] = c[i][j];
			}
			}
		System.out.printf("%d\n",a[i]);
		}
		return 0;
	}

}

