package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[300];
		int i;
		int[] b = new int[300];
		int j;
		int m;
		int k = 0;
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
		b[0] = a[0];
		System.out.printf("%d",b[0]);
		for (i = 1;i < n;i++)
		{
			m = 0;
			for (j = 0;j < k + 1;j++)
			{
				if (a[i] == b[j])
				{
					m = 1;
					break;
				}
			}
			if (m == 0)
			{

				k = k + 1;
				b[k] = a[i];
					if (k != 0)
					{
						System.out.printf(",%d",b[k]);
					}
			}
		}
		return 0;
	}






}

