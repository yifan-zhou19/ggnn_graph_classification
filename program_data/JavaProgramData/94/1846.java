package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int N;
		int i;
		int j;
		int t = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}
		int[] a = new int[500];
		int[] c = new int[500];
		int m = 0;
		for (i = 0;i < N;i++)
		{
						String tempVar2 = ConsoleInput.scanfRead();
						if (tempVar2 != null)
						{
							a[i] = Integer.parseInt(tempVar2);
						}
						if (a[i] % 2 != 0)
						{
									 c[m] = a[i];
									 m++;
						}
		}
		for (i = 0;i < m - 1;i++)
		{
						  for (j = 0;j < m - 1 - i;j++)
						  {
											  if (c[j] > c[j + 1])
											  {
															 t = c[j];
															 c[j] = c[j + 1];
															 c[j + 1] = t;
											  }
						  }
		}
		System.out.printf("%d",c[0]);
		for (i = 1;i < m;i++)
		{
		System.out.printf(",%d",c[i]);
		}
		return 0;
	}
}

