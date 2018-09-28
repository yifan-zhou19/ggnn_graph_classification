package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 int n;
		 int k = 1;
		 int i;
		 int[] a = new int[6];
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 n = Integer.parseInt(tempVar);
		 }
		 while (n != 0)
		 {
				a[k] = n % 10;
				n = (n - a[k]) / 10;
				k = k + 1;
		 }
		 for (i = 1;i <= k - 1;i++)
		 {
							System.out.printf("%d",a[i]);
		 }
		 //int q;
		 //scanf("%d",&q);
		 //printf("%d",q);
		 return 0;

	}

}

