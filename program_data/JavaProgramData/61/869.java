package <missing>;

public class GlobalMembers
{
	public static int f(int i)
	{
	 int[] a = new int[20];
	 if (i == 0)
	 {
	 return 1;
	 }
	 else if (i == 1)
	 {
	 return 1;
	 }
	 else
	 {
	 a[i] = f(i - 1) + f(i - 2);
	 return a[i];
	 }
	}
	public static int Main()
	{
	 int n;
	 int i;
	 int[] b = new int[20];
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 for (int k = 0;k < n;k++)
	 {
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  b[k] = Integer.parseInt(tempVar2);
	  }
	  System.out.printf("%d\n",f(b[k] - 1));

	 }

	}
}

