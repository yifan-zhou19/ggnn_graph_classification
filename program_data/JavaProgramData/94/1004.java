package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[500];
		int n;
		int[] b = new int[500];
		b[0] = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 0;i < n;i++)
		{
				 String tempVar2 = ConsoleInput.scanfRead();
				 if (tempVar2 != null)
				 {
					 a[i] = Integer.parseInt(tempVar2);
				 }
		}
		for (int m = 1;m <= n;m++)
		{
				b[m] = 10000;
				for (int j = 0;j < n;j++)
				{
						if (a[j] % 2 == 1 && a[j] > b[m - 1] && a[j] < b[m])
						{
						  b[m] = a[j];
						}
				}
				if (m == 1)
				{
				  System.out.printf("%d",b[m]);
				}
				else if (b[m] != 10000)
				{
				  System.out.printf(",%d",b[m]);
				}
		}
		return 0;
	}
}

