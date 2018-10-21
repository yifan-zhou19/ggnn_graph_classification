package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 int n;
		 int i;
		 int j;
		 int k = 0;
		 int[] x = new int[310];
		 int[] y = new int[310];

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
				 x[i] = Integer.parseInt(tempVar2);
			 }
		 }

		 y[0] = x[0];
		 k++;
		 for (i = 1;i < n;i++)
		 {
			 for (j = 0;j < k;j++)
			 {
				 if (x[i] == y[j])
				 {
					 break;
				 }
			 }
			 if (j == k)
			 {
				 y[k] = x[i];
				 k++;
			 }
		 }
		 System.out.printf("%d",y[0]);
		 for (i = 1;i < k;i++)
		 {
			 System.out.printf(",%d",y[i]);

		 }

		 return 0;
	}
}

