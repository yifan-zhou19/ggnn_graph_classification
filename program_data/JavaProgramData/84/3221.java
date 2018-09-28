package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	 int[] a = new int[100];
	 int i;
	 int max = 0;
	 int smax = 0;
	 int n;
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
	 for (i = 0;i < n;i++)
	 {
		if (a[i] > max)
		{
		 max = a[i];
		}
	 }
	 for (i = 0;i < n;i++)
	 {
		if ((a[i] > smax) && (a[i] != max))
		{
		  smax = a[i];
		}
	 }
	 System.out.printf("%d\n",max);
	 System.out.printf("%d\n",smax);
	}
}

