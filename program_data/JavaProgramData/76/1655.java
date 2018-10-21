package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 int n;
		 int[] a = new int[50000];
		 int[] b = new int[50000];
		 int[] m = new int[10000];
		 int max;
		 int min;
		 int sum = 0;
		 int i;
		 int j;
		 int k;
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 n = Integer.parseInt(tempVar);
		 }
		 for (i = 1;i <= n;i++)
		 {
				 String tempVar2 = ConsoleInput.scanfRead();
				 if (tempVar2 != null)
				 {
					 a[i] = Integer.parseInt(tempVar2);
				 }
				 String tempVar3 = ConsoleInput.scanfRead();
				 if (tempVar3 != null)
				 {
					 b[i] = Integer.parseInt(tempVar3);
				 }
		 }
		 for (i = 1;i <= 10000;i++)
		 {
				 m[i] = 0;
		 }
		 for (j = 1;j <= n;j++)
		 {
				 for (k = a[j] + 1;k <= b[j];k++)
				 {
						 m[k] = 1;
				 }
		 }
		 max = 1,min = 10000;
		 for (i = 1;i <= 10000;i++)
		 {
				 if (m[i] == 1)
				 {
							 if (i < min)
							 {
									   min = i;
							 }
							 if (i > max)
							 {
									   max = i;
							 }
				 }
		 }
		 for (j = min;j <= max;j++)
		 {
				 if (m[j] == 0)
				 {
							 sum++;
				 }
		 }
		 if (sum == 0)
		 {
					System.out.printf("%d %d",min - 1,max);
		 }
			else
			{
				System.out.print("no");
			}

		 return 0;
	}


}

