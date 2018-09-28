package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 int count;
		 int m = 0;
		 int n;
		 int i;
		 int j;
		 int k;
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 n = Integer.parseInt(tempVar);
		 }
		 int[] sz = new int[N];
		 int[] a = new int[N];
		 int[] b = new int[N];
		 for (i = 0;i < n;i++)
		 {
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
		 }
		 for (i = 0;i < n;i++)
		 {
			if (a[i] >= 90 && a[i] <= 140 && b[i] >= 60 && b[i] <= 90)
			{
				count = 1;
				for (j = i + 1;j < n;j++)
				{
					 if (a[j] >= 90 && a[j] <= 140 && b[j] >= 60 && b[j] <= 90)
					 {
						  count++;
					 }
					 else
					 {
						  break;
					 }
				}
				sz[m] = count;
				m++;
			}
		 }
		 for (i = 0;i < m - 1;i++)
		 {
			if (sz[i] > sz[i + 1])
			{
				k = sz[i];
				sz[i] = sz[i + 1];
				sz[i + 1] = k;
			}
		 }
		 System.out.printf("%d",sz[m - 1]);
		 return 0;
	}
}

