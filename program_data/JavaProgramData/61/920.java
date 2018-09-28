package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 int n;
		 int i;
		 int j;
		 int m;
		 int[] a = new int[999];
		 for (i = 0;i < 999;i++)
		 {
		 a[i] = 0;
		 }
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
				  m = Integer.parseInt(tempVar2);
			  }
			  a[0] = 1;
			  a[1] = 1;
			  for (j = 2;j < m;j++)
			  {
			  a[j] = a[j - 2] + a[j - 1];
			  }
			  System.out.printf("%d\n",a[m - 1]);
		 }
	}
}

