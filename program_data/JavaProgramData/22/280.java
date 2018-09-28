package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[1000];
		int i;
		int j;
		int n = 0;
		int t;
		int f = 0;
	 for (i = 0;;i++)
	 {
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 a[i] = Integer.parseInt(tempVar);
		 }
	  n += 1;
	  if (System.in.read() == '\n')
	  {
		  break;
	  }
	 }
	 for (i = 0;i < n;i++)
	 {
		 for (j = i + 1;j < n;j++)
		 {
			 if (a[i] < a[j])
			 {
				 t = a[i];
				 a[i] = a[j];
				 a[j] = t;
			 }
		 }
	 }
	 for (i = 0;i < n;i++)
	 {
	 if (a[0] > a[i])
	 {
		 System.out.printf("%d\n",a[i]);
	  f = 1;
	  break;
	 }
	 }
	 if (f == 0)
	 {
		 System.out.print("No\n");
	 }
	}
}

