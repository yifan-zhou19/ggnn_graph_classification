package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int[] a = new int[60];
		int[] b = new int[100];
		int i;
		int j;
		int time = 0;
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
				m = Integer.parseInt(tempVar2);
			}
			if (m == 0)
			{
				b[i] = 60;
				continue;
			}
			for (j = 0;j < m;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[j] = Integer.parseInt(tempVar3);
				}
			}
			for (j = 0;j < m;j++)
			{
				 time = a[j] + 3 * (j + 1);
				 if (time < 60 && j == m - 1)
				 {
					 b[i] = 60 - 3 * m;
					 break;
				 }
				 if (time >= 60 && time < 63)
				 {
					 b[i] = a[j];
					 break;
				 }
				 if (time >= 63)
				 {
					 b[i] = 60 - 3 * j;
					 break;
				 }
			}
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%d\n",b[i]);
		}
		return 0;
	}
}

