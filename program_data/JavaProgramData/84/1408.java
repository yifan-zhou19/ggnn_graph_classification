package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int[] a = new int[100];
	 int n;
	 int i;
	 int s;
	 int j;
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
	 }
	 int max = -10000;
	 for (s = 0;s < n;s++)
	 {
		 if (max < a[s])
		 {
			 max = a[s];
		 }
	 }
	 int secondMax = 0;
	 for (j = 0;j < n;j++)
	 {
		 if (secondMax < a[j] && a[j] < max)
		 {
			 secondMax = a[j];
		 }
	 }
	 System.out.printf("%d\n",max);
	 System.out.printf("%d",secondMax);
	 return 0;
	}
}

