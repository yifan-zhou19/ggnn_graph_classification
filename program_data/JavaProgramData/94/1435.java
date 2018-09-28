package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[500];
		int[] b = new int[500];
		int i;
		int n;
		int t;
		int j;
		int k;
		int s;
		int min;
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
		j = 0;
		for (i = 0;i < n;i++)
		{
						 if (a[i] % 2 == 1)
						 {
							 b[j] = a[i];
							 j++;
							 t = j;
						 }
		}
		for (j = 0;j < t;j++)
		{
						 min = b[j];
						 s = j;
						 for (k = j + 1;k < t;k++)
						 {
							 if (b[k] < b[s])
							 {
								 min = b[k];
								 s = k;
							 }
						 }
						 if (min < b[j])
						 {
							 b[s] = b[j];
							 b[j] = min;
						 }

		}
		System.out.printf("%d",b[0]);
		for (j = 1;j < t;j++)
		{
			System.out.printf(",%d",b[j]);
		}
	  return 0;
	}
}

