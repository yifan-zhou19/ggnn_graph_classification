package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int N;
		int[] b = new int[30];
		int[] a = new int[30];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= N;i++)
		{
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 a[i] = Integer.parseInt(tempVar2);
		 }
		}
		b[1] = 1;
		for (i = 2;i <= N;i++)
		{
			 int m = 0;
			for (int j = 1;j < i;j++)
			{
				 if (a[j] >= a[i])
				 {
					 if (m < b[j])
					 {
						 m = b[j];
					 }

				 }

			}
			 b[i] = m + 1;
		}
		 int max = 0;
		for (i = 1;i <= N;i++)
		{
			 if (max < b[i])
			 {
				 max = b[i];
			 }
		}
		System.out.printf("%d\n",max);
	}
}

