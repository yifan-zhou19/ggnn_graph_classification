package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int[] a = new int[500];
		int[] b = new int[500];
		int t;
		int count = 0;
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
				b[i] = 0;
		}

		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (a[i] < a[j])
				{
					t = a[i];
					a[i] = a[j];
					a[j] = t;
				}
			}
		}
	k = 0;
	 for (i = 0;i < n;i++)
	 {
		 if (a[i] % 2 != 0)
		 {
			 b[k] = a[i];
			 k++;
			 count++;
		 }
	 }
	 for (k = 0;k < count;k++)
	 {
		 if (k == 0)
		 {
			 System.out.printf("%d",b[k]);
		 }
		 else
		 {
		 System.out.printf("%c%d",',',b[k]);
		 }
	 }


	return 0;
	}
}

