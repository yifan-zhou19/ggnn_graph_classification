package <missing>;

public class GlobalMembers
{
	public static void convert(int n, int[] a)
	{
	 int i;
	 int t;
	 for (i = n;i > 1;i--)
	 {
	  t = a[i];
		 a[i] = a[i - 1];
		 a[i - 1] = t;
	 }
	}
	public static void Main()
	{
	 int m;
	 int n;
	 int i;
	 int j;
	 int[] a = new int[30];
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
	 for (i = 1;i <= m;i++)
	 {
	  String tempVar3 = ConsoleInput.scanfRead();
	  if (tempVar3 != null)
	  {
		  a[i] = Integer.parseInt(tempVar3);
	  }
	 }
	 for (j = 0;j < n;j++)
	 {
	  convert(m, a);
	 }
	 for (i = 1;i <= m;i++)
	 {
		 if (i == m)
		 {
			 System.out.printf("%d",a[i]);
		 }
		 else
		 {
	  System.out.printf("%d ",a[i]);
		 }
	 }
	}
}

