package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int b;
		int i;
		int j;
		int k;
		int l;
		int x;
		int y;
		int t;
		int r;
		int[] a = new int[100];
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 m = Integer.parseInt(tempVar);
	 }
	 String tempVar2 = ConsoleInput.scanfRead();
	 if (tempVar2 != null)
	 {
		 n = Integer.parseInt(tempVar2);
	 }
	 i = 0;
	 for (k = m;k <= n;)
	 {
		 if (k == 2)
		 {
			 System.out.print("2");
			 k++;
			 i++;
		 }
		 else if (k % 2 == 0)
		 {
			 k++;
		 }
		 else
		 {
			 l = Math.log10(k);
			 for (j = 2;j <= Math.sqrt(k);j++)
			 {
				 x = k % j;
				 if (x == 0)
				 {
					 break;
				 }
			 }
	 if (j <= Math.sqrt(k))
	 {
		 k = k + 2;
		 continue;
	 }
	 else
	 {
		 t = k;
		 for (j = 0;j <= l;j++)
		 {
			 r = t / (Math.pow(10,l - j));
			 a[j] = r;
			 t = t - r * Math.pow(10,l - j);
		 }
	 for (j = 0;j <= l / 2;j++)
	 {
		 if (a[j] != a[l - j])
		 {
			 break;
		 }
	 }
	 if (j <= l / 2)
	 {
		 k = k + 2;
	 }
	 else
	 {
		 if (i == 0)
		 {
			 System.out.printf("%d",k);
		 }
		 else
		 {
			 System.out.printf(",%d",k);
		 }
		 i++;
		 k = k + 2;
	 }
	 }
		 }
	 }
	 if (i == 0)
	 {
		 System.out.print("no");
	 }
	 System.out.print("\n");
	 return 0;
	}
}

