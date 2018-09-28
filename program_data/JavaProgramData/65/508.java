package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int n;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 int i;
	 int[] a = new int[n];
	 int[] b = new int[n];
	 int m = 0;
	 int j = 0;
	 for (i = 0;i < n;i++)
	 {
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  a[i] = Integer.parseInt(tempVar2);
	  }
	  String tempVar3 = ConsoleInput.scanfRead();
	  if (tempVar3 != null)
	  {
		  b[i] = Integer.parseInt(tempVar3);
	  }
	  if (a[i] == b[i])
	  {
	  }
	  else if (a[i] == b[i] - 1 || a[i] == b[i] + 2)
	  {
	   m++;
	  }
	  else
	  {
	   j++;
	  }
	 }
	 if (m > j)
	 {
	  System.out.print("A");
	 }
	 else if (m == j)
	 {
	  System.out.print("Tie");
	 }
	 else
	 {
	  System.out.print("B");
	 }
	return 0;
	}
}

