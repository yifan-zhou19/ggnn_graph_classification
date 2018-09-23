package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[20000];
		int i;
		int j;
		int h = 0;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i = i + 1)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		System.out.printf("%d",a[0]);
		for (j = 1;j < n;j = j + 1)
		{
			for (k = 0;k < j;k = k + 1)
			{
				if (a[j] == a[k])
				{
					h = 1;
				}
			}
			if (h == 0)
			{
				System.out.printf(" %d",a[j]);
			}

			else
			{
				h = 0;
			}


		}







	}
}

