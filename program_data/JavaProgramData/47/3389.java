package <missing>;

public class GlobalMembers
{
	  public static int Main()
	  {
	  int n;
	  int i;
	  int q;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  int[] a = new int[100];
	  for (i = 1;i <= n;i++)
	  {
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 a[i] = Integer.parseInt(tempVar2);
		 }
	  }
	  for (q = n;q > 1;q--)
	  {
	  System.out.printf("%d", a[q]);
	  System.out.print(" ");
	  }
	  System.out.printf("%d", a[1]);
				return 0;
	  }
}

