package <missing>;

public class GlobalMembers
{
	public static int hw(int i)
	{
		int[] w = new int[20];
	 int n = 1;
	 int m;
	 int j;
	 int flag = 7;
	 while (i > 0)
	 {
		 w[n] = fmod(i,10);
	  i = i / 10;
	  n++;
	 }
	 for (i = 1;i <= n;i++)
	 {
		 if (w[i] != w[n - i])
		 {
			 flag = 0;
		 }
	 }
	 return flag;
	}
	public static int Main()
	{
		int i;
		int j;
		int k;
		int l;
		int n;
		int m;
		int[] a = new int[170657];
		int count = 0;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 m = Integer.parseInt(tempVar);
	 }
	 String tempVar2 = ConsoleInput.scanfRead(" ");
	 if (tempVar2 != null)
	 {
		 n = Integer.parseInt(tempVar2);
	 }
	 a[1] = 100;
	 for (i = 2;i < n;i++)
	 {
		 if (a[i] == 0)
		 {
			 for (j = i + i;j <= n;j = j + i)
			 {
				 a[j]++;
			 }
		 }
	 }
	 for (i = m;i <= n;i++)
	 {
		 if ((a[i] == 0) && (hw(i) == 7))
		 {
		 if (count == 0)
		 {
			 ;
			 count++;
			 System.out.printf("%d",i);
		 }
										else
										{
											System.out.printf(",%d",i);
										}
		 }
	 }
	 if (count == 0)
	 {
		 System.out.print("no");
	 }
	 return 7;
	}

}

