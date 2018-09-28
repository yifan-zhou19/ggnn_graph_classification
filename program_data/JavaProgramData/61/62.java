package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int n;
	 int i;
	 int j;
	 int[] a = new int[10000];
	 int[] b = new int[10000];
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
		  b[i] = Integer.parseInt(tempVar2);
	  }
	 }
	 a[0] = 1;
	 a[1] = 1;
	 for (i = 0;i < n;i++)
	 {
	  for (j = 2;j <= b[i] - 1;j++)
	  {
	  a[j] = a[j - 1] + a[j - 2];
	  }
	  System.out.printf("%d\n",a[b[i] - 1]);
	 }
	 System.in.read();
	 System.in.read();
	 return 0;
	}



}

