package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int d = 0;
	 int n;
	 int[] a = new int[100000];
	 int i;
	 int b;
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
	 String tempVar3 = ConsoleInput.scanfRead();
	 if (tempVar3 != null)
	 {
		 b = Integer.parseInt(tempVar3);
	 }
	 for (i = 0;i < n;i++)
	 {

	  if (a[i] != b && d == 0)
	  {
	  System.out.printf("%d",a[i]);
	  a[i] = b;
	  d = 1;
	  }
	  if (a[i] != b)
	  {
	  System.out.printf(" %d",a[i]);
	  }
	 }

	}

}

